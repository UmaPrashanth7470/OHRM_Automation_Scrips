package com.Windows_Handling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiple_tabs_2 {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/watch?v=_GqYza1yQ9c");
		String win = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mov.ibomma.rs/telugu-movies/");

		driver.quit();

		Set<String> handle = driver.getWindowHandles();

		for (String window : handle) {
			if (window != win) {
				driver.switchTo().window(win);
				System.out.println(handle);
			}

		}
	}

}
