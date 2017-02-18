/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entity.*;
import java.sql.*;
import java.util.*;

public class SubmissionDao {

    public void addSubmission(int qId, int sId, String verdict, String filePath, int score, Connection conn, int examId) {
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("insert into submission(student_id,question_id,verdict,submission_filename,marks,exam_id) values(?,?,?,?,?,?)");
            stmt.setInt(1, sId);
            stmt.setInt(2, qId);
            stmt.setString(3, verdict);
            stmt.setString(4, filePath);
            stmt.setInt(5, score);
            stmt.setInt(6, examId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }

    public List<Submission> getStudentSubmissions(int sId, int eId, String qPath, Connection conn) {
        ArrayList<Submission> submissions = new ArrayList<Submission>();
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from submission where student_id=" + sId + " and exam_id=" + eId;
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            String qTitle = "";
            while (rs.next()) {
                ++count;
                Submission submission = new Submission();
                submission.setSubmissionId(rs.getInt("submission_id"));
                submission.setSubmissionCount(count);
                submission.setStudentId(rs.getInt("student_id"));
                submission.setExamId(rs.getInt("exam_id"));
                int qId = rs.getInt("question_id");
                String questionFileName = "";
                //from here
                try {
                    Statement stmtInner = conn.createStatement();
                    String sqlInner;
                    sqlInner = "SELECT title,question_filename from question where question_id=" + qId;
                    ResultSet rsInner = stmtInner.executeQuery(sqlInner);
                    while (rsInner.next()) {
                        qTitle = rsInner.getString("title");
                        questionFileName = rsInner.getString("question_filename");
                    }
                    rsInner.close();
                    stmtInner.close();
                } catch (Exception se) {
                    se.printStackTrace();
                }
                //till here
                submission.setQuestionPath(qPath + questionFileName);
                submission.setQuestionId(rs.getInt("question_id"));
                submission.setQuestionTitle(qTitle);
                submission.setMarks(rs.getInt("marks"));
                submission.setSubmissionFileName(rs.getString("submission_filename"));
                submission.setVerdict(rs.getString("verdict"));
                submissions.add(submission);
            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return submissions;
    }

    public List<Submission> getStudentSubmissions(int sId, int eId, Connection conn) {
        ArrayList<Submission> submissions = new ArrayList<Submission>();
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from submission where student_id=" + sId + " and exam_id=" + eId;
            ResultSet rs = stmt.executeQuery(sql);
            int count = 0;
            String qTitle = "";
            while (rs.next()) {
                ++count;
                Submission submission = new Submission();
                submission.setSubmissionCount(count);
                submission.setSubmissionId(rs.getInt("submission_id"));
                submission.setStudentId(rs.getInt("student_id"));
                submission.setExamId(rs.getInt("exam_id"));
                int qId = rs.getInt("question_id");
                String questionFileName = "";
                //from here
                try {
                    Statement stmtInner = conn.createStatement();
                    String sqlInner;
                    sqlInner = "SELECT title from question where question_id=" + qId;
                    ResultSet rsInner = stmtInner.executeQuery(sqlInner);
                    while (rsInner.next()) {
                        qTitle = rsInner.getString("title");
                        //questionFileName = rsInner.getString("question_filename");
                    }
                    rsInner.close();
                    stmtInner.close();
                } catch (Exception se) {
                    se.printStackTrace();
                }
                submission.setQuestionId(rs.getInt("question_id"));
                submission.setQuestionTitle(qTitle);
                submission.setMarks(rs.getInt("marks"));
                submission.setSubmissionFileName(rs.getString("submission_filename"));
                submission.setVerdict(rs.getString("verdict"));
                submissions.add(submission);
            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return submissions;
    }

    public int getNumberOfAccepted(int studentId, int examId, Connection conn) {
        int numOfAccepted = 0;
        PreparedStatement ps;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT count(distinct question_id) "
                    + "FROM submission"
                    + " where verdict=? and student_id=? and exam_id=?");
            stmt.setString(1, "Accepted");
            stmt.setInt(2, studentId);
            stmt.setInt(3, examId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                numOfAccepted = rs.getInt("count(distinct question_id)");
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return numOfAccepted;
    }

    public List<Integer> getQuestionIds(int studentId, int examId, Connection conn) {
        ArrayList<Integer> qIds = new ArrayList<Integer>();
        PreparedStatement ps;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT distinct question_id "
                    + "FROM submission"
                    + " where verdict=? and student_id=? and exam_id=?");
            stmt.setString(1, "Accepted");
            stmt.setInt(2, studentId);
            stmt.setInt(3, examId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                qIds.add(rs.getInt("question_id"));
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return qIds;
    }

    public List<Integer> getQuestionIdsOfWrong(int studentId, int examId, Connection conn) {
        ArrayList<Integer> qIds = new ArrayList<Integer>();
        PreparedStatement ps;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT distinct question_id "
                    + "FROM submission"
                    + " where verdict=? and student_id=? and exam_id=?");
            stmt.setString(1, "Wrong");
            stmt.setInt(2, studentId);
            stmt.setInt(3, examId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int flag = 0;
                PreparedStatement stmt2 = conn.prepareStatement("SELECT * "
                        + "FROM submission"
                        + " where verdict=? and student_id=? and exam_id=? and question_id=?");
                stmt2.setString(1, "Accepted");
                stmt2.setInt(2, studentId);
                stmt2.setInt(3, examId);
                stmt2.setInt(4, rs.getInt("question_id"));
                ResultSet rs2 = stmt2.executeQuery();
                if (rs2.next())
                    flag = 1;
                if (flag == 0)
                    qIds.add(rs.getInt("question_id"));
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return qIds;
    }

    public int getMaxNumAmongWrong(int studentId, int qId, int examId, Connection conn) {
        int marks = 0;
        PreparedStatement ps;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT marks "
                    + "FROM submission"
                    + " where verdict=? and student_id=? and question_id=? and exam_id=? order by marks DESC");
            stmt.setString(1, "Wrong");
            stmt.setInt(2, studentId);
            stmt.setInt(3, qId);
            stmt.setInt(4, examId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                marks = rs.getInt("marks");
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return marks;
    }

    public void editSubmission(int submissionId, int marks, Connection conn) {
        int count = 0;
        PreparedStatement ps;
        try {
            PreparedStatement stmt = conn.prepareStatement("update submission set marks=? where submission_id=?");
            stmt.setInt(1, marks);
            stmt.setInt(2, submissionId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
