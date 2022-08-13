package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class ExecptionMain {

	public static void main(String[] args) {
System.out.println("main Start");
Calculation obj=new Calculation();
obj.accept();
obj.display();
obj.calculate();

		System.out.println("main end");
	}

}
