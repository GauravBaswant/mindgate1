package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The Employeeid");
		int Employeeid=scanner.nextInt();
		System.out.println("Enter The Name");
		String name=scanner.next();
		System.out.println("Enter The Salary");
		double salary=scanner.nextDouble(); 
	EmployeeServiceInterface employeeServiceInterface=new EmployeeService();
	//Employee employee=new Employee();
	Employee employee=new Employee(Employeeid, name, salary);
	boolean result=employeeServiceInterface.addNewEmployee(employee);
	if(result) {
		System.out.println("inserted value");
	}
	else
	{
		System.out.println("insert fails");
	}
	}

}
