/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Dao.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DatabaseConnector.*;
import Entity.*;
import java.sql.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author DANA
 */
public class Login extends HttpServlet {

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
          int flag=0;// flag is for detecting weather the input is student's regNo or Teacher's codename 

        String userId = (request.getParameter("user_name")).toString();
        String password = request.getParameter("password");
        
        
        DatabaseConnector dc = new DatabaseConnector();
        Connection conn = dc.setConnectionWithMySql();
        
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher;
        List<Course> courses; 
        CourseDao courseDao = new CourseDao();
        Student student;
        StudentDao studentDao = new StudentDao();
        for(int i=0;i<userId.length();i++)
        {
            if((userId.charAt(i)>='a'&&userId.charAt(i)<='z')||(userId.charAt(i)>='A'&&userId.charAt(i)<='Z'))
            {
              
                
                flag=1;
                 break;
            }
        }
        
        if (flag==1){
            teacher = (Teacher)teacherDao.getTeacherByUserIdPassword(userId,password,conn);
            if (teacher == null){
             
                request.setAttribute("message", "Invalid userid or password");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("conn", conn);
                session.setAttribute("teacher", teacher);
                session.setAttribute("tracker", "teacher");
                session.setAttribute("courseSession", "2012");
                courses = courseDao.getCourseByTeacherId(teacher.getTeacherId(),conn,2012);
              
                for (Course c :  courses){
                    System.out.println(c.getTitle());
                }
                request.setAttribute("courses", courses);
                RequestDispatcher rd = request.getRequestDispatcher("course.jsp");
                rd.forward(request, response);
            }   
        }
        else{
         int   studentRegId = Integer.parseInt(request.getParameter("user_name")); //Change it to studentRegId from userId
         int student_session=studentRegId/1000000;
            student = (Student)studentDao.getStudentByRegnoPassword(studentRegId,password,conn);
            if (student == null){
                request.setAttribute("message", "Invalid userid or password");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("conn", conn);
                session.setAttribute("student", student);
                session.setAttribute("tracker", "student");
                session.setAttribute("courseSession", ""+student_session);
                courses = courseDao.getCourseByStudentId(student.getStudentId(),conn,2012);
//                for (Course c :  courses){
//                    System.out.println(c.getIsRunning());
//                }
                request.setAttribute("courses", courses);
                RequestDispatcher rd = request.getRequestDispatcher("course.jsp");
                rd.forward(request, response);
            }   
        }
//        else
//            studentDao.getStudentByUserIdPassword(userId,password,conn);
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
