/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public List<Course> getCourseByTeacherId(int teacher_id, Connection conn,int courseSession) {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Integer> courseIds = new ArrayList<Integer>();
        Course course;
        int count = 0;
        try {
          
            
            Statement stmt = conn.createStatement();
            String sql;
            
            sql = "SELECT * from course_teacher where teacher_id="+teacher_id ;
            
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("course_id");
                courseIds.add(id);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        
        for (Integer i : courseIds){
            try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course where course_id=" + i.intValue()+" and session="+courseSession;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;
                course = new Course();
                course.setCourseCount(count);
                course.setCourseId(rs.getInt("course_id"));
                course.setTitle(rs.getString("title"));
                course.setSession(rs.getInt("session"));
                course.setType(rs.getString("type"));
                course.setIsRunning(rs.getInt("is_running"));
                courses.add(course);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        }
        
        if (count > 0) {
            return courses;
        } else {
            return null;
        }
    }
    
    
    public List<Course> getCourseByStudentId(int userId, Connection conn,int courseSession) {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Integer> courseIds = new ArrayList<Integer>();
        Course course;
        int count = 0;
        try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course_student where student_id=" + userId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("course_id");
                courseIds.add(id);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        
        for (Integer i : courseIds){
            try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course where course_id=" + i.intValue()+" and session="+courseSession+" and is_running=1";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;
                course = new Course();
                course.setCourseCount(count);
                course.setCourseId(rs.getInt("course_id"));
                course.setTitle(rs.getString("title"));
                course.setSession(rs.getInt("session"));
                course.setType(rs.getString("type"));
                course.setIsRunning(rs.getInt("is_running"));
                courses.add(course);
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        }
        
        if (count > 0) {
            return courses;
        } else {
            return null;
        }
    }
    
    public boolean findCourseByTeacherId(int teacherId,int courseId,Connection conn){
        
        int count = 0;
        try {
             Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course_teacher where course_id=" + courseId+" and teacher_id="+teacherId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
               ++count;
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        if (count>0)
            return true;
        else
            return false;
    }

    public Course getCourseById(int courseId,Connection conn) {
        Course course=null;
        int counter = 0;
         try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course where course_id=" + courseId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
               ++counter;
               course = new Course();
               course.setCourseCount(counter);
               course.setCourseId(courseId);
               course.setIsRunning(rs.getInt("is_running"));
               course.setSession(rs.getInt("session"));
               course.setType(rs.getString("type"));
               course.setTitle(rs.getString("title"));
            }
            
            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return course;
    }
    
    
}
