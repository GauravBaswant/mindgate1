package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Saving;

public class AccountMainv4 {
	public static void main(String[] args) {
		int accountNumber;
		int Choice;
		String name;
		double balance;
		boolean isSalary;
		String Continue;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		name=scanner.next();
		System.out.println("enter your accountNumber");
		accountNumber=scanner.nextInt();
		System.out.println("Do You Want To Open Salary Account(true|false)S");
		isSalary=scanner.nextBoolean();
		
		Saving account3=new Saving(accountNumber,name,50000, isSalary);
		System.out.println(account3);
		do
		{
			System.out.println("menu");
		System.out.println("choice 1-Withdraw");
		System.out.println("Choice 2-Deposit");
		System.out.println("Choice 3-Balance");
		System.out.println("enter the Choice");
		Choice=scanner.nextInt();
		switch(Choice)
		{
		case 1:
			System.out.println("enter the withdraw amount");
			int ac;
			ac=scanner.nextInt();
			account3.withdraw(ac);
			System.out.println("Withdraw Successful");
			System.out.println("your balance is:"+account3.getBalance());
		break;
		case 2:System.out.println("enter amount to be deposited");
		    int dac;
		    dac=scanner.nextInt();
		    account3.deposit(dac);
		    System.out.println("your balance is:"+account3.getBalance());
			break;
		case 3:System.out.println("your balance is:"+account3.getBalance());
		break;
		}
		System.out.println("Do you Want To Continue");
		Continue=scanner.next();
		}while(Continue.equals("yes"));
	}
}
