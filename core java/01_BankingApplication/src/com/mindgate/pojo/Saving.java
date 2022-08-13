package com.mindgate.pojo;

public class Saving extends Account{
private boolean isSalary;
public Saving() {
	
}
public Saving(int accountNumber, String name, double balance, boolean isSalary) {
	super(accountNumber, name, balance);
	this.isSalary = isSalary;
}
@Override
	public boolean withdraw(double amount) {
	if(isSalary)
	{
		if(amount<=getBalance() && amount>0)
		{
			setBalance(getBalance()-amount);
			return true;
		}
		else
		{
			if(amount>0 && (getBalance()-amount)>=2000)
			{
				setBalance(getBalance()-amount);
				return true;
			}
		}
	}
		return false;
	}
@Override
	public boolean deposit(double amount) {
	if(amount>0)
	{
		setBalance(getBalance()+amount);
		return true;
	}
		return false;
	}
}

