package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormPage")
public class FormPage extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName,LastName,Gender,Qualification,Language;
		FirstName=request.getParameter("fn");
		LastName=request.getParameter("ln");
		Gender=request.getParameter("Gender");
		Qualification=request.getParameter("Qualification");
		Language=request.getParameter("Language");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		out.println("<h2>FirstName : "+ FirstName+"</h2>");
		out.println("<h2>LastName : "+ LastName+"</h2>");
		out.println("<h2>Gender : "+ Gender+"</h2>");
		out.println("<h2>Qualification : "+ Qualification+"</h2>");
		out.println("<h2>Language : "+ Language+"</h2>");

	}

}
