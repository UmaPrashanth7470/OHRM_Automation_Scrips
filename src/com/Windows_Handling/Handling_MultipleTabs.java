package com.Windows_Handling;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultipleTabs {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		// browser launching
		System.out.println("launch the browser");
		driver.get("https://www.timeanddate.com/worldclock/");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/downloads/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ebay.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.bookmyshow.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/");
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String window : handles) {
			if (window != parentWindow) {
				driver.switchTo().window(parentWindow);
				System.out.println(handles);
				
			}
		}
		
		
	}

}
