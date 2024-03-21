package com.inheritance;

public class ChildClass extends Parentclass {
	public static void main(String[] args) {
		ChildClass CC=new ChildClass();
		ChildClass CC1=new ChildClass();

		CC.multiplication();
		CC.division(20, 2);
		CC.addition(40, 40);
		CC1.addition(60, 40);
		CC1.division(90, 3);
		CC1.multiplication();
	}

}
