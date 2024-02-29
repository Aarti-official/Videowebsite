package com.example.servlet;

import java.io.IOException;

import com.example.daoImplementation.LoginImplementation;
import com.example.entity.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet{
	User user = new User();
	LoginImplementation register = new LoginImplementation();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
        String email = req.getParameter("email");
        String contact = req.getParameter("contact");
        String password = req.getParameter("pass");
  

        user.setName(name);
        user.setEmail(email);
        user.setNumber(contact);
        user.setPassword(password);
    
        try {
            register.addUser(user);
           
        } catch (Exception e) {
            e.printStackTrace();
        } 
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.jsp");
        requestDispatcher.forward(req, resp);

    
	}

}
