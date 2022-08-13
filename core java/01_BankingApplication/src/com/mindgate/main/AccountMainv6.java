package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Saving;

public class AccountMainv6 {
public static void main(String[] args) {
	Account account;
	 account=new Saving(101, "GAURAV BASWANT", 3000, false);
	 System.out.println(account.withdraw(2000));
}
}
