package Dao;

import Entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentExamDao {

    public int getExamStudentIsAllowed(Connection conn, int sId, int eId) {
        int allowed = 0;
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

    public void setEntered(Connection conn, int sId, int eId) {
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

    public List<Student> findEnteredStudents(Connection conn, int eId) {
        PreparedStatement ps;
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Integer> idList = new ArrayList<Integer>();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from student_exam where exam_id = ? and "
                    + "entered = ? and allowed = ?");
            stmt.setInt(1, eId);
            stmt.setInt(2, 1);
            stmt.setInt(3, 0);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                idList.add(rs.getInt("student_id"));
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        int counter = 0;
        for (Integer id : idList) {
            try {
                ++counter;
                PreparedStatement stmt = conn.prepareStatement("select * from student where student_id = ?");
                stmt.setInt(1, id.intValue());
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Student student = new Student();
                    student.setCounter(counter);
                    student.setRegno(rs.getInt("regno"));
                    student.setStudentId(rs.getInt("student_id"));
                    students.add(student);
                    break;
                }
                stmt.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
        }
        return students;
    }
    
    public void setAllowedResetEntered(Connection conn, int sId, int eId,String batch){
        try {

            PreparedStatement stmt = conn.prepareStatement("update student_exam set entered = ?,allowed = ?,batch = ? where "
                    + "student_id = ? and exam_id = ?");
            stmt.setInt(1, 0);
            stmt.setInt(2, 1);
            stmt.setString(3,batch);
            stmt.setInt(4, sId);
            stmt.setInt(5, eId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    
    public List<Integer> getStudentByExamId(int examId,Connection conn){
        ArrayList<Integer> studentIds = new ArrayList<Integer>();
        try {
                
                PreparedStatement stmt = conn.prepareStatement("select * from student_exam where exam_id = ?");
                stmt.setInt(1, examId);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    studentIds.add(rs.getInt("student_id"));
                }
                stmt.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
        return studentIds;
    }
    
    public List<Integer> getStudentByExamIdAndBatch(int examId,String batch,Connection conn){
        ArrayList<Integer> studentIds = new ArrayList<Integer>();
        try {
                
                PreparedStatement stmt = conn.prepareStatement("select * from student_exam where exam_id = ? and batch=?");
                stmt.setInt(1, examId);
                stmt.setString(2, batch);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    studentIds.add(rs.getInt("student_id"));
                }
                stmt.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
        return studentIds;
    }
    
    public ArrayList<String> getBatch(int eId,Connection conn){
      int allowed = 0;
      ArrayList<String> batches = new ArrayList<String>();
        try {
            
            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT batch from student_exam where exam_id=" + eId ;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
               String batch = rs.getString("batch");
               batches.add(batch);
            }

            rs.close();
            stmt.close();

        } catch (Exception se) {

            se.printStackTrace();
        }
        return batches;   
    }
}
