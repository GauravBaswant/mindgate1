<%@page import="javax.websocket.Session"%>
<%@page import="com.mindgate.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee  CRUD </title>
</head>
<body>
<h3>Update Employee</h3>
<% 
Employee employee=(Employee) session.getAttribute("emp");
%>
<form action="UpdateEmployeeServlet" method="post">
EmployeeId :<input type="text" name="employeeid" readonly="true" value="<%=employee.getEmployeeid()%>"><br>

Name :<input type="text" name="employeename" value="<%= employee.getName() %>"><br>

Salary:<input type="text" name="employeesalary" value="<%= employee.getSalary() %>"><br>

<input type="submit" value="Update Employee">

</form>
</body>
</html>