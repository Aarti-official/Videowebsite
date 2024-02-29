package com.example.daoImplementation;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.databaseConnection.DbConnection;
import com.example.entity.User;

import jakarta.servlet.annotation.WebServlet;



public class LoginImplementation {
    
    public static User loginUser(String email, String password) {
        User user = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            connection = DbConnection.getInstance().getMainConnection();
            if (connection != null) {
                String loginQuery = "SELECT * FROM user WHERE email=? AND password=?";
                stmt = connection.prepareStatement(loginQuery);
                stmt.setString(1, email);
                stmt.setString(2, password);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    user = new User();
                    user.setName(rs.getString(1));
                    user.setEmail(rs.getString(2));
                    user.setNumber(rs.getString(3));
                    user.setPassword(rs.getString(4));
                }
            } else {
                System.out.println("Database connection is null.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return user;
    }
    
    public static int addUser(User signIn) throws Exception {
        try {
            String insertQuery = "INSERT INTO user(name,email,contact,password) values(?,?,?,?)";
            PreparedStatement stmt3;
            stmt3 = DbConnection.getInstance().getMainConnection().prepareStatement(insertQuery);
            stmt3.setString(1, signIn.getName());
            stmt3.setString(2, signIn.getEmail());
            stmt3.setString(3, signIn.getNumber());
            stmt3.setString(4, signIn.getPassword());
           
            return stmt3.executeUpdate();
        } catch (SQLException ex) {
            throw new Exception("Something went wrong...", ex);
        } catch (Exception ex) {
            throw new Exception("Something went wrong...", ex);
        }
    }
}


	
	
	

