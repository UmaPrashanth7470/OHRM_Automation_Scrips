package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_annotations {

	@Test
	public void testcase_1() {
		System.out.println("this is the test case_1");
	}

	@Test
	public void testcase_2() {
		System.out.println("this is the test case_2");

	}

	@Test
	public void testcase_3() {
		System.out.println("this is the test case_3");

	}

	@Test
	public void testcase_4() {
		System.out.println("this is the test case_4");
	}

	@Test(enabled = false)
	public void testcase_5() {
		System.out.println("this is the test case_5");
	}

	@Test(enabled = true)
	public void testcase_6() {
		System.out.println("this is the test case_6");
	}
       
	@BeforeMethod
	public void beforemethod() {
		System.out.println("this will execute before every method");

	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("this will execute after every method");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("this will execute before class");

	}

	@AfterClass
	public void afterclass() {
		System.out.println("this will execute after class");

	}

	@BeforeTest
	public void beforetest() {
		System.out.println("this will execute before the test");

	}

	@AfterTest
	public void aftertest() {
		System.out.println("this will execute after the test");

	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("this will execute before  the test suite");

	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("this will execute after  the test suite");

	}

	@Parameters
	public void parameter() {
		System.out.println("This is used to pass Arguments to the Test Cases from a file called TestNG.xml");

	}

	@DataProvider
	public void dataprovider() {
		System.out.println("Is used to pass Data . It returns Double Dimensional Object Array.");

	}
}
