/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.*;
import Entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 *
 * @author DANA
 */
public class AddNewExam extends HttpServlet {

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
        String password = request.getParameter("password");
        String title = request.getParameter("title");
        String startTime = request.getParameter("startTime");
        String duration = request.getParameter("duration");
        int score = Integer.parseInt(request.getParameter("score"));
        ExmDao examDao = new ExmDao();
        HttpSession session = request.getSession();
        Connection conn = (Connection) session.getAttribute("conn");
        Course course = (Course) session.getAttribute("course");
         String tracker = (String) session.getAttribute("tracker");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        Student student=(Student) session.getAttribute("student");
        examDao.addExam(password,title,startTime,duration,score,course.getCourseId(),conn);
        System.out.println(password+" "+title+" ");
        CourseDao courseDao = new CourseDao();
        ArrayList<Exam> exams;
        if (tracker.equals("teacher")) {
            System.out.println("INSIDE TEACHER LOGIC");
            
            if (courseDao.findCourseByTeacherId(teacher.getTeacherId(), course.getCourseId(), conn)) {
                System.out.println("INIDE COURSE TEAHER LOGIC");
                exams = (ArrayList<Exam>)examDao.getExamsByCourseId(course.getCourseId(), conn);
                //if (exams.contains(Object o)) System.out.println("HMM nUll it is");
                 for (Exam e : exams) {
                    System.out.println("INSIDE EXAM LOOP");
                    String startDateString = e.getStartTime();
                    //String endDateString = e.getEndTime();
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                   
                    java.util.Date startDate,endDate;
                    java.util.Date currentDate = new java.util.Date();
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
                
               
                course = courseDao.getCourseById(course.getCourseId(), conn);
                String courseSession = (String) session.getAttribute("courseSession");
                //String questionPath = "F:\\Rafi\\My_Projects\\SUST_OnlineJudge\\web\\Questions\\" + courseSession + "\\" + course.getTitle() + "\\" + title + "\\";
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
        else{
            response.sendRedirect("login.jsp");
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
