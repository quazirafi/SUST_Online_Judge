package Dao;

import Entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentExamDao {

    public int getExamStudentIsAllowed(Connection conn, int sId, int eId) {
        int allowed=0;
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from student_exam where exam_id=" + eId + " and student_id=" + sId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                allowed = rs.getInt("allowed");
            }
            
            rs.close();
            stmt.close();
            
        } catch (Exception se) {
            
            se.printStackTrace();
        }
        return allowed;
    }
}
