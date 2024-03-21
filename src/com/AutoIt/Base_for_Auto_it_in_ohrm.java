package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Log4j_Utility.Log;

public class Base_for_Auto_it_in_ohrm {
	static WebDriver driver;

	@BeforeClass
	public void ApplicationLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		
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
	

		
	
	
	public void AddEmployeeDetails_ProfilePic() throws InterruptedException, IOException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.id("firstName")).sendKeys("Puri");
		actions.sendKeys(Keys.TAB).build().perform();
		
		actions.sendKeys("Jagannadh").build().perform();
		actions.sendKeys(Keys.TAB).build().perform();

		actions.sendKeys("Director").build().perform();
//		actions.sendKeys(Keys.TAB).build().perform();
//		actions.sendKeys(Keys.TAB).build().perform();
//		
//		actions.sendKeys(Keys.ENTER).build().perform();
		
		

		Thread.sleep(3000);


		WebElement profilePhoto = driver.findElement(By.id("photofile"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", profilePhoto);
		Thread.sleep(5000);
		
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Hp\\Desktop\\puri pic.exe");
		
		Thread.sleep(5000);

		// id="btnSave"
		
		WebElement save = driver.findElement(By.id("btnSave"));
		save.click();

		Thread.sleep(5000);

	}

	
	

	@AfterClass
	public void ApplicationClose() {
		driver.close();
	System.out.println("driver close");
	}

}



