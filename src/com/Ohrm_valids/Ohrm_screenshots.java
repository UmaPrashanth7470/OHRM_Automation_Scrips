package com.Ohrm_valids;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrm_screenshots {
	
	static WebDriver driver;
	static String ohrm="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			public static void main(String[] args) throws IOException, InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("launch the browser");
				driver.manage().window().maximize();
				System.out.println("maximisize the window");
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        System.out.println("wait for find elements");
		        
		        driver.get(ohrm);
		        System.out.println("get th app");
		        
		        By usernameproperty=By.id("txtUsername");
		        WebElement username=driver.findElement(usernameproperty);
		        username.sendKeys("Uma@7470");
		        
		        By passwordproperty=By.id("txtPassword");
		        WebElement password=driver.findElement(passwordproperty);
		        password.sendKeys("Pra@7470");
		        
		        By loginproperty=By.id("btnLogin");
		        WebElement login=driver.findElement(loginproperty);
		        login.click();
		        
		        System.out.println("login the ohrm");
		        System.out.println("navigating to home page");
		        
		        By headerblock=By.className("menu");
		        WebElement header_block=driver.findElement(headerblock);
		        By headerlinksproperty=By.tagName("a");
		        List<WebElement> headerlinks=driver.findElements(headerlinksproperty);
		        
		        int headerlinks_count=headerlinks.size();
		    	 System.out.println("the count of header links:"+headerlinks_count);
		        
		     for(int index=7;index<=9;index++)
		     {
		    	 
		         String headerlinks_actualtext=headerlinks.get(index).getText();
		         System.out.println(index+ "- Actual Text - "+ headerlinks_actualtext);		         
		         
		    	 String headerlinks_actualURLS=headerlinks.get(index).getAttribute("href");
		    	 System.out.println("this is the actual urls"+headerlinks_actualURLS);	
		    	 
		    	 headerlinks.get(index).click();
		    	 
		    	 Thread.sleep(5000);
		    	 System.out.println("clicking the every link");
		    	 
		    	 File ohrmlinkpics =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	 FileUtils.copyFile(ohrmlinkpics,new File("./ohrmscreenshots/ohrmimages"+headerlinks_actualtext+".png" ));
		    	 
//		    	 Thread.sleep(2000);
//		    	 driver.navigate().back();
//		    	 System.out.println("navigates the back");
		    	 
		    	 Thread.sleep(3000);
		    	 header_block=driver.findElement(headerblock);
		    	 headerlinks=header_block.findElements(headerlinksproperty);
		    	 
		     } 	 
		   
		        
		       
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        driver.quit();
		        System.out.println("quit the driver");
		        
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
