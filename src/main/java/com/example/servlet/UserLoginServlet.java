package com.example.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import com.example.common.ErrorUtil;
import com.example.daoImplementation.LoginImplementation;
import com.example.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginservlet")	

public class UserLoginServlet extends HttpServlet {
	ErrorUtil errorUtil = new  ErrorUtil();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("email"); // Assuming the parameter name is "email"
        String pass = req.getParameter("pass");   // Assuming the parameter name is "pass"

        User user = null;
        try {
            user = LoginImplementation.loginUser(email, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("CurrentUser", user);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Profile.jsp");
            requestDispatcher.forward(req, resp);
            
        } else {
        	errorUtil.addErrorMessage("Invalid Credentials!!");
            req.setAttribute("InvalidError", errorUtil);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}

