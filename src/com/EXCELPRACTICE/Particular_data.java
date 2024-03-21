package com.EXCELPRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Particular_data {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launch the browser");
		
		driver.get("https://www.google.co.in/");
		System.out.println("opens the google");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://webdatacommons.org/webtables/");
		System.out.println("opens the application");
		
		
		
		// /html/body/div[5]/div[2]/table[3]/tbody/tr[1]
		
		
        // /html/body/div[5]/div[2]/table[3]/tbody/tr[5]
		
		String xpath1="/html/body/div[5]/div[2]/table[3]/tbody/tr[4]";
		String xpath2="]";
		/*
		 * for (int i = 1; i <=5; i++) {
		 * 
		 * WebElement xpa=driver.findElement(By.xpath(xpath1+i+xpath2));
		 * 
		 * String text=xpa.getText();
		 * 
		 * System.out.println(i+"the text of xpa"+text);
		 * 
		 * 
		 * 
		 * }
		 */	
		
		
	     for (int i = 0; i <1; i++) {
	    	 WebElement xp=driver.findElement(By.xpath(xpath1));
	    String	text= xp.getText();
	    	 System.out.println(text);
			
		}
	     
	   //  /html/body/div[5]/div[2]/table[3]/tbody/tr[5]/td
	     
	     String cellpath="/html/body/div[5]/div[2]/table[3]/tbody/tr[4]/td";
	     
	     WebElement cell=driver.findElement(By.xpath(cellpath));
	     
		   String celltext=cell.getText();
		   System.out.println(celltext);
		   
		   driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
