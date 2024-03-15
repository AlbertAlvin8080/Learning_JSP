package org.example.login.dao;

import org.example.login.connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public boolean checkUserExistence(String user, String password) {
        String sql = "SELECT * FROM tbl_user WHERE user_name = ? AND user_password = ?";
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            pstmt.execute();

            ResultSet rs = pstmt.getResultSet();
            if(rs.next())
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean registerUser(String user, String password) {
        String sql = "INSERT INTO tbl_user (user_name, user_password) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, password);
            pstmt.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
