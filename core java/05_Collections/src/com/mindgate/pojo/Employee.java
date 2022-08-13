package com.mindgate.pojo;

import java.util.Objects;

public class Employee {
private int employee;
private String name;
private double salary;
public Employee() {
	
}
public Employee(int employee, String name, double salary) {
	super();
	this.employee = employee;
	this.name = name;
	this.salary = salary;
}

@Override
public int hashCode() {
	return Objects.hash(employee, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return employee == other.employee && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
public int getEmployee() {
	return employee;
}
public void setEmployee(int employee) {
	this.employee = employee;
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
	return "Employee [employee=" + employee + ", name=" + name + ", salary=" + salary + "]";
}

}
