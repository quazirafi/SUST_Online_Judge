package Dao;

import Entity.*;
import java.sql.*;
import java.util.*;

public class QuestionDao {

    public List<Question> getQuestionByExamId(int examId, Connection conn) {
        ArrayList<Question> questions = new ArrayList<Question>();
        ArrayList<Integer> questionIds = new ArrayList<Integer>();
        Question question;

        int count = 0;
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from exam_question where exam_id=" + examId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("question_id");
                questionIds.add(id);
            }

            rs.close();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        for (Integer i : questionIds) {
            try {

                Statement stmt = conn.createStatement();
                String sql;
                sql = "SELECT * from question where question_id=" + i.intValue();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    ++count;
                    question = new Question();
                    question.setCounter(count);
                    question.setOutputFileName(rs.getString("output_filename"));
                    question.setQuestionFileName(rs.getString("question_filename"));
                    question.setQuestionId(rs.getInt("question_id"));
                    question.setScore(rs.getInt("score"));
                    question.setTestCaseFileName(rs.getString("testcase_filename"));
                    question.setTitle(rs.getString("title"));
                    questions.add(question);
                }

                rs.close();
                stmt.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
        }
        return questions;
    }
    
    public int addQuestion(int examId, int score, String fileName, Connection conn){
        int qId = 0;
        PreparedStatement ps;
        ResultSet rs = null;
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into question(score,question_filename) values(?,?)");
            stmt.setInt(1, score);
            stmt.setString(2, fileName);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        try {

            PreparedStatement stmt = conn.prepareStatement("select max(question_id) from question");
            
            
            rs = stmt.executeQuery();
            while (rs.next()){
                qId = rs.getInt("max(question_id)");
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into exam_question(exam_id,question_id) values(?,?)");
            stmt.setInt(1, examId);
            stmt.setInt(2, qId);
            
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        return qId;
    }
    
    public void setTitle(String title, int qId, Connection conn){
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("update question set title=? where question_id=?");
            stmt.setString(1, title);
            stmt.setInt(2, qId);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    
    public Question getQuestionByQuestionId(int questionId,Connection conn){
        Question question = new Question();
        try {

                Statement stmt = conn.createStatement();
                String sql;
                sql = "SELECT * from question where question_id=" + questionId;
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    question.setOutputFileName(rs.getString("output_filename"));
                    question.setQuestionFileName(rs.getString("question_filename"));
                    question.setQuestionId(rs.getInt("question_id"));
                    question.setScore(rs.getInt("score"));
                    question.setTestCaseFileName(rs.getString("testcase_filename"));
                    question.setTitle(rs.getString("title"));
                }

                rs.close();
                stmt.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
        return question;
    }

}
