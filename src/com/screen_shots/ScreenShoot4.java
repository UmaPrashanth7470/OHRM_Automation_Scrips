package com.screen_shots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot4 {
	public static void main(String[] args) throws IOException {
		WebDriver ratantata;
		//https://en.wikipedia.org/wiki/Ratan_Tata
		String ratan_wiki_screenshot="https://en.wikipedia.org/wiki/Ratan_Tata";
		
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		ratantata=new ChromeDriver();
		ratantata.get(ratan_wiki_screenshot);
		
		File ratan_screen_shot=((TakesScreenshot)ratantata).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ratan_screen_shot,new File("C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/ratanTaTa_sir_screenshot.png"));
		System.out.println("screenshot captures");
		
		
	}

}
