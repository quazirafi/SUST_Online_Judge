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
    public void addSubmission(int qId,int sId,String verdict,String filePath,int score,Connection conn){
        PreparedStatement ps;
        ResultSet rs = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("insert into submission values(?,?,?,?,?)");
            stmt.setInt(1, sId);
            stmt.setInt(2, qId);
            stmt.setString(3, verdict);
            stmt.setString(4, filePath);
            stmt.setInt(5, score);
            stmt.execute();
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}
