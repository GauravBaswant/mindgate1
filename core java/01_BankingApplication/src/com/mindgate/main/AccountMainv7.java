package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Saving;
import com.mingate.factory.AccountFactory;

public class AccountMainv7 {
	public static void main(String[] args) {
		AccountFactory accountfactory=new AccountFactory();
Scanner sc=new Scanner(System.in);
System.out.println("choice 1-Saving");
System.out.println("choice 2-Current");
System.out.println("Enter Your Choice");
int choice;
choice=sc.nextInt();
Account account=accountfactory.getAccount(choice);
if(account instanceof Saving)
System.out.println("Saving Object Created");
if(account instanceof Current)
System.out.println("Current Object Created");

}
}