package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		int Employeeid;
		String name;
		double salary;
		String ContinueChoice;
		int Choice;
		Scanner scanner = new Scanner(System.in);
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		List<Employee> AllEmployeeList;
		do {
			System.out.println("menu");
			System.out.println("choice 1-Add New Employee");
			System.out.println("Choice 2-Update New Employee");
			System.out.println("Choice 3-Delete Employee");
			System.out.println("Choice 4-Select One Employee");
			System.out.println("Choice 5-Select All Employee");
			System.out.println("enter the Choice");
			Choice = scanner.nextInt();
			switch (Choice) {
			case 1:
				System.out.println("Enter The Employeeid");
				Employeeid = scanner.nextInt();
				System.out.println("Enter The Name");
				name = scanner.next();
				System.out.println("Enter The Salary");
				salary = scanner.nextDouble();
				EmployeeServiceInterface employeeServiceInterface1 = new EmployeeService();
//Employee employee=new Employee();
				Employee employee = new Employee(Employeeid, name, salary);
				boolean result = employeeServiceInterface1.addNewEmployee(employee);
				if (result) {
					System.out.println("inserted value");
				} else {
					System.out.println("insert fails");
				}

				break;

			case 5:
				AllEmployeeList = employeeServiceInterface.getAllEmployee();
				for (Employee employee2 : AllEmployeeList) {
					System.out.println(employee2);
				}
				break;

			default:
				System.out.println("Invalid Choice");
				break;
				
			case 3:System.out.println("Enter The Employeeid");
			Employeeid = scanner.nextInt();
			boolean result1 = employeeServiceInterface.deleteEmployeebyEmployeeid(Employeeid);
			if (result1) {
				System.out.println("delete value");
			} else {
				System.out.println("delete fails");
			}

				break;
				
			
			}
			System.out.println("Do you Want To Continue");
			ContinueChoice = scanner.next();
		} while (ContinueChoice.equals("yes"));
	}
}
