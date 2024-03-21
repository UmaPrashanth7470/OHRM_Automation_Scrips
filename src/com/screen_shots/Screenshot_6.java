package com.screen_shots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot_6 {
	public static void main(String[] args) throws IOException {
		WebDriver baby;
		String babysong="https://www.youtube.com/watch?v=D_SRMiIWyL4&list=RDMMs5Ajs4SYqg8&index=5";
		System.setProperty("webdriver.gecko.driver","C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		baby=new FirefoxDriver();
		baby.get(babysong);
		File babysong_pic=((TakesScreenshot)baby).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(babysong_pic, new File("C:\\trainings\\selenium automation\\work space\\java project\\ScreenShots_of_Uma/babyscreenhot.png"));
		System.out.println("screen shot captures");
		baby.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
