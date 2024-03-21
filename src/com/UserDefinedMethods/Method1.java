package com.UserDefinedMethods;

public class Method1 {
	public void addition() {
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		
	}

	public void subtraction() {
		int a = 20;
		int b = 30;
		int c = a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Method1 arthemeticOperations = new Method1();
		arthemeticOperations.addition();
		arthemeticOperations.subtraction();
		arthemeticOperations.multiplications();
		arthemeticOperations.division();
	}

	public void division() {
		int a = 20;
		int b = 30;
		int c = a/b;
		System.out.println(c);
	}

	public void multiplications() {
		int a = 20;
		int b = 30;	
		int c = a*b;
		System.out.println(c);
	}
}
