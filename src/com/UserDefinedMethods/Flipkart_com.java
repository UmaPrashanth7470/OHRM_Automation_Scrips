package com.UserDefinedMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_com {
	public static WebDriver driver;
	public static String flipkart = "https://www.flipkart.com/";

	public void opening_operation() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("launch the browser");
		driver.get(flipkart);
	}

	public void main_operation() throws IOException, InterruptedException {
		driver.manage().window().maximize();
		System.out.println("maximisize the window");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for element");

		// overallxpath=//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]
		// groceryxpath=//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[1]/div/div/span/span
		// mobilexpath=//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/span/span
		// appliancesxpath=//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[3]/div/div/span/span
		// travelsxpath=//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[4]/div/div/span/span

		By headerblock_property = By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]");
		WebElement headerblock = driver.findElement(headerblock_property);

		By headerLinkproperty = By.tagName("a");
		List<WebElement> header_link = headerblock.findElements(headerLinkproperty);

		int header_count = header_link.size();
		System.out.println("the links count:" + header_count);

		for (int index = 0; index < header_count; index++) {
			String header_links_actualtext = header_link.get(index).getText();
			System.out.println(index + " - ActualText :- " + header_links_actualtext);

			String header_links_actualUrl = header_link.get(index).getAttribute("href");
			System.out.println(index + " -Actual url:" + header_links_actualUrl);

			
			  header_link.get(index).click(); System.out.println("clicking the links");
			  
			  File flipimages = ((TakesScreenshot)
			  driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(flipimages, new
			  File("./flipkartscreenshots/flipkartpics" + header_links_actualtext +
			  ".png")); System.out.println("captures screenshot");
			  
			  Thread.sleep(5000); driver.navigate().back();
			  System.out.println("backs the home page"); Thread.sleep(3000);
			  
			  headerblock = driver.findElement(headerblock_property); 
			  header_link = headerblock.findElements(headerLinkproperty);
			 
		}

	}

	public void closing_operation() {
		driver.quit();
		System.out.println("close the driver");

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Flipkart_com flip = new Flipkart_com();
		flip.opening_operation();
		flip.main_operation();
		flip.closing_operation();
	}

}
