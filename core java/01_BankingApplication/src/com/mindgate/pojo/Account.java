package com.mindgate.pojo;
public abstract class Account extends Object {
	private int accountNumber;
	private String Name;
	private double balance;

	public Account() {

	}

	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance = balance - amount;
				return true;
			}
		}
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", Name=" + Name + ", balance=" + balance + "]";
	}

}