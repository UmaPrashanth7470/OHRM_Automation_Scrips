package com.screen_shots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_taking {
	
	public static WebDriver driver;
	static String meena_papa = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd0F6dNjrAPRdvDVBmwk3Jj6EvpF1XuE5FtGGbb4jK8S3sCOzd";
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Chrome Browser Launched");
		
		driver.get(meena_papa);
		System.out.println("Meena papa image Opened");

		
		File amazonScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(amazonScreenshot, new File("./ScreenShots_of_Uma/meena_papashotHP.png"));
		System.out.println("Took ScreenShot of Amazon Captcha or HomePage");
		
		driver.quit();
	}
}
