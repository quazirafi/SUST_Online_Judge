/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.*;
import java.sql.*;

/**
 *
 * @author DANA
 */
public class StudentDao {
    public Student getStudentByRegnoPassword(int userId, String password, Connection conn) {
        Student student = new Student();
        int count = 0;
        try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from student where regno=" + userId + " and password=" + password;
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                ++count;
                int id = rs.getInt("student_id");
                int regno = rs.getInt("regno");
                student.setRegno(regno);
                student.setStudentId(id);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        if (count > 0) {
            return student;
        } else {
            return null;
        }
    }
    
    public Student getStudentByStudentId(int studentId,Connection conn){
    Student student = new Student();
        int count = 0;
        try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from student where student_id=" + studentId ;
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                ++count;
                int id = rs.getInt("student_id");
                int regno = rs.getInt("regno");
                student.setRegno(regno);
                student.setStudentId(id);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        if (count > 0) {
            return student;
        } else {
            return null;
        }
    }
}
