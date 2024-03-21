package com.Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mouse.Mouse_keyboard_Actions;

import Log4j_Utility.Log;

public class Select_language_2 extends Base_for_dropdown {
	
	
	
	

	
	@Test(priority = 1)
	public static void Admin_jobblock() throws InterruptedException {
		
		//  //*[@id="menu_admin_viewAdminModule"]/b
		
		//  //*[@id="menu_admin_viewAdminModule"]
		
		
		Thread.sleep(3000);
		By adminproperty=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]");
		WebElement admin=driver.findElement(adminproperty);
		admin.click();
		System.out.println("click the admin");
		Thread.sleep(3000);
		
		// menu_admin_Job
		By jobproperty=By.id("menu_admin_Job");
		WebElement job=driver.findElement(jobproperty);
		Actions act=new Actions(driver);
		act.moveToElement(job).build().perform();
		System.out.println("move the job option");
		
		
		// menu_admin_workShift
		By workshiftproperty=By.id("menu_admin_workShift");
		WebElement workshift=driver.findElement(workshiftproperty);
		act.moveToElement(workshift).build().perform();
		workshift.click();
		Thread.sleep(3000);
		System.out.println("move the work shift");
				
	}
	
	@Test(priority = 2)
	public void leave() throws InterruptedException {
		By leavaeproperty=By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b");
		WebElement leave=driver.findElement(leavaeproperty);
		leave.click();
		System.out.println("clicks the leave");
		
		// //*[@id="leaveperiod_cmbStartMonth"]
		 
		By Leave_month_property=By.xpath("//*[@id=\"leaveperiod_cmbStartMonth\"]");
		WebElement Leave_month=driver.findElement(Leave_month_property);
		
		Actions act=new Actions(driver);
		act.moveToElement(Leave_month).build().perform();
		act.click();
		
		Select sel__month=new Select(Leave_month);
		
		sel__month.selectByValue("1");
		Thread.sleep(2000);
		sel__month.selectByValue("2");
		Thread.sleep(2000);
		sel__month.selectByValue("3");
		Thread.sleep(2000);
		sel__month.selectByValue("4");
		Thread.sleep(2000);
		sel__month.selectByValue("5");
		Thread.sleep(2000);
		sel__month.selectByValue("6");
		Thread.sleep(2000);
		sel__month.selectByValue("7");
		Thread.sleep(2000);
		sel__month.selectByValue("8");
		Thread.sleep(2000);
		sel__month.selectByValue("9");
		Thread.sleep(2000);
		sel__month.selectByValue("10");
		Thread.sleep(2000);
		sel__month.selectByValue("11");
		Thread.sleep(2000);
		sel__month.selectByValue("12");
		Thread.sleep(2000);
		//sel__month.deselectAll();
		//Thread.sleep(2000);
		//sel__month.selectByValue("12");
		System.out.println("selecting the december month");
		
		By leave_date_property=By.xpath("//*[@id=\"leaveperiod_cmbStartDate\"]");
		WebElement leave_date=driver.findElement(leave_date_property);
		
		act.moveToElement(leave_date).build().perform();
		act.click();
		
		Select sel_date=new Select(leave_date);
		sel_date.selectByValue("1");
		sel_date.selectByValue("2");
		sel_date.selectByValue("3");
		sel_date.selectByValue("5");
		sel_date.selectByValue("8");
		sel_date.selectByValue("9");
		sel_date.selectByValue("10");

		sel_date.selectByValue("13");
		Thread.sleep(3000);
		System.out.println("select date 13");
		
		By save_property=By.id("btnEdit");
		WebElement save=driver.findElement(save_property);
		save.click();
		System.out.println("click the save");
		
		System.out.println("appling theleave");
		
		
		
		
		
		
	}
	@Test(priority = 3)
	public void time() {
		
		By timeproperty=By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b");
		WebElement time=driver.findElement(timeproperty);
		time.click();
		System.out.println("clicks the time");
		
		
		By dayproperty=By.xpath("//*[@id=\"time_startingDays\"]");
		WebElement day=driver.findElement(dayproperty);
		day.click();
		
		Select sel_day=new Select(day);
		sel_day.selectByValue("1");
		sel_day.selectByValue("2");
		sel_day.selectByValue("3");
		sel_day.selectByValue("4");
		sel_day.selectByValue("5");
		sel_day.selectByValue("6");
		
		System.out.println("select 6th day");
		 
		
		By saveproperty=By.id("btnSave");
		WebElement save=driver.findElement(saveproperty);
		save.click();
		System.out.println("clicks the save");
		System.out.println("complete the time");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
