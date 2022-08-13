package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMainv2 {
public static void main(String[] args) {
	
	Account account= new Account(101,"test",1000);
	System.out.println("withdraw :: 500");
	
	boolean result=account.withdraw(500);
	if(result)
	{
		System.out.println("transaction Success");
		
	}
	else
	{
		System.out.println("Transaction Fails");
	}
System.out.println("balance:"+ account.getBalance());
}
}
