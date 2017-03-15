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
public class ToSubmissionPage extends HttpServlet {

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
        try{
        HttpSession session = request.getSession();
        String courseSession = Integer.toString((int)session.getAttribute("courseSession"));
        Course course = (Course) session.getAttribute("course");
        String courseTitle = course.getTitle();
        Exam exam = (Exam) session.getAttribute("exam");
        Connection conn = (Connection) session.getAttribute("conn");
        String examTitle = exam.getTitle();
        Student student = (Student) session.getAttribute("student");
        String finalPath = "F:\\UploadFIles\\Submissions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
        String questionPath = "F:\\Rafi\\My_Projects\\SUST_OnlineJudge\\web\\Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";

        SubmissionDao submissionDao = new SubmissionDao();

        session.setAttribute("submissions", submissionDao.getStudentSubmissions(student.getStudentId(), exam.getExamId(), questionPath, conn));
        RequestDispatcher rd = request.getRequestDispatcher("SubmissionPage.jsp");
        rd.forward(request, response);
        }
        catch(Exception e){
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
