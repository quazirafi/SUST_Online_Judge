/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.*;
import Entity.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author DANA
 */
public class StudentPerformanceBatchwise extends HttpServlet {

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
        try{
            String batch = request.getParameter("batch");
        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        Connection conn = (Connection) session.getAttribute("conn");
        Exam exam = (Exam) session.getAttribute("exam");
        if (tracker.equals("teacher")){
            ArrayList<StudentPerformance> studentPerformances = new ArrayList<StudentPerformance>();
            StudentPerformance studentPerformance=null;
            StudentExamDao studentExamDao = new StudentExamDao();
            List<Integer> studentIds = null;
            if(batch.equals("all"))
                studentIds = studentExamDao.getStudentByExamId(exam.getExamId(), conn);
            else
                studentIds = studentExamDao.getStudentByExamIdAndBatch(exam.getExamId(), batch, conn);
            int counter = 0;
            for (Integer i : studentIds){
                System.out.println("id "+i.intValue());
                studentPerformance = new StudentPerformance();
                StudentDao studentDao = new StudentDao();
                SubmissionDao submissionDao = new SubmissionDao();
                //if (studentExamDao.getExamStudentIsAllowed(conn, i.intValue(), exam.getExamId())==1){
                    ++counter;
                    studentPerformance.setCounter(counter);
                    studentPerformance.setStudentId(i.intValue());
                    studentPerformance.setStudentRegNo(studentDao.getStudentByStudentId(i.intValue(), conn).getRegno());
                    studentPerformance.setNumOfAccepted(submissionDao.getNumberOfAccepted(i.intValue(), exam.getExamId(), conn));
                    ArrayList<Integer> qIds = (ArrayList<Integer>)submissionDao.getQuestionIds(i.intValue(), exam.getExamId(), conn);
                    int totalSum = 0;
                    for (Integer j : qIds){
                        QuestionDao questionDao = new QuestionDao();
                        totalSum += questionDao.getQuestionByQuestionId(j.intValue(), conn).getScore();
                    }
                    ArrayList<Integer> qIdsOfWrong = (ArrayList<Integer>)submissionDao.getQuestionIdsOfWrong(i.intValue(),exam.getExamId(),conn);
                    for (Integer j : qIdsOfWrong){
                        totalSum += submissionDao.getMaxNumAmongWrong(i.intValue(), j.intValue(), exam.getExamId(), conn);
                    }
                    studentPerformance.setSumOfScores(totalSum);
                    studentPerformances.add(studentPerformance);
                //}
            }
            
            for (StudentPerformance sp : studentPerformances)
                System.out.println(sp.getStudentRegNo()+" "+sp.getSumOfScores());
            session.setAttribute("batches", studentExamDao.getBatch(exam.getExamId(), conn));
            request.setAttribute("studentPerformances", studentPerformances);
            request.setAttribute("selectedBatch", batch);
            RequestDispatcher rd = request.getRequestDispatcher("StudentPerformancePage.jsp");
            rd.forward(request, response);
        }
        else{
            response.sendRedirect("login.jsp");
        }
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
