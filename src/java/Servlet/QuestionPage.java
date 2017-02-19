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
public class QuestionPage extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
        int examId = Integer.parseInt(request.getParameter("examId"));
        ExmDao exmDao = new ExmDao();

        HttpSession session = request.getSession();
        Connection conn = (Connection) session.getAttribute("conn");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        String tracker = (String) session.getAttribute("tracker");
        Exam e = exmDao.getExamById(examId, conn);
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
                        calendar.add(Calendar.MINUTE,e.getDuration());
                        endDate = calendar.getTime();
                        if (currentDate.before(startDate) && !e.getTitle().equals("no data available"))
                            e.setStatus("upcoming");
                        else if (currentDate.getTime() > endDate.getTime() && !e.getTitle().equals("no data available"))
                            e.setStatus("finished");
                        else 
                            e.setStatus("ongoing");
                    } catch (Exception e2) {
                        System.out.println("INSIDE THE EXCEPTION");
                        e2.printStackTrace();
                    }
        //
        session.setAttribute("exam", e);
        System.out.println("Exam Info -> " + exmDao.getExamById(examId, conn).getTitle());
        CourseExamDao courseExamDao = new CourseExamDao();
        CourseDao courseDao = new CourseDao();

        boolean flag = false;

        System.out.println("Exam Id " + examId);

        if (tracker.equals("teacher")) {
            List<Course> courses = courseExamDao.findCourseByExamId(examId, conn);
            for (Course cr : courses) {
                System.out.println(cr.getTitle());
            }
            for (Course cr : courses) {
                if (courseDao.findCourseByTeacherId(teacher.getTeacherId(), cr.getCourseId(), conn)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                response.sendRedirect("login.jsp");
            } else {
                QuestionDao questionDao = new QuestionDao();
                List<Question> questions = questionDao.getQuestionByExamId(examId, conn);
                String courseSession = (String) session.getAttribute("courseSession");
                Course course = (Course) session.getAttribute("course");
                String courseTitle = course.getTitle();
                Exam exam = (Exam) session.getAttribute("exam");
                String examTitle = exam.getTitle();
                String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
                for (Question q : questions) {
                    q.setPath(path + "Q" + q.getQuestionId() + "\\" + q.getQuestionFileName());
                    System.out.println("path --> " + q.getPath());
                }
                session.setAttribute("questions", questions);
                RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
                rd.forward(request, response);
            }
        } else {
            response.sendRedirect("login.jsp");
        }
        }
        catch(Exception e){
        response.sendRedirect("login.jsp");
        };
        
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
        try{
            int examId = Integer.parseInt(request.getParameter("examId"));
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        String tracker = session.getAttribute("tracker").toString();
        Connection conn = (Connection) session.getAttribute("conn");
        Student student = (Student) session.getAttribute("student");
        ExmDao examDao = new ExmDao();
        session.setAttribute("exam", examDao.getExamById(examId, conn));
        StudentExamDao studentExamDao = new StudentExamDao();
        boolean verified = examDao.VerifyExamPassword(password, examId, conn);

        if (tracker.equals("") || tracker == null) {
            response.sendRedirect("login.jsp");
        } else if (verified == false) {
            RequestDispatcher rd = request.getRequestDispatcher("ExamPage.jsp");
            rd.forward(request, response);
        } else if (tracker.equals("student")) {
            if (studentExamDao.getExamStudentIsAllowed(conn, student.getStudentId(), examId) == 1) {
                QuestionDao questionDao = new QuestionDao();
                List<Question> questions = questionDao.getQuestionByExamId(examId, conn);
                String courseSession = (String) session.getAttribute("courseSession");
                Course course = (Course) session.getAttribute("course");
                String courseTitle = course.getTitle();
                //Exam exam = (Exam) session.getAttribute("exam");
                Exam exam = examDao.getExamById(examId, conn);
                String examTitle = exam.getTitle();
                String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
                for (Question q : questions) {
                    q.setPath(path + "Q" + q.getQuestionId()+ "\\" + q.getQuestionFileName());
                    System.out.println("path --> " + q.getPath());
                }
                //
                 String startDateString = exam.getStartTime();
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
                        calendar.add(Calendar.MINUTE,exam.getDuration());
                        endDate = calendar.getTime();
                        if (currentDate.before(startDate) && !exam.getTitle().equals("no data available"))
                            exam.setStatus("upcoming");
                        else if (currentDate.getTime() > endDate.getTime() && !exam.getTitle().equals("no data available"))
                            exam.setStatus("finished");
                        else 
                            exam.setStatus("ongoing");
                    } catch (Exception e2) {
                        System.out.println("INSIDE THE EXCEPTION");
                        e2.printStackTrace();
                    }
                //
                session.setAttribute("exam", exam);
                request.setAttribute("questions", questions);
                RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
                rd.forward(request, response);
            } else {
                List<Question> questions = new ArrayList<Question>();
                request.setAttribute("questions", questions);
                studentExamDao.setEntered(conn, student.getStudentId(), examId);
                RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
                rd.forward(request, response);
            }
        } else {

            QuestionDao questionDao = new QuestionDao();
            List<Question> questions = questionDao.getQuestionByExamId(examId, conn);
            String courseSession = (String) session.getAttribute("courseSession");
            Course course = (Course) session.getAttribute("course");
            String courseTitle = course.getTitle();
            Exam exam = (Exam) session.getAttribute("exam");
            String examTitle = exam.getTitle();
            String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
            for (Question q : questions) {
                q.setPath(path + "Q" + q.getQuestionId()+ "\\" + q.getQuestionFileName());
                System.out.println("path --> " + q.getPath());
            }
            request.setAttribute("questions", questions);
            RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
            rd.forward(request, response);

        }
        }
        catch(Exception e ){
            response.sendRedirect("login.jsp");
        }
        

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
