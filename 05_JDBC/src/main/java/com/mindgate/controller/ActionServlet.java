package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int employeeid;
		employeeid=Integer.valueOf(request.getParameter("action"));
		PrintWriter out=response.getWriter();
		//out.print("Employee ID::" +employeeid);
		
		EmployeeServiceInterface employeeServiceInterface=new EmployeeService();
		String choice=request.getParameter("operation");
		switch (choice) {
		case "Delete": {
			boolean result=employeeServiceInterface.deleteEmployeebyEmployeeid(employeeid);
			if(result) {
				response.sendRedirect("index.jsp");
			}else
			{
				out.print("Delete Failed");
			}
			break;
		}
		case "Update":{
			Employee employee=employeeServiceInterface.getemployeeByEmployeeId(employeeid);
			System.out.println(employee);
			HttpSession Session=request.getSession();
			Session.setAttribute("emp", employee);
			response.sendRedirect("updateemployee.jsp");
			break;
		}
		
		}
		
	}

}
