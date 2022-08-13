package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {
public static void main(String[] args) {
	List<String> nameList=new ArrayList<>();
	System.out.println(nameList.size());
	nameList.add("anjali");
	nameList.add("rahul");
	nameList.add("raj");
	nameList.add("harsh");
	nameList.add("rishi");
	nameList.add("gaurav");
	System.out.println(nameList);
	System.out.println(nameList.size());
	nameList.remove(2);
	System.out.println("after remove");
	System.out.println(nameList);
	System.out.println(nameList.size());
	
	System.out.println();
	List<Employee> employeeList=new ArrayList<>();
	
	Employee employee1=new Employee(111, "ajay", 1000);
	Employee employee2=new Employee(112, "jay", 1000);
	Employee employee3=new Employee(113, "viraj", 1000);
	
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	
	System.out.println(employeeList);
	
	System.out.println("-------------------");
	for(Employee e : employeeList)
	{
		System.out.println(e);
	}
	
	System.out.println("======================Set");
	Set<String> nameSet=new HashSet<>();
	nameSet.add("javed");
	nameSet.add("nagesh");
	nameSet.add("bikas");
	nameSet.add("vijay");
	nameSet.add(null);
	nameSet.add(null);
	System.out.println(nameSet);
	
	System.out.println("=====================TreeSet");
	
	SortedSet<String> sortedSet=new TreeSet<>();
	sortedSet.add("javed");
	sortedSet.add("nagesh");
	sortedSet.add("bikas");
	sortedSet.add("vijay");
	System.out.println(sortedSet);
	
	System.out.println("==========================Hashmap");
	
	HashMap<Integer,String> employeeMap=new HashMap<>();
	employeeMap.put(1,"javed");
	employeeMap.put(2,"nagesh");
	employeeMap.put(3,"bikas");
	employeeMap.put(4,"vijay");
	employeeMap.put(5, null);
	System.out.println(employeeMap);
	
	System.out.println("=======================");
	Integer i=50;
	System.out.println(i.hashCode());
	
	System.out.println("++++++++++++++++++++++TreeMap");
	SortedMap<Integer,String> employeesortedMap=new  TreeMap<>();
	employeesortedMap.put(1, "test 1");
	employeesortedMap.put(10, "test 10");
	employeesortedMap.put(4, "test 4");
	employeesortedMap.put(6, "test 6");
	
	System.out.println(employeesortedMap);
}
}
