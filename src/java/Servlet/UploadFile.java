/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import CompExec.*;
import Dao.*;
import Entity.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.io.output.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.Connection;
import javax.servlet.http.HttpSession;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Noymul Islam
 */
public class UploadFile extends HttpServlet {

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
        processRequest(request, response);
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

        File file = null;
        int maxMemory = 1024 * 100000;
        int maxFileSize = 1024 * 100000;
        ServletContext context = request.getSession().getServletContext();
        String filePath = context.getInitParameter("file-upload");
        System.out.println(filePath);
        String contentType = request.getContentType();
        String fieldName = "";
        String fileName = "";
        String id = "";

        HttpSession session = request.getSession();
        String courseSession = (String) session.getAttribute("courseSession");
        Course course = (Course) session.getAttribute("course");
        String courseTitle = course.getTitle();
        Exam exam = (Exam) session.getAttribute("exam");
        Connection conn = (Connection) session.getAttribute("conn");
        String examTitle = exam.getTitle();
        Student student = (Student) session.getAttribute("student");
        String finalPath = "F:\\UploadFIles\\Submissions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
        String questionPath = "F:\\Rafi\\My_Projects\\SUST_OnlineJudge\\web\\Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
        String fileRename = "";
        if (exam.getStatus().equals("ongoing")) {
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

                            fieldName = fi.getFieldName();
                            fileName = fi.getName();
                            System.out.println(fileName);
                            boolean isInMemory = fi.isInMemory();
                            long sizeInBytes = fi.getSize();
                            if (fileName.lastIndexOf("\\") >= 0) {
                                fileRename = filePath + student.getStudentId()
                                        + fileName.substring(fileName.lastIndexOf("\\"));
                                file = new File(filePath + student.getStudentId()
                                        + fileName.substring(fileName.lastIndexOf("\\")));
                            } else {
                                fileRename = filePath + student.getStudentId()
                                        + fileName.substring(fileName.lastIndexOf("\\") + 1);
                                file = new File(filePath + student.getStudentId()
                                        + fileName.substring(fileName.lastIndexOf("\\") + 1));
                            }
                            fi.write(file);
//                        Path source = Paths.get(fileRename);
//                        Files.move(source, source.resolveSibling("Main.c"));

                        } else {
                            if (fi.getFieldName().equals("qId")) {
                                id = fi.getString();
                                System.out.println("id --- > " + id);
                                finalPath += "Q" + id + "\\" + student.getRegno() + "\\";
                                questionPath += "Q" + id + "\\";
                                File ff = new File(finalPath);
                                ff.mkdirs();
                                InputStream in = new FileInputStream(new File(fileRename));
                                String newFileName = "";
                                OutputStream out = null;
                                if (fileRename.endsWith(".c")) {
                                    out = new FileOutputStream(new File(finalPath + "Main.c"));
                                } else if (fileRename.endsWith(".cpp")) {
                                    out = new FileOutputStream(new File(finalPath + "Main.cpp"));
                                } else if (fileRename.endsWith(".java")) {
                                    out = new FileOutputStream(new File(finalPath + "Main.java"));
                                }
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
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

            Tester2 codeCompileExecuter = new Tester2();
            QuestionDao questionDao = new QuestionDao();
            SubmissionDao submissionDao = new SubmissionDao();
            int score;
            if (fileRename.endsWith(".c")) {
                System.out.println(codeCompileExecuter.compile("c", finalPath));
                System.out.println(codeCompileExecuter.execute("c", "input", 5000, finalPath, questionPath));
                System.out.println(codeCompileExecuter.match(finalPath, questionPath));
                String verdict = codeCompileExecuter.match(finalPath, questionPath);
                if (verdict.equals("Accepted")) {
                    score = questionDao.getQuestionByQuestionId(Integer.parseInt(id), conn).getScore();
                } else {
                    score = 0;
                }
                File directory = new File(finalPath);
                File[] filesNumber = directory.listFiles();
                Path source = Paths.get(finalPath + "Main.c");
                Files.move(source, source.resolveSibling("Main" + filesNumber.length + ".c"));
                submissionDao.addSubmission(Integer.parseInt(id), student.getStudentId(), verdict, finalPath + "Main" + filesNumber.length + ".c", score, conn, exam.getExamId());
                session.setAttribute("submissions", submissionDao.getStudentSubmissions(student.getStudentId(), exam.getExamId(), questionPath, conn));
                RequestDispatcher rd = request.getRequestDispatcher("SubmissionPage.jsp");
                rd.forward(request, response);
            } else if (fileRename.endsWith(".cpp")) {
                System.out.println(codeCompileExecuter.compile("cpp", finalPath));
                System.out.println(codeCompileExecuter.execute("cpp", "input", 5000, finalPath, questionPath));
                System.out.println(codeCompileExecuter.match(finalPath, questionPath));
                String verdict = codeCompileExecuter.match(finalPath, questionPath);
                if (verdict.equals("Accepted")) {
                    score = questionDao.getQuestionByQuestionId(Integer.parseInt(id), conn).getScore();
                } else {
                    score = 0;
                }
                File directory = new File(finalPath);
                File[] filesNumber = directory.listFiles();
                Path source = Paths.get(finalPath + "Main.cpp");
                Files.move(source, source.resolveSibling("Main" + filesNumber.length + ".cpp"));
                submissionDao.addSubmission(Integer.parseInt(id), student.getStudentId(), verdict, finalPath + "Main" + filesNumber.length + ".cpp", score, conn, exam.getExamId());
                session.setAttribute("submissions", submissionDao.getStudentSubmissions(student.getStudentId(), exam.getExamId(), questionPath, conn));
                RequestDispatcher rd = request.getRequestDispatcher("SubmissionPage.jsp");
                rd.forward(request, response);
            } else if (fileRename.endsWith(".java")) {
                System.out.println(codeCompileExecuter.compile("java", finalPath));
                System.out.println(codeCompileExecuter.execute("java", "input", 5000, finalPath, questionPath));
                System.out.println(codeCompileExecuter.match(finalPath, questionPath));
                String verdict = codeCompileExecuter.match(finalPath, questionPath);
                if (verdict.equals("Accepted")) {
                    score = questionDao.getQuestionByQuestionId(Integer.parseInt(id), conn).getScore();
                } else {
                    score = 0;
                }
                File directory = new File(finalPath);
                File[] filesNumber = directory.listFiles();
                Path source = Paths.get(finalPath + "Main.java");
                Files.move(source, source.resolveSibling("Main" + filesNumber.length + ".java"));
                submissionDao.addSubmission(Integer.parseInt(id), student.getStudentId(), verdict, finalPath + "Main" + filesNumber.length + ".java", score, conn, exam.getExamId());
                session.setAttribute("submissions", submissionDao.getStudentSubmissions(student.getStudentId(), exam.getExamId(), questionPath, conn));
                RequestDispatcher rd = request.getRequestDispatcher("SubmissionPage.jsp");
                rd.forward(request, response);
            }
        } else {
            System.out.println("exam status "+exam.getStatus());
            response.sendRedirect("SubmissionFailed.jsp");
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
