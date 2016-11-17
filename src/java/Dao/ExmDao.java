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
                    sql = "SELECT * from exam where exam_id=" + i.intValue();
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
    
    public Exam getExamById(int examId,Connection conn){
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
}
