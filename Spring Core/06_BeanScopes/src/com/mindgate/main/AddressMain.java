package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;

public class AddressMain {
public static void main(String[] args) {
	System.out.println("main starts");
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("application context is created");
	Address address=applicationContext.getBean("address", Address.class);
	System.out.println(address.hashCode());
	System.out.println();
	Address address2=applicationContext.getBean("address", Address.class);
	System.out.println(address2.hashCode());
	System.out.println("main ends");
}
}
