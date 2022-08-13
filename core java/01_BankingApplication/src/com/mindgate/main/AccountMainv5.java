package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountMainv5 {

	public static void main(String[] args) {
		Current current = new Current(101, "gaurav baswant", 10000, 50000);

		System.out.println("withdraw: 5000");
		current.withdraw(5000);
		System.out
				.println("balance :" + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());

		System.out.println("---------------");

		System.out.println("withdraw: 15000");
		current.withdraw(15000);
		System.out
				.println("balance :" + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());

		System.out.println("---------------");

		System.out.println("deposite: 5000");
		current.deposit(5000);
		System.out
				.println("balance :" + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());

		System.out.println("---------------");

		System.out.println("deposite:10000");
		current.deposit(10000);
		System.out
				.println("balance :" + current.getBalance() + " Overdraft Balance : " + current.getOverdraftBalance());

	}
}
