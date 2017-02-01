/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.ExmDao;
import Entity.Course;
import Entity.Exam;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DANA
 */
public class EditExamPage extends HttpServlet {

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
        String examId = request.getParameter("examId");
        String action = request.getParameter("action");
        System.out.println(examId);
        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        if (tracker.equals("teacher")) {
            request.setAttribute("examId", Integer.parseInt(examId));
            if (action.equals("1")) {
                RequestDispatcher rd = request.getRequestDispatcher("EditExamPage.jsp");
                rd.forward(request, response);
            } else {
                ExmDao exmDao = new ExmDao();
                Connection conn = (Connection) session.getAttribute("conn");
                exmDao.deleteByExamId(Integer.parseInt(examId), conn);
                Course course = (Course) session.getAttribute("course");
                ArrayList<Exam> exams;
                exams = (ArrayList<Exam>) exmDao.getExamsByCourseId(course.getCourseId(), conn);
                request.setAttribute("exams", exams);
                request.setAttribute("courseTitle", course.getTitle());
                RequestDispatcher rd = request.getRequestDispatcher("ExamPage.jsp");
                rd.forward(request, response);
            }
        }
        else {
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
        String examTitle = request.getParameter("title");
        String password = request.getParameter("password");
        String date = request.getParameter("date");
        String duration = request.getParameter("duration");
        String score = request.getParameter("score");
        System.out.println(examId + " " + examTitle + " " + password);
        ExmDao exmDao = new ExmDao();
        HttpSession session = request.getSession();
        Connection conn = (Connection) session.getAttribute("conn");
        String tracker = (String) session.getAttribute("tracker");
        if (tracker.equals("teacher")) {
            exmDao.updateExam(password, examTitle, date, duration, Integer.parseInt(score), examId, conn);
            Course course = (Course) session.getAttribute("course");
            ArrayList<Exam> exams;
            exams = (ArrayList<Exam>) exmDao.getExamsByCourseId(course.getCourseId(), conn);
            request.setAttribute("exams", exams);
            request.setAttribute("courseTitle", course.getTitle());
            RequestDispatcher rd = request.getRequestDispatcher("ExamPage.jsp");
            rd.forward(request, response);
        } else {
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
