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
    
    public void addQuestion(int score, String fileName, Connection conn){
        int count = 0;
        PreparedStatement ps;
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into question(score,question_filename) values(?,?)");
            stmt.setInt(1, score);
            stmt.setString(2, fileName);
            
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
    
    

}
