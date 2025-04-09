package com.java.project.service;

import com.java.project.models.User;

import java.sql.*;
import java.util.Properties;

public class EcommService {

    public void createUser(User user) {
        String createUserSql = "INSERT INTO users (first_name, last_name, email, password, phone_number, address) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = connectToDb()){
            PreparedStatement pstmt = conn.prepareStatement(createUserSql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getPhone());
            pstmt.setString(6, user.getAddress());
            int rowsInserted = pstmt.executeUpdate(); // REAL EXECUTION IN DB STARTS HERE!
            if(rowsInserted > 0) {
                System.out.println("User Created Successfully!");
            }
        } catch(Exception e) {
            System.err.println("Error creating user "+e.getMessage());
        }
    }

    public Connection connectToDb() {
        String url = "jdbc:mysql://mysql-360ffc1d-time-series-data-mesh.h.aivencloud.com:20150/ecomm";
        String username = "avnadmin";
        String password = "AVNS_7h5wbullVDPSITsYYO0";
        String database = "ecomm";

        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        properties.setProperty("useSSL", "true");
        properties.setProperty("requireSSL", "true");
        properties.setProperty("verifyServerCertificte", "true");
        properties.setProperty("trustCertificateKeystoreUrl", "file://"+"D:/intellij-projects/core_java_santosh/ca.pem");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, properties);
            return connection;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
