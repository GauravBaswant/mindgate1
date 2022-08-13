
package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	List<Employee> empList = new ArrayList<Employee>();

	public boolean addEmployee(Employee employee) {

		return empList.add(employee);

	}

	public List<Employee> getAllemployee() {
		return empList;

	}

	public Employee getEmployeeByid(int employeeid) {
		for (Employee employee : empList)
			if (employee.getEmployee() == employeeid) {
				return employee;
			}
		return null;
	}

	public boolean deleteEmployeebyid(int employeeid) {
		for (Employee employee : empList) {
			if (employee.getEmployee() == employeeid) {
				boolean result = empList.remove(employee);
				return result;
			}
		}
		return false;
	}
public boolean updateEmployee(Employee emp)
{
for(Employee em: empList) {
   if(em.getEmployee()==emp.getEmployee())
   {
	   emp.setName(emp.getName());
	   emp.setSalary(emp.getSalary());
	   return true;
   }
  
}
return false;
}
}
