package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
public static void main(String[] args) {
	System.out.println("main starts");
//	System.out.println("Creating the address object and calling set methods");
//	Address address=new Address();
//	address.setAddressid(1);
//	address.setBuildingName("Antilia");
//	address.setCity("thane");
//	address.setHousenumber("102");
//	address.setPin("421601");
//	address.setStreet("agra road");
//	System.out.println(address);
	System.out.println("main ends");
//	System.out.println();
//	System.out.println("Creating the employee object and calling set methods");
//	Employee employee=new Employee(2, "grey", 5000, address);
//	System.out.println(employee);
	Address address=new Address(1, "emperial", "thane", "103","421601 ","agra road");
	Employee employee=new Employee(3, "jasper", 50000, address);
	System.out.println(employee);
}
}
