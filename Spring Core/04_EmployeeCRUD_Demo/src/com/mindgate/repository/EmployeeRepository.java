package com.mindgate.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository implements EmplyeeRepositoryInterface {
@Override
public boolean addEmployee() {
	System.out.println("EmployeeRepository addemployee Method");
	return false;
}
}
