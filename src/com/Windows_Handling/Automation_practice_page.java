package com.Windows_Handling;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TestNG.BaseTest;

public class Automation_practice_page extends Base_for_handles {
	
// @Test(priority = 1)
	public void Switch_to_alert() throws InterruptedException {
		By popup_property=By.xpath("//*[@id=\"name\"]");
		WebElement popup=driver.findElement(popup_property);
		popup.sendKeys("sai");
		
		By alert_proerty=By.id("alertbtn");
		WebElement alert=driver.findElement(alert_proerty);
		alert.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
			
	}
// @Test(priority = 2)
// 
// public void switch_window() {
//	 
//	 By openwindow_property=By.xpath("//*[@id=\"openwindow\"]");
//	 WebElement openwindow=driver.findElement(openwindow_property);
//	 openwindow.click();
//	 
//	
//}
 
// @Test(priority = 2)
 public void switch_Tab() throws InterruptedException {
	 
	 String win= driver.getWindowHandle();
	 
	 By open_tab_property=By.xpath("//*[@id=\"opentab\"]");
	 WebElement opentab=driver.findElement(open_tab_property);
	 opentab.click();
	 

		Set<String> handle = driver.getWindowHandles();

		for (String window : handle) {
			if (window != win) {
				
				Thread.sleep(3000);
				driver.switchTo().window(win);
				System.out.println(handle);
			}

		}
	 
	
}
 @Test(priority = 4)
 public void radio_button() throws InterruptedException {
	 
	 By radio1_property=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input");
	 WebElement radio1=driver.findElement(radio1_property);
	// radio1.click();
	// System.out.println("radio1click");
	 
	 Thread.sleep(5000);
	 
	 By radio2_property=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]");
	 WebElement radio2=driver.findElement(radio2_property);
	 radio2.click();
	 System.out.println("radio2click");
	 
	 Thread.sleep(5000);
	 By radio3_property=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]");
	 WebElement radio3=driver.findElement(radio3_property);
	 Thread.sleep(5000);
	 radio3.click();
	 System.out.println("radio3click");
	 
	 
	 
	 
	 
	
}
// @Test(priority = 5)
 public void suggestion_class() {
	 
	 By selectcountryproperty=By.xpath("//*[@id=\"autocomplete\"]");
	 WebElement select_country=driver.findElement(selectcountryproperty);
	 select_country.sendKeys("India");
	
}
// @Test(priority = 6)
public void drop_down() {
	By drop_down_property=By.id("dropdown-class-example");
	WebElement drop_down=driver.findElement(drop_down_property);
	drop_down.click();
	
	
	
}
// @Test(priority = 7)
public  void check_box() {
	
	By option1property=By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[1]");
	WebElement option1=driver.findElement(option1property);
	option1.click();
	
	By option2property=By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]");
	WebElement option2=driver.findElement(option2property);
	option2.click();
	
	By option3property=By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[3]");
	WebElement option3=driver.findElement(option3property);
	option3.click();
	
	
	
}
 
}
