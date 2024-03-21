package com.screen_shots;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot_taking2 {
	 public static WebDriver sripapa;
	 static  String sripapa_screenshot="https://www.indiatoday.in/visualstories/entertainment/ethnic-beauty-sreeleela-42522-14-06-2023";
	 
	
	
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		sripapa=new ChromeDriver();
		System.out.println("chrome launch");
		sripapa.get(sripapa_screenshot);
		File movie_screnshot=((TakesScreenshot)sripapa).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(movie_screnshot, new File ("./ScreenShots_of_Uma/sri_papa_screenshot.png"));
		System.out.println("screen shot captured");
		
		
		sripapa.quit();
		
		
	}
	

}
