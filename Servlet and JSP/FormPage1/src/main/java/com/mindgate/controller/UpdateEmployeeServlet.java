package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeId;
		String name;
		double salary;

		employeeId = Integer.parseInt(request.getParameter("employeeid"));
		name = request.getParameter("employeename");
		salary = Double.parseDouble(request.getParameter("employeesalary"));

		System.out.println("in UpdateEmployeeServlet");

	}

}
