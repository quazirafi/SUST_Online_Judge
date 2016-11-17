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
import java.sql.*;
import java.util.List;
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
public class CourseBySession extends HttpServlet {

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
        System.out.println("INSIDE Course BY session");
        int courseSession = Integer.parseInt(request.getParameter("session"));
        HttpSession session = request.getSession();
        String tracker = (String) session.getAttribute("tracker");
        if (tracker == null) {
            response.sendRedirect("course.jsp");
        } else {
            List<Course> courses;
            CourseDao courseDao = new CourseDao();
            Connection conn = (Connection) session.getAttribute("conn");

            if (tracker.equals("teacher")) {
                Teacher teacher = (Teacher) session.getAttribute("teacher");
                courses = courseDao.getCourseByTeacherId(teacher.getTeacherId(), conn, courseSession);
                session.setAttribute("courseSession", Integer.toString(courseSession));
                request.setAttribute("courses", courses);
                RequestDispatcher rd = request.getRequestDispatcher("course.jsp");
                rd.forward(request, response);
            }
            else if (tracker.equals("student")){
                Student student = (Student) session.getAttribute("student");
                courses = courseDao.getCourseByStudentId(student.getStudentId(), conn, courseSession);
                session.setAttribute("courseSession", Integer.toString(courseSession));
                request.setAttribute("courses", courses);
                RequestDispatcher rd = request.getRequestDispatcher("course.jsp");
                rd.forward(request, response);
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
