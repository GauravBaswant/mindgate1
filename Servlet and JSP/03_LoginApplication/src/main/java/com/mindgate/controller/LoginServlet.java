package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String LoginId,Password;
		LoginId=request.getParameter("username");
		Password=request.getParameter("password");
		if(LoginId.equals("admin") && Password.equals("bahubali")) {
			
			response.sendRedirect("home.html");
		}else
		{
			response.sendRedirect("invalid.html");
		}
	}

}
