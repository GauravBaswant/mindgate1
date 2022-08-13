package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositoryMain {
	public static void main(String[] args) {
		EmployeeRepository emp = new EmployeeRepository();
		Employee employee1 = new Employee(1, "test", 10000);
		Employee employee2 = new Employee(2, "test", 10000);
		Employee employee3 = new Employee(3, "test", 10000);

		emp.addEmployee(employee1);
		emp.addEmployee(employee2);
		emp.addEmployee(employee3);

		List<Employee> eList = emp.getAllemployee();

		for (Employee employee : eList) {
			System.out.println(employee);
		}
		emp.deleteEmployeebyid(3);

		System.out.println("after delete");

		for (Employee employee : eList) {
			System.out.println(employee);
		}
		System.out.println("before update");
		System.out.println(eList);
		
		System.out.println("after update");
		Employee employee4=new Employee(2, "start", 1000);
		System.out.println(employee4);
	}
}
