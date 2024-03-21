package com.screen_shots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot_5 {
	public static void main(String[] args) throws IOException {
		WebDriver vsr;
		String veera="https://www.youtube.com/watch?v=8jjTB0vbtP0";
		System.setProperty("webdriver.edge.driver","C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe");
	    vsr=new EdgeDriver();
	    vsr.get(veera);
	    File v_s_r_image=((TakesScreenshot)vsr).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(v_s_r_image,new File("C:\\trainings\\selenium automation\\work space\\java project\\ScreenShots_of_Uma/VSR_screen_shot.png"));
	    System.out.println("screenshotcaptures");
	    vsr.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
