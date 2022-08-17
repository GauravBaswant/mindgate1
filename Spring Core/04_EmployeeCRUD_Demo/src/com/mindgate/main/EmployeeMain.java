package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("main starts");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeServiceInterface employeeServiceInterface=applicationContext.getBean("employeeService", EmployeeServiceInterface.class);
		employeeServiceInterface.addEmployee();
		System.out.println("main ends");
	}
}
