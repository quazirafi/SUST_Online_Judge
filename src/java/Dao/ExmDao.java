/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author DANA
 */
public class ExmDao {

    public ArrayList<Exam> getExamsByCourseId(int courseId, Connection conn) {
        ArrayList<Exam> exams = new ArrayList<Exam>();
        ArrayList<Integer> examIds = new ArrayList<Integer>();
        Exam exam;
        int count = 0;
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course_exam where course_id=" + courseId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;
                int id = rs.getInt("exam_id");
                examIds.add(id);
            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }

        System.out.println(count + " count value");
        if (count > 0) {
            count = 0;
            for (Integer i : examIds) {
                try {

                    Statement stmt = conn.createStatement();
                    String sql;
                    sql = "SELECT * from exam where exam_id = " + i.intValue();
                    ResultSet rs = stmt.executeQuery(sql);

                    while (rs.next()) {
                        ++count;
                        exam = new Exam();
                        exam.setExamCount(count);
                        exam.setExamId(rs.getInt("exam_id"));
                        exam.setTitle(rs.getString("title"));
                        exam.setPassword(rs.getString("password"));
                        exam.setStartTime(rs.getString("start_time"));
                        exam.setDuration(rs.getInt("duration"));
                        exam.setScore(rs.getInt("score"));
                        exams.add(exam);
                    }

                    rs.close();
                    stmt.close();
                } catch (Exception se) {
                    se.printStackTrace();
                }
            }
            return exams;
        } else {
            exam = new Exam();
            //exam.setExamCount(count);
            //exam.setTitle("no data available");
            //exam.setStartTime("none");
            //exam.setDuration(0);
            //exam.setScore(0);
            //exams.add(exam);
            return exams;
        }
    }

    public Exam getExamById(int examId, Connection conn) {
        Exam exam = new Exam();
        try {
            int count = 0;

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from exam where exam_id=" + examId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;
                exam = new Exam();
                exam.setExamCount(count);
                exam.setExamId(rs.getInt("exam_id"));
                exam.setTitle(rs.getString("title"));
                exam.setPassword(rs.getString("password"));
                exam.setStartTime(rs.getString("start_time"));
                exam.setDuration(rs.getInt("duration"));
                exam.setScore(rs.getInt("score"));
            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return exam;
    }

    public boolean verifyExambystudentId(int student_id, int examId, Connection conn) {
        int count = 0;
        try {

            Statement stmt = conn.createStatement();
            String sql;
            System.out.println("ExamId" + examId + "studentId" + student_id);
            sql = "SELECT * from student_exam where student_id = " + student_id + " and exam_id = " + examId;
            //sql = "SELECT * from student_exam where exam_id=" + examId+"and student_id="+student_id;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;

            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            System.out.println("Ekhane ");
            se.printStackTrace();
        }
        if (count > 0) {
            return true;
        }
        return false;

    }

    public boolean VerifyExamPassword(String password, int examId, Connection conn) {

        int count = 0;
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from exam where password = ? and exam_id = ?");
            stmt.setString(1, password);
            stmt.setInt(2, examId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                examId = rs.getInt("exam_id");
                System.out.println("This is the exam id --> " + examId);
                count = 1;
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        System.out.println("about to return false");
        if (count==1){
            System.out.println("inside count == 1");
            return true;
        }
        else
            return false;
    }

    public void addExam(String password, String title, String startTime, String duration, int score, int courseId, Connection conn) {
        int count = 0;
        PreparedStatement ps;
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into exam(password,start_time,duration,score,title) values(?,?,?,?,?)");
            stmt.setString(1, password);
            stmt.setString(2, startTime);
            stmt.setString(3, duration);
            stmt.setInt(4, score);
            stmt.setString(5, title);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        int examId = 0;
        try {

            PreparedStatement stmt = conn.prepareStatement("select exam_id from exam where password = ? and start_time = ? and duration = ? and score = ? and title = ?");
            stmt.setString(1, password);
            stmt.setString(2, startTime);
            stmt.setInt(3, Integer.parseInt(duration));
            stmt.setInt(4, score);
            stmt.setString(5, title);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                examId = rs.getInt("exam_id");
                System.out.println("This is the exam id --> " + examId);
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into course_exam values(?,?)");
            stmt.setInt(1, courseId);
            stmt.setInt(2, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }

    }

    public void updateExam(String password, String title, String startTime, String duration, int score, int examId, Connection conn) {
        int count = 0;
        PreparedStatement ps;
        try {

            PreparedStatement stmt = conn.prepareStatement("update exam set password=?,start_time=?,duration=?,score=?,title=? where exam_id=?");
            stmt.setString(1, password);
            stmt.setString(2, startTime);
            stmt.setString(3, duration);
            stmt.setInt(4, score);
            stmt.setString(5, title);
            stmt.setInt(6, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }

    public void deleteByExamId(int examId, Connection conn) {

        PreparedStatement ps;
        try {

            PreparedStatement stmt = conn.prepareStatement("delete from exam_question where exam_id=?");
            stmt.setInt(1, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        try {

            PreparedStatement stmt = conn.prepareStatement("delete from course_exam where exam_id=?");
            stmt.setInt(1, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        try {

            PreparedStatement stmt = conn.prepareStatement("delete from exam where exam_id=?");
            stmt.setInt(1, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
