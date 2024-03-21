package com.osmania_valids;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ou_screen_shots {
	static WebDriver driver;
	static String ou = "https://www.osmania.ac.in/";

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("launch the browser");
		driver.get(ou);
		System.out.println("get the ou site");
		driver.manage().window().maximize();
		System.out.println("maximisize the window");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for find elements");
		By header_block_properties = By.id("meganavigator");
		WebElement header_block = driver.findElement(header_block_properties);
		/*
		 * By header_links_property = By.tagName("li"); List<WebElement> header_links =
		 * driver.findElements(header_links_property); 
		 * int header_links_count = header_links.size(); System.out.println("this is the actual count:" +
		 * header_links_count);
		 */
		// System.out.println("this is the actual text:"+header_block.getText());
		
		//<a title="Pages " class="level1 havechild  item-link" href="#"><span class="menu-title">About Us</span></a>
		//<a title="Pages " class="level1 havechild  item-link" href="#"><span class="menu-title">Administration</span></a>
		//<a title="Pages " class="level1 havechild  item-link" href="#"><span class="menu-title">Research</span></a>
		By header_dropdown_property = By.className("level1 havechild  item-link");
		List<WebElement> header_dropdown = driver.findElements(header_dropdown_property);
		
		int header_dropdown_Count = header_dropdown.size();
		System.out.println("this is the actual size:"+header_dropdown_Count);

		
		
	
		for (int index = 0; index <= 9; index++) {
			/*
			 * int header_link_noS = header_links.size();
			 * System.out.println("this is the actual nos:" + index + header_link_noS);
			 * String header_links_actual_text = header_links.get(index).getText();
			 * System.out.println("this is the actual text of link:" + index +
			 * header_links_actual_text); 
			 * String header_actual_url =
			 * header_links.get(index).getAttribute("href");
			 * System.out.println("this are actual url :" + index + header_actual_url);
			 * 
			 * System.out.println("clicking links");
			 */
			
			String header_dropdown_text = header_dropdown.get(index).getText();
			System.out.println("this is the actual text of header dropdown:" + index +header_dropdown_text);
			
			header_dropdown.get(index).click();
			
			File ou_images = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ou_images, new File("C:\\trainings\\selenium automation\\work space\\java project\\ou_screenshots/" + header_dropdown_text + ".png"));
			Thread.sleep(5000);
		driver.navigate().back();
	Thread.sleep(5000);
	header_block = driver.findElement(header_block_properties);
//			header_links = header_block.findElements(header_links_property);

		}
		driver.quit();
		System.out.println("close the browser");

	}

}
