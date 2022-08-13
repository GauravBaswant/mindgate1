package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;

public interface EmployeeServiceInterface {
boolean addNewEmployee(Employee employee);
List<Employee> getAllEmployee();

boolean deleteEmployeebyEmployeeid(int employeeid);

boolean updateEmployeebyEmployeeid(int employeeid);

}

