package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.mindgate.pojo.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {
	
	private String driverName="oracle.jdbc.driver.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="system";
	private String password="mindgate123";
	private List<Employee> employees;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	private static final String INSERT_EMPLOYEE="insert into employee_details values(?,?,?)";
	private static final String SELECT_ALL_EMPLOYEE="select* from employee_details";
	private static final String DELETE_EMPLOYEE="delete from employee_details where employee_id=?";
	@Override
	public boolean addNewEmployee(Employee employee) {
		try {
			Class.forName(driverName);
		    connection=DriverManager.getConnection(url, user, password);
		    preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
		    preparedStatement.setInt(1, employee.getEmployeeid());
		    preparedStatement.setString(2, employee.getName());
		    preparedStatement.setDouble(3, employee.getSalary());
		    
		    int insertcount=preparedStatement.executeUpdate();
		    if(insertcount>0)
		    {
		    	return true;
		    }
		    
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	@Override
	public List<Employee> getAllEmployee() {
		try {
			Class.forName(driverName);
		    connection=DriverManager.getConnection(url, user, password);
		    preparedStatement=connection.prepareStatement(SELECT_ALL_EMPLOYEE);
		    resultSet=preparedStatement.executeQuery();
		    
		    employees=new ArrayList<>();
		    while(resultSet.next()) {
		    	int employeeid=resultSet.getInt("employee_id");
		    	String name=resultSet.getString("name");
		    	double salary=resultSet.getDouble("salary");
		    	Employee employee=new Employee(employeeid, name, salary);
		    	employees.add(employee);
		    }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}
	@Override
	public boolean deleteEmployeebyEmployeeid(int employeeid) {
		try {
			Class.forName(driverName);
		    connection=DriverManager.getConnection(url, user, password);
		    preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
		    preparedStatement.setInt(1, employeeid);
		    
		    int insertcount=preparedStatement.executeUpdate();
		    if(insertcount>0)
		    {
		    	return true;
		    }
		    
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
