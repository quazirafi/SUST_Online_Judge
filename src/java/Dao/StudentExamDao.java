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
    
    public void setEntered(Connection conn, int sId, int eId){
        PreparedStatement ps;
        try {

            PreparedStatement stmt = conn.prepareStatement("update student_exam set entered=? where student_id=?"
                    + " and exam_id=?");
            stmt.setInt(1, 1);
            stmt.setInt(2, sId);
            stmt.setInt(3, eId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
