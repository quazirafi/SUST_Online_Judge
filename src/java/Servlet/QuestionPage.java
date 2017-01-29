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
        int examId = Integer.parseInt(request.getParameter("examId"));
        ExmDao exmDao = new ExmDao();

        HttpSession session = request.getSession();
        Connection conn = (Connection) session.getAttribute("conn");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        String tracker = (String) session.getAttribute("tracker");
        session.setAttribute("exam", exmDao.getExamById(examId, conn));
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
                String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + examTitle + "\\";
                for (Question q : questions) {
                    q.setPath(path + "Q" + q.getQuestionId() + "\\" + q.getQuestionFileName());
                    System.out.println("path --> " + q.getPath());
                }
                request.setAttribute("questions", questions);
                RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
                rd.forward(request, response);
            }
        } else {
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
                Exam exam = (Exam) session.getAttribute("exam");
                String examTitle = exam.getTitle();
                String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + examTitle + "\\";
                for (Question q : questions) {
                    q.setPath(path + "Q" + q.getCounter() + "\\" + q.getQuestionFileName());
                    System.out.println("path --> " + q.getPath());
                }
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
            String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + examTitle + "\\";
            for (Question q : questions) {
                q.setPath(path + "Q" + q.getCounter() + "\\" + q.getQuestionFileName());
                System.out.println("path --> " + q.getPath());
            }
            request.setAttribute("questions", questions);
            RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
            rd.forward(request, response);

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
