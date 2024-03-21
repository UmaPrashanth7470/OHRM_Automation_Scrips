package com.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Add_emoloyee_Profilepics_2 extends Base_for_Auto_it_in_ohrm{
	

	public void add_pic() throws InterruptedException {
		
	
	By pimproperty = By.xpath("//b[text()='PIM']");
	WebElement pim = driver.findElement(pimproperty);
	pim.click();
	System.out.println("clicks the pim");
	
	By add_employee_property=By.id("menu_pim_addEmployee");
	WebElement add_employee=driver.findElement(add_employee_property);
	add_employee.click();
	System.out.println("click the add employee");
	
	Actions act=new Actions(driver);
	
	By firstnameproperty=By.id("firstName");
	WebElement firstname=driver.findElement(firstnameproperty);
	act.sendKeys(firstname,"veera");
	act.sendKeys(Keys.TAB).build().perform();
	System.out.println("click the nara");
	
	By secondnameproperty=By.id("middleName");
	WebElement secondname=driver.findElement(secondnameproperty);
	act.sendKeys(secondname,"simha").build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	System.out.println("click the simha");
	
	
	By thirdnameproperty=By.id("lastName");
	WebElement thirdname=driver.findElement(thirdnameproperty);
	act.sendKeys(thirdname,"reddy").build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	System.out.println("click the naidau");
	Thread.sleep(3000);
	
	By photofileproperty=By.id("photofile");
	WebElement picfile =driver.findElement(photofileproperty);
	picfile.sendKeys("C:\\trainings\\selenium automation\\work space\\java project\\ORANGE\\Nandamuri Balakrishna Veera Simha Reddy HD Movie Stills_18.jpg");
	Thread.sleep(3000);
	
	
	
	WebElement save = driver.findElement(By.id("btnSave"));
	save.click();

	Thread.sleep(5000);
	


	}
}
