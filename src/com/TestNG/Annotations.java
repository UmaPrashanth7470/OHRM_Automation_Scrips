package com.TestNG;

import org.testng.annotations.Test;

public class Annotations {
	@Test 
	public void Bank() {
		String wel="welcome to our bank";
		System.out.println(wel);
	}
	@Test (priority = 2,description = "second")
	public void Bank_1() {
		System.out.println(" check the current balance ");
	}
	@Test (priority = 3,description = "three")
	public void Bank_2() {
		System.out.println("deposit the amount");
		
	}
	@Test(priority = 4,description = "four")
	public void Bank_3() {
		System.out.println("withdrawl the amount");
	}

	
	

}
