package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String pass = request.getParameter("pass");
		RequestDispatcher rDispatcher;
		if(username.equals("ashish") && pass.equals("123"))
			rDispatcher = request.getRequestDispatcher("success.html");
		else {
			rDispatcher = request.getRequestDispatcher("failure.html");
		}
		rDispatcher.forward(request, response);
	}

}
