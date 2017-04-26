package DatabaseConnector;

import Entity.*;
import java.sql.*;
import java.util.*;

public class DatabaseConnector {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1234";
    static Connection conn = null;

    public static Connection setConnectionWithMySql() {

        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
        }

        return conn;
    }//end try

    public static void main(String args[]) {
        DatabaseConnector dc = new DatabaseConnector();
        dc.setConnectionWithMySql();
        int count = 0;
        try {

            PreparedStatement stmt = conn.prepareStatement("insert into student_exam(student_id,exam_id,allowed,entered,batch) values(?,?,?,?,?)");
            for (int i = 120; i <= 248; i+=2) {
                int regno = 2016331000 + i;
                stmt.setInt(1, i);
                stmt.setInt(2, 35);
                stmt.setInt(3, 1);
                stmt.setInt(4, 0);
                stmt.setString(5, "batch_even");
                stmt.execute();
            }
            stmt.close();
        } catch (Exception se) {
            se.printStackTrace();
        }
        System.out.println("about to return false");
        
    }

}
