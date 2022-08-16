<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee CRUD</title>
</head>
<body>
<h3>Add New Employee</h3>
<form action="AddNewEmployeeServlet" method="post">
EmployeeId :<input type="text" name="employeeid"><br>
Name :<input type="text" name="employeename"><br>
Salary:<input type="text" name="employeesalary"><br>
<input type="submit" value="Add Employee">
</form>
</body>
</html>