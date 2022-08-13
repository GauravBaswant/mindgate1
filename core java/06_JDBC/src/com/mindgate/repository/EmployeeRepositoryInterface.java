package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeRepositoryInterface {
	boolean addNewEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	boolean deleteEmployeebyEmployeeid(int employeeid);
	

}
