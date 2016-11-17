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
public class TeacherDao {

    public Teacher getTeacherByUserIdPassword(int userId, String password, Connection conn) {
        Teacher teacher = new Teacher();
        int count = 0;
        try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from teacher where teacher_id=" + userId + " and password=" + password;
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                ++count;
                int id = rs.getInt("teacher_id");
                String fullName = rs.getString("fullname");
                teacher.setFullName(fullName);
                teacher.setPassword(password);
                teacher.setTeacherId(userId);
                System.out.println("inside "+fullName);
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
            return teacher;
        } else {
            return null;
        }
    }
}
