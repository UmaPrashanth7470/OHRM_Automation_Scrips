package com.mouse;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseTest.BaseTest;

public class Mouse_keyboard_Actions extends BaseTest {
	
	public Mouse_keyboard_Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public void ohrm_login() throws InterruptedException {
		Actions mou_keybo_actions=new Actions(driver);
		//mou_keybo_actions.sendKeys(Keys.TAB).build().perform();
		//mou_keybo_actions.sendKeys(Keys.TAB).build().perform();
		mou_keybo_actions.sendKeys("8501017470").build().perform();
		System.out.println("enter the username");
		mou_keybo_actions.sendKeys(Keys.TAB).build().perform();
		mou_keybo_actions.sendKeys("9553422709").build().perform();
		System.out.println("enter the password");
		//mou_keybo_actions.sendKeys(Keys.ENTER).build().perform();
		mou_keybo_actions.sendKeys(Keys.TAB).build().perform();
		
		By username_property=By.id("email");
		WebElement username =driver.findElement(username_property);
		username.click();
		mou_keybo_actions.moveToElement(username).build().perform();
	    //mou_keybo_actions.sendKeys(Keys.ENTER).build().perform();
		
		for(int index=0;index<=10;index++) {
			Thread.sleep(5000);
			  mou_keybo_actions.sendKeys(Keys.BACK_SPACE).build().perform();
				System.out.println(index+"clear the username");
			
		}
      
		
		By passwordproperty= By.id("passContainer");
		WebElement password=driver.findElement(passwordproperty);
		password.click();
		mou_keybo_actions.moveToElement(password).build().perform();
		//mou_keybo_actions.sendKeys(Keys.ENTER).build().perform();
		for(int index=0;index<=10;index++)
			Thread.sleep(5000);
		{mou_keybo_actions.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println("clear the password");}
		
		
		
		
		
		
		/*
		 * mou_keybo_actions.sendKeys(Keys.UP).build().perform();
		 * mou_keybo_actions.sendKeys(Keys.DELETE).build().perform();
		 * System.out.println("clear the password");
		 */
		
		/*
		 * By dashboardproperty=By.xpath("//h1[text()='Dashboard']"); WebElement
		 * dashboard=driver.findElement(dashboardproperty);
		 * 
		 * mou_keybo_actions.moveToElement(dashboard).build().perform();
		 * System.out.println("move to webelement perform");
		 * 
		 * String actual_text_of_dashboard=dashboard.getText();
		 * System.out.println("this is the actual text of dash board"
		 * +actual_text_of_dashboard);
		 */		
		
		
	}
            public static void main(String[] args) throws InterruptedException {
            	Mouse_keyboard_Actions act=new Mouse_keyboard_Actions(driver);
				act.applicationLaunch();
				act.ohrm_login();
            	
            	
            	
            	
			}
	
}


