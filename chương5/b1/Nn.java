/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nn;

import java.sql.*;

public class Nn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo_jdbc_hibernate";
        String user = "root";
        String password = "123456";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
