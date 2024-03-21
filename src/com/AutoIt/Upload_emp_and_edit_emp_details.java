package com.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Upload_emp_and_edit_emp_details extends Base_for_Auto_it_in_ohrm{
	
	@Test(priority=1)
	public void vd() throws InterruptedException {
		
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
		act.sendKeys(firstname,"vijayi");
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("click the vijayi");
		
		By secondnameproperty=By.id("middleName");
		WebElement secondname=driver.findElement(secondnameproperty);
		act.sendKeys(secondname,"devara").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("click the devara");
		
		
		By thirdnameproperty=By.id("lastName");
		WebElement thirdname=driver.findElement(thirdnameproperty);
		act.sendKeys(thirdname,"konda").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("click the konda");
		Thread.sleep(3000);
		
		
		By photofileproperty=By.id("photofile");                                                                                                                 
		WebElement picfile =driver.findElement(photofileproperty);                                                                                               
		picfile.sendKeys("C:\\trainings\\selenium automation\\work space\\java project\\ORANGE\\vijay-devarakonda-waterfalls-s1cl17imqmtsvdmh.jpg");
		Thread.sleep(3000);                                                                                                                                      
		
		
		
		
		WebElement save = driver.findElement(By.id("btnSave"));
		save.click();

		Thread.sleep(5000);
		
		
		
	}
	
	@Test(priority=2)
	public void Ad() throws InterruptedException {
		
		By pimproperty = By.xpath("//b[text()='PIM']");
		WebElement pim = driver.findElement(pimproperty);
		pim.click();
		System.out.println("clicks the pim");
		
		
		By vdproperty=By.linkText("0093");
		WebElement vd=driver.findElement(vdproperty);
		vd.click();
	    System.out.println("clicks the vd");
	    Thread.sleep(3000);
	    
	    
	    
	    By editproprty=By.id("btnSave");
	    WebElement edit=driver.findElement(editproprty);
	    edit.click();
	    System.out.println("clicks the edit");
	    Thread.sleep(3000);
	    
	    By firseditnameproperty=By.id("personal_txtEmpFirstName");
	    WebElement firsteditname=driver.findElement(firseditnameproperty);
	    firsteditname.clear();
	    firsteditname.sendKeys("Anadh");
	    Thread.sleep(3000);
	    
	    By secondnameeditproperty=By.id("personal_txtEmpMiddleName");
	    WebElement seconndedit=driver.findElement(secondnameeditproperty);
	    seconndedit.clear();
	    seconndedit.sendKeys("devaraaaa");
	    System.out.println("clicks the devaraa");
	    Thread.sleep(3000);
	    
	    By thirdnameeditproperty=By.id("personal_txtEmpLastName");
	    WebElement thirdedit=driver.findElement(thirdnameeditproperty);
	    thirdedit.clear();
	    thirdedit.sendKeys("konda");
	    System.out.println("clicks konda");
	    Thread.sleep(3000);
	    
	    By editpicproperty=By.xpath("//*[@id=\"empPic\"]");
	    WebElement editpic=driver.findElement(editpicproperty);
	   editpic.click();
	   System.out.println("clicks the edit pic");
	    Thread.sleep(3000);
	   
	    
	    By addpicproperty=By.id("photofile");
	    WebElement addpic=driver.findElement(addpicproperty);
	   addpic.sendKeys("C:\\trainings\\selenium automation\\work space\\java project\\ORANGE\\anand-deverakonda-20190531105416-44876.jpg");
	   System.out.println("adding  pic");
	    Thread.sleep(3000);
	    
	    By uploadproperty=By.id("btnSave");
	    WebElement upload=driver.findElement(uploadproperty);
	    upload.click();
	    System.out.println("upload the pic");
	   
	    
	   
	    
	    
	    
		
	}
	
}
