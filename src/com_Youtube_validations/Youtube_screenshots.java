package com_Youtube_validations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_screenshots {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launch the browser");
		driver.manage().window().maximize();
		System.out.println("maximisize the windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for find element");
		driver.get("https://www.youtube.com/");
		System.out.println("opens the youtube");
		
		By Youtubeheader_property=By.id("scroll-container");
		WebElement youtube_header=driver.findElement(Youtubeheader_property);
		
		By youtube_header_links_property=By.tagName("yt");
		List<WebElement> youtube_header_links=driver.findElements(youtube_header_links_property);
		int headerlinks_count=youtube_header_links.size();
		System.out.println("this is the header links of youtube; "+headerlinks_count);
		driver.quit();
		System.out.println("close  the browser");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
