package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;
	
	public void accept() {
		Scanner scanner = null;
		try
		{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number 1");
		num1 = scr.nextInt();
		 
	    System.out.println("Enter number 2");
		num2 = scr.nextInt();
	}
	catch(InputMismatchException e)
		{
		System.out.println("invalid input");
		}
		finally
		{
			scanner.close();
		}
	}
	
	public void calculate() {
		System.out.println("In calculate");
		result = num1 + num2;
	}
	
	public void display() {
		System.out.println("Result is :" +result);
	}

}
