package Dao;

import Entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseExamDao {

    public List<Course> findCourseByExamId(int examId, Connection conn) {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Integer> courseIds = new ArrayList<Integer>();
        Course course;
        int count = 0;
        try {

            Statement stmt = conn.createStatement();
            String sql;
            sql = "SELECT * from course_exam where exam_id=" + examId;
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ++count;
                courseIds.add(rs.getInt("course_id"));
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            //conn.close();
        } catch (Exception se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        if (count > 0) {

            count = 0;

            for (Integer ii : courseIds) {
                try {

                    Statement stmt = conn.createStatement();
                    String sql;
                    sql = "SELECT * from course where course_id=" + ii.intValue();
                    ResultSet rs = stmt.executeQuery(sql);

                    while (rs.next()) {
                        course = new Course();
                        ++count;
                        course.setCourseCount(count);
                        course.setCourseId(ii.intValue());
                        course.setIsRunning(rs.getInt("is_running"));
                        course.setSession(rs.getInt("session"));
                        course.setType(rs.getString("type"));
                        course.setTitle(rs.getString("title"));
                        courses.add(course);
                    }
                    //STEP 6: Clean-up environment
                    rs.close();
                    stmt.close();
                    //conn.close();
                } catch (Exception se) {
                    //Handle errors for JDBC
                    se.printStackTrace();
                }
            }
        } else {

        }
        return courses;
    }

}
