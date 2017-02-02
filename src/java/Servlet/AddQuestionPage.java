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
import Dao.*;
import Entity.*;
import java.io.*;
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
public class AddQuestionPage extends HttpServlet {

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
        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        if (tracker.equals("teacher")) {
            response.sendRedirect("AddQuestionPage.jsp");
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
        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        File file = null;
        int maxMemory = 1024 * 100000;
        int maxFileSize = 1024 * 100000;
        int qId=0 ;
        String contentType = request.getContentType();
        String courseSession = (String) session.getAttribute("courseSession");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        Course course = (Course) session.getAttribute("course");
        Connection conn = (Connection) session.getAttribute("conn");
        String courseTitle = course.getTitle();
        Exam exam = (Exam) session.getAttribute("exam");
        QuestionDao questionDao = new QuestionDao();
        String examTitle = exam.getTitle();
        String fieldName = "";
        String fileName = "";
        String id = "";
        String fileRename = "";
        String fileNameToBeInserted = "";
        String filePath = "F:\\Rafi\\My_Projects\\SUST_OnlineJudge\\web\\Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam"+ exam.getExamId() + "\\";
        File createDirectory = new File(filePath);
        createDirectory.mkdirs();
        if (contentType.indexOf("multipart/form-data") >= 0) {

            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(maxMemory);
            factory.setRepository(new File("F:\\"));
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setSizeMax(maxFileSize);

            try {
                List fileItems = upload.parseRequest(request);
                Iterator i = fileItems.iterator();
                while (i.hasNext()) {
                    FileItem fi = (FileItem) i.next();
                    if (!fi.isFormField()) {
                        System.out.println("inside form field ha");
                        fieldName = fi.getFieldName();
                        fileName = fi.getName();
                        System.out.println(fileName);
                        boolean isInMemory = fi.isInMemory();
                        long sizeInBytes = fi.getSize();
                        if (fileName.lastIndexOf("\\") >= 0) {
                            fileRename = filePath + teacher.getTeacherCodeName()
                                    + fileName.substring(fileName.lastIndexOf("\\"));
                            file = new File(filePath+ teacher.getTeacherCodeName()
                                    + fileName.substring(fileName.lastIndexOf("\\")));
                            //fileNameToBeInserted = fileName.substring(fileName.lastIndexOf("\\"));
                        } else {
                            fileRename = filePath+ teacher.getTeacherCodeName()
                                    + fileName.substring(fileName.lastIndexOf("\\") + 1);
                            file = new File(filePath+ teacher.getTeacherCodeName()
                                    + fileName.substring(fileName.lastIndexOf("\\") + 1));
                            //fileNameToBeInserted = fileName.substring(fileName.lastIndexOf("\\"));
                        }
                        fi.write(file);
//                        Path source = Paths.get(fileRename);
//                        Files.move(source, source.resolveSibling("Main.c"));

                    } else {
                        if (fi.getFieldName().equals("score")) {
                            String score = fi.getString();
                            System.out.println("score --- > " + score);
                            qId = questionDao.addQuestion(exam.getExamId(),Integer.parseInt(score),fileName,conn);
                            System.out.println(qId);
                            filePath += "Q" + qId + "\\" ;
                            File ff = new File(filePath);
                            ff.mkdirs();
                            InputStream in = new FileInputStream(new File(fileRename));
                            String newFileName = "";
                            OutputStream out= null;
                            out = new FileOutputStream(new File(filePath+fileName));
//                            File directory = new File(finalPath);
//                            File[] filesToBeDeleted = directory.listFiles();
//                            for (File fff : filesToBeDeleted)
//                                fff.delete();
                            byte[] buf = new byte[1024];
                            int len;
                            while ((len = in.read(buf)) > 0) {
                                out.write(buf, 0, len);
                            }
                            in.close();
                            out.close();
                            File delete = new File(fileRename);
                            delete.delete();
                        }
                        else if (fi.getFieldName().equals("title")){
                            questionDao.setTitle(fi.getString(), qId, conn);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        //from here 
        
                List<Question> questions = questionDao.getQuestionByExamId(exam.getExamId(), conn);
                
                
                String path = "Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
                for (Question q : questions) {
                    q.setPath(path + "Q" + q.getQuestionId() + "\\" + q.getQuestionFileName());
                    System.out.println("path --> " + q.getPath());
                }
                request.setAttribute("questions", questions);
                RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
                rd.forward(request, response);
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
