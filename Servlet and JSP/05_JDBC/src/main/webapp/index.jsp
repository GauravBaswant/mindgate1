<%@page import="com.mindgate.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.mindgate.repository.EmployeeRepository"%>
<%@page import="com.mindgate.repository.EmployeeRepositoryInterface"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
	<h3>All Employees</h3>
	<%!EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepository();%>
	<%
	List<Employee> allemployees = employeeRepositoryInterface.getAllEmployee();
	%>
<form action="ActionServlet" method="post">
	<table border="1" style="width: 100%">
		<tr>
			<td>EmployeeId</td>
			<td>Name</td>
			<td>Salary</td>
			<td>Action</td>
		</tr>
		<%
		for (Employee employee : allemployees) {
		%>
		<tr>
			<td> <%=employee.getEmployeeid()%></td>
			<td> <%=employee.getName()%></td>
			<td> <%=employee.getSalary()%></td>
			<td><input type="radio" name="action" value="<%=employee.getEmployeeid()%>"></td>
		</tr>
		<%
		}
		%>
	</table>
	<br><input type="submit" value="Delete" name="operation">
	<br><input type="submit" value="Update" name="operation">
	</form>
	<b></b>
	<form action="newemp.jsp">
	<input type="submit" value="AddNew">
	</form>
</body>
</html>