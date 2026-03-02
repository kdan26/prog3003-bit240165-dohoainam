/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nn;

import java.sql.*;

public class delete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc_hibernate";
        String user = "root";
        String password = "123456";

        int userIdToDelete = 5; // ví dụ id cần xóa

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM users WHERE id = ?")) {

            pstmt.setInt(1, userIdToDelete);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Đã xóa user có id = " + userIdToDelete);
            } else {
                System.out.println("Không tìm thấy user để xóa");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
