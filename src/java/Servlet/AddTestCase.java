/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.QuestionDao;
import Entity.Course;
import Entity.Exam;
import Entity.Question;
import Entity.Student;
import Entity.Teacher;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author DANA
 */
public class AddTestCase extends HttpServlet {

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
        
        try{
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
        String tracker = (String) session.getAttribute("tracker");
        if (tracker.equals("teacher")){
            String courseSession = Integer.toString((int)session.getAttribute("courseSession"));
        Course course = (Course) session.getAttribute("course");
        Connection conn = (Connection) session.getAttribute("conn");
        String courseTitle = course.getTitle();
        Exam exam = (Exam) session.getAttribute("exam");
        Teacher teacher = (Teacher) session.getAttribute("teacher");
        String examTitle = exam.getTitle();
        Student student = (Student) session.getAttribute("student");
        String finalPath = "F:\\UploadFIles\\Submissions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
        String questionPath = "F:\\Rafi\\My_Projects\\SUST_OnlineJudge\\web\\Questions\\" + courseSession + "\\" + courseTitle + "\\" + "exam" + exam.getExamId() + "\\";
        String fileRename = "";

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
                            fileRename = filePath + teacher.getTeacherId()
                                    + fileName.substring(fileName.lastIndexOf("\\"));
                            file = new File(filePath + teacher.getTeacherId()
                                    + fileName.substring(fileName.lastIndexOf("\\")));
                        } else {
                            fileRename = filePath + teacher.getTeacherId()
                                    + fileName.substring(fileName.lastIndexOf("\\") + 1);
                            file = new File(filePath + teacher.getTeacherId()
                                    + fileName.substring(fileName.lastIndexOf("\\") + 1));
                        }
                        fi.write(file);
//                        Path source = Paths.get(fileRename);
//                        Files.move(source, source.resolveSibling("Main.c"));

                    } else {
                        if (fi.getFieldName().equals("qId")) {
                            id = fi.getString();
                            System.out.println("id --- > " + id);
//                            finalPath += "Q" + id + "\\" + student.getRegno() + "\\";
                            questionPath += "Q" + id + "\\";
//                            File ff = new File(finalPath);
//                            ff.mkdirs();
                            InputStream in = new FileInputStream(new File(fileRename));
                            String newFileName = "";
                            OutputStream out= null;
                            out = new FileOutputStream(new File(questionPath+"in.txt"));
//                            File directory = new File("q");
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
        QuestionDao questionDao = new QuestionDao();
        List<Question> questions = questionDao.getQuestionByExamId(exam.getExamId(), conn);
        request.setAttribute("questions", questions);
        RequestDispatcher rd = request.getRequestDispatcher("QuestionPage.jsp");
        rd.forward(request, response);
        }
        else {
            response.sendRedirect("login.jsp");
        }
        }
        catch(Exception e){
            response.sendRedirect("login.jsp");
        };
        
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
