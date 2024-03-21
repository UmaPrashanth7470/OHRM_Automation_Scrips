package com.APSRTC_valids;

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

public class Apsrtc_screenshots {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("launch the browser");
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		System.out.println("maximisize the window");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for finding elements");

		By header_block_property = By.className("menu-wrap");
		WebElement header_block = driver.findElement(header_block_property);

		By header_links_property = By.tagName("a");
		List<WebElement> header_links = driver.findElements(header_links_property);

		int header_link_count = header_links.size();
		System.out.println("this are no of header links:" + header_link_count);

		for (int index = 3; index < 7; index++) {
			String headBlock_links_Name = header_links.get(index).getText();
			System.out.println(index + " - " + headBlock_links_Name);
			header_links.get(index).click();
			File apsrtc_images = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(apsrtc_images,
					new File("C:\\trainings\\selenium automation\\work space\\java project\\apsrtcscreenshots/"
							+ headBlock_links_Name + ".png"));
			
			System.out.println();
			driver.navigate().back();
			Thread.sleep(5000);
			header_block = driver.findElement(header_block_property);
			header_links = header_block.findElements(header_links_property);

			header_link_count = header_links.size();
			System.out.println(" The current size of the arrayList is :- " + header_link_count);
			System.out.println("captures the screenshot");

		}

		driver.quit();

	}

}
