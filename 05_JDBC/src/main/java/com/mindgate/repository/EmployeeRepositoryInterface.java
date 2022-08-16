package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	List<Employee> getOneEmployees(int employeeId);
	
	boolean deleteEmployeebyEmployeeid(int employeeid);
	
	Employee getemployeeByEmployeeId(int employeeId);
	
	boolean updateEmployee(Employee employee);

}
