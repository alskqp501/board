package com.example.board.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnUtils {
    public static Connection getConnection(){
        try{
            String dbURL = "jdbc:mysql://localhost:3306/JSP";
            String dbID = "root";
            String dbPW = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(dbURL,dbID,dbPW);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}