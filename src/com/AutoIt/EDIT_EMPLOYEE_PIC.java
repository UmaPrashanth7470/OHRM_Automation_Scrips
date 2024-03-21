package com.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EDIT_EMPLOYEE_PIC  extends Base_for_Auto_it_in_ohrm{
	
	
	
	public void edit_emp_pic() throws InterruptedException {
		
        
By pimproperty = By.xpath("//b[text()='PIM']");        
WebElement pim = driver.findElement(pimproperty);      
pim.click();                                           
System.out.println("clicks the pim");   

 
By secondpage_property=By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/div[5]/ul/li[5]/a");
WebElement secondpage=driver.findElement(secondpage_property);
secondpage.click();
System.out.println("clicks the second page");
Thread.sleep(3000);


By vsr_property=By.xpath("//*[@id=\"resultTable\"]/tbody/tr[11]/td[3]/a");
WebElement vsr =driver.findElement(vsr_property);
vsr.click();
System.out.println("clicks the vsr");
Thread.sleep(3000);

By editproperty=By.id("btnSave");
WebElement edit =driver.findElement(editproperty);
edit.click();
System.out.println("clicks the edit");
Thread.sleep(3000);


By oldpicproperty=By.xpath("//*[@id=\"empPic\"]");
WebElement oldpic=driver.findElement(oldpicproperty);
oldpic.click();
System.out.println("old pic click");
Thread.sleep(3000);

By editpicproperty=By.id("photofile");
WebElement editpic=driver.findElement(editpicproperty);
editpic.sendKeys("C:\\trainings\\selenium automation\\work space\\java project\\ORANGE\\N_B_K.jpg");
System.out.println("edit pic");
Thread.sleep(3000);

By uploadproperty=By.id("btnSave");
WebElement upload=driver.findElement(uploadproperty);
upload.click();
Thread.sleep(3000);






		
	}

}
