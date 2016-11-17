/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entity.*;
import Dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author DANA
 */
public class ExamPage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        System.out.println("INSIDE EXAMPAEGE.java");
        ArrayList<Exam> exams;
        ExmDao examDao = new ExmDao();
        CourseDao courseDao = new CourseDao();

        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        Connection conn = (Connection) session.getAttribute("conn");
        if (tracker.equals("teacher")) {
            System.out.println("INSIDE TEACHER LOGIC");
            if (courseDao.findCourseByTeacherId(teacher.getTeacherId(), courseId, conn)) {
                System.out.println("INIDE COURSE TEAHER LOGIC");
                exams = (ArrayList<Exam>)examDao.getExamsByCourseId(courseId, conn);
                //if (exams.contains(Object o)) System.out.println("HMM nUll it is");
                 for (Exam e : exams) {
                    System.out.println("INSIDE EXAM LOOP");
                    String startDateString = e.getStartTime();
                    //String endDateString = e.getEndTime();
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                   
                    Date startDate,endDate;
                    Date currentDate = new Date();
                    System.out.print(df.format(currentDate)+" --> ");
                    String newDateString="",newDateString2="";
                    try {
                        startDate = df.parse(startDateString);
                        //endDate = df.parse(endDateString);
                        newDateString = df.format(startDate);
                        //newDateString2 = df.format(endDate);
                        
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(startDate);
                        calendar.add(Calendar.MINUTE,200);
                        endDate = calendar.getTime();
                        if (currentDate.before(startDate) && !e.getTitle().equals("no data available"))
                            e.setStatus("upcoming");
                        else if (currentDate.getTime() > endDate.getTime() && !e.getTitle().equals("no data available"))
                            e.setStatus("finished");
                        else if (!e.getTitle().equals("no data available"))
                            e.setStatus("ongoing");
                    } catch (Exception e2) {
                        System.out.println("INSIDE THE EXCEPTION");
                        e2.printStackTrace();
                    }
                }
                
               
                Course course = courseDao.getCourseById(courseId, conn);
                request.setAttribute("exams", exams);
                request.setAttribute("courseTitle", course.getTitle());
                session.setAttribute("course", course);
                RequestDispatcher rd = request.getRequestDispatcher("ExamPage.jsp");
                rd.forward(request, response);
            } else {
                System.out.println("inside login.jsp exception");
                response.sendRedirect("login.jsp");
            }
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
