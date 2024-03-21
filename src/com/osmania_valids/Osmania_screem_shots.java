package com.osmania_valids;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Osmania_screem_shots {
	static WebDriver driver;
	
//	public static void main(String[] args) throws IOException, InterruptedException {
	public static void openapplication() {
		
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launch the browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for find element");
		String osmana="https://www.osmania.ac.in/";
		driver.get(osmana);
		
		
	
		
		
		
	}
	public void mainoperation() throws IOException, InterruptedException {
		By header_block_property=By.className("menu");
		WebElement header_block=driver.findElement(header_block_property);
		
		By header_links_property=By.tagName("a");
		List<WebElement> header_links=driver.findElements(header_links_property);

		int headerBlock_consists_links=header_links.size();
		System.out.println("this is the size;"+headerBlock_consists_links);
		for (int index=3;index<=9;index++) {
			
			String header_links_text=header_links.get(index).getText();
			System.out.println("this is the actual text of :" + index +"_"+header_links_text);
			
			String header_links_url=header_links.get(index).getAttribute("href");
			System.out.println("this is actual url"+index+"-"+header_links_url);
			
			header_links.get(index).click();
			
			File osmaniaiamages=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(osmaniaiamages, new File("./osmania_screenshots/osmaniapics"+header_links_text+".png"));
			
			driver.navigate().back();
			Thread.sleep(5000);
			header_block=driver.findElement(header_block_property);
			header_links=header_block.findElements(header_links_property);
			headerBlock_consists_links=header_links.size();
			System.out.println("the Actual no.of links in a headerBlock :- "+headerBlock_consists_links);
			
			

		
	}
				}
		
		public void closingoperation() {
			driver.quit();
			System.out.println("close the webdriver");
			
			
		}
		public static void main(String[] args) throws IOException, InterruptedException {
			Osmania_screem_shots osmania_pics=new Osmania_screem_shots();
			osmania_pics.openapplication();
			osmania_pics.mainoperation();
			osmania_pics.closingoperation();
			
			
		}
		
	}

 
