package com.Windows_Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Pop_up_alert extends Base_for_handles{ 
	
	@Test
	public void pop() throws InterruptedException {
		By popup_property=By.xpath("//*[@id=\"name\"]");
		WebElement popup=driver.findElement(popup_property);
		popup.sendKeys("sai");
		System.out.println("enters the sai");
		
		By alert_proerty=By.id("alertbtn");
		WebElement alerting=driver.findElement(alert_proerty);
		alerting.click();
		System.out.println("click the slert");
		
		Alert alertttt=driver.switchTo().alert();
		Thread.sleep(5000);
		//alertttt.accept();
		System.out.println("switch the alert");
		
		
		
		
		
	}

}
