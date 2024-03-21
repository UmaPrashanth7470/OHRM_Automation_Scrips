package com.Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Log4j_Utility.Log;

public class Base_for_dropdown {
	static WebDriver driver;

	@BeforeClass
	public void ApplicationLaunch() {
		//System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		System.out.println("launche browser");
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard#");
		System.out.println("navigates the ohrm");
		
		
		By usernameproperty = By.id("txtUsername");
		WebElement username = driver.findElement(usernameproperty);
		username.sendKeys("Uma@7470");

		By passwordproperty = By.id("txtPassword");
		WebElement password = driver.findElement(passwordproperty);
		password.sendKeys("Pra@7470");

		// btnLogin

		By loginproperty = By.id("btnLogin");
		WebElement login = driver.findElement(loginproperty);
		login.click();
		System.out.println(" ohrm login");

		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	

	@AfterClass
	public void ApplicationClose() {
		driver.close();
	System.out.println("driver close");
	}

}
