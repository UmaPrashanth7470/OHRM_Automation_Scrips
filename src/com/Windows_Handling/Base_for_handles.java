package com.Windows_Handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_for_handles {
	public static WebDriver driver;

	//globalize the driver
	@BeforeTest
	public void applicationLaunch() {
		driver = new ChromeDriver();
		// browser launching
		 System.out.println("launch the browser");
		// log.info("Launch the Browser");
	//	Log.info("Syso");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//getting the application
		 System.out.println("get the aplliction");
		// log.info("getting the World Clock - Time And Date Application");
		//Log.info("getting the World Clock - Time And Date Application");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

//	@AfterTest
	public void applicationClose() {
		driver.close();
		 System.out.println("close the browser");
		//Log.info("Close the Browser");
	}


}
