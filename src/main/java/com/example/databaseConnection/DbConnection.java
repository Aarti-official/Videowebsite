package com.example.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServlet;



public class DbConnection extends HttpServlet {

    private static DbConnection dbConnection = new DbConnection();
    private Connection connection = null;
    private final String URL = "jdbc:mysql://localhost:3306/timer";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private DbConnection() {

    }

    public static DbConnection getInstance() {
        return dbConnection;
    }

    public Connection getMainConnection() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}