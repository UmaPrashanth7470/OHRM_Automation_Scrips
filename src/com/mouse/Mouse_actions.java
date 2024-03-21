package com.mouse;

import java.awt.RenderingHints.Key;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.BaseTest.BaseTest;

public class Mouse_actions extends BaseTest {
	
	
	public void login() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.TAB).build().perform();

		actions.sendKeys("Uma@7470").build() .perform();
		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys("Pra@7470").build() .perform();
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);

		actions.sendKeys(Keys.ENTER).build().perform();
		



		System.out.println();
		
		
		/*
		 * By usernameproperty=By.id("txtUsername"); WebElement username =
		 * driver.findElement(usernameproperty); username.sendKeys("Uma@7470");
		 * 
		 * By passwordproperty=By.id("txtPassword"); WebElement
		 * password=driver.findElement(passwordproperty); password.sendKeys("Pra@7470");
		 * 
		 * By loginproperty=By.id("btnLogin"); WebElement
		 * login=driver.findElement(loginproperty); login.click();
		 */
		System.out.println("clicks the login");
		

}
	public void validate_hideoption() {
		By pimproperty=By.xpath("//*[@id=\"menu_pim_viewPimModule\"]");
		WebElement pim=driver.findElement(pimproperty);
		pim.click();
	// clicking the pim button
		System.out.println("clicks the pim");
		
		By employyesinformation_property=By.xpath("//*[@id=\"employee-information\"]/a")    ;                                   
		WebElement emplyeesinformation=driver.findElement(employyesinformation_property);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(emplyeesinformation).build().perform();
		System.out.println("move the target");
		
		String actualhidetext=emplyeesinformation.getText();
		System.out.println  ("the actualhiddentext:-"+actualhidetext);
		
		By reportsproperty =By.id("menu_core_viewDefinedPredefinedReports");
		WebElement reports=driver.findElement(reportsproperty);
		
		actions.moveToElement(reports).build().perform();
		System.out.println("move the target report");
		 String actual_hidden_textofreport=reports.getText();
		 System.out.println("this is actual hidden text:- "+actual_hidden_textofreport);
	   
		 
		
		 
										
	}
	
	public static void main(String[] args) throws InterruptedException {
		Mouse_actions mouse=new Mouse_actions();
		mouse.applicationLaunch();
		mouse.login();
		mouse.validate_hideoption();
	}
}
