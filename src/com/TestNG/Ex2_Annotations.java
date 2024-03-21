package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex2_Annotations {

	@BeforeSuite
	public void before_suite() {
		System.out.println("this is the before suite it execute the first");
	}

	@BeforeTest
	public void before_test() {
		System.out.println("this is the before test it execute the after the before suite");
	}

	@BeforeClass
	public void before_class() {
		System.out.println("this is the before class it execute the after the before test");

	}

	@BeforeMethod

	public void before_methods() {
		System.out.println("this is the before method it execute the after the before class");

	}

	@Test
	public void test_case_1() {
		System.out.println(
				"this is the test,it considered as test case, it execute the after the all before annotations");

	}

	@Test
	public void test_case_2() {
		System.out.println(
				"this is the test_2,it considered as test case, it execute the after the all before annotations");

	}

	@Test
	public void test_case_3() {
		System.out.println(
				"this is the test_3,it considered as test case, it execute the after the all before annotations");

	}

	@Test
	public void test_case_4() {
		System.out.println(
				"this is the test_4,it considered as test case, it execute the after the all before annotations");

	}

	@Test(enabled = true)
	public void test_case_5() {
		System.out.println(
				"this is the test_5,it considered as test case, it executes because we gave the enabled =true after the all before annotations");

	}

	@Test(enabled = false)

	public void test_case_6() {
		System.out.println(
				"this is the test_6,it considered as test case, it not  execute because we gave the false in enabled false");

	}

	@AfterMethod
	public void after_methods() {
		System.out.println("this is the after method it execute the after the every tests(test_case)");

	}

	@AfterClass
	public void after_class() {
		System.out.println(
				"this is the after class it execute the after the completes of all methods and all test cases");

	}

	@AfterTest
	public void after_test() {
		System.out.println(
				"this is the after test it execute the after the completes of all methods and all test cases in the class");

	}

	@AfterSuite
	public void after_suite() {
		System.out.println("this is the after suite it completes of all tests but it not executes");

	}

}
