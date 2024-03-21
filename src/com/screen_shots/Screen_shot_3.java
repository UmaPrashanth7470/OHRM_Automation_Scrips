package com.screen_shots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot_3 {
	 public static WebDriver driver;
	 public static String fb_screenshot="https://www.facebook.com/";
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 System.out.println("launch the browser");
		 driver.manage().window().maximize();
		 System.out.println("maximisize the window");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 System.out.println("wait for the element for the finding");
		 driver.get(fb_screenshot);
		 File fbscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(fbscreenshot, new File("C:\\trainings\\selenium automation\\work space\\java project\\ScreenShots_of_Uma/fb_page_screenshot.png"));
	System.out.println("screenshot captured");
	driver.quit();
	System.out.println("quit the driver");
	
	
	
	
	
	
	
	
	
	
	
	}


}
