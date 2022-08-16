package com.mindgate.pojo;

public class Employee {
private int Employeeid;
private String name;
private double salary;
public Employee() {
	
}
public Employee(int employeeid, String name, double salary) {
	super();
	Employeeid = employeeid;
	this.name = name;
	this.salary = salary;
}
public int getEmployeeid() {
	return Employeeid;
}
public void setEmployeeid(int employeeid) {
	Employeeid = employeeid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [Employeeid=" + Employeeid + ", name=" + name + ", salary=" + salary + "]";
}

}
