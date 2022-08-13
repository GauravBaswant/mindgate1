package com.mindgate.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addition")
public class Addition extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String choice=request.getParameter("oprtn");
	 PrintWriter out=response.getWriter();
	switch(choice) {
	case "add":
		out.print("Addition of " + num1 +" and " + num2 +" is "+(num1+num2));
		break;
	case "sub":
		out.print("substraction of " + num1 +" and " + num2 +" is "+(num1-num2));
		break;
	}
		
		
	}

}
