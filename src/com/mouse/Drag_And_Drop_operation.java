package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseTest.BaseTest;

public class Drag_And_Drop_operation extends BaseTest {

	public void drag_drop() throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.sendKeys(dragable, Keys.ENTER).build().perform();
		System.out.println("opens the draggable");
		
		By drag_me_around_property=By.xpath("//*[@id=\"draggable\"]");
		WebElement drag_me_around=driver.findElement(drag_me_around_property);
		//Thread.sleep(3000);
		//drag_me_around.click();
		//Thread.sleep(3000);
		act.doubleClick(drag_me_around).moveToElement(drag_me_around).perform();
		//act.sendKeys(drag_me_around, Keys.).build().perform();
		System.out.println("it is dragging the down");
		
		
		
		
		
		

		
		
	}
	public static void main(String[] args) throws InterruptedException {
		Drag_And_Drop_operation d_d= new Drag_And_Drop_operation();
		d_d.applicationLaunch();
		d_d.drag_drop();
		
	}
		
}
