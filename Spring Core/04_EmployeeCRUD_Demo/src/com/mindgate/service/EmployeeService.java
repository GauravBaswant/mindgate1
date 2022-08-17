package com.mindgate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmplyeeRepositoryInterface;
@Service
public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	private EmplyeeRepositoryInterface emplyeeRepositoryInterface;
@Override
public boolean addEmployee() {
	System.out.println("EmployeeService addemployee Method");
	
	return emplyeeRepositoryInterface.addEmployee();
	
}
public EmplyeeRepositoryInterface getEmplyeeRepositoryInterface() {
	return emplyeeRepositoryInterface;
}
public void setEmplyeeRepositoryInterface(EmplyeeRepositoryInterface emplyeeRepositoryInterface) {
	this.emplyeeRepositoryInterface = emplyeeRepositoryInterface;
}
}
