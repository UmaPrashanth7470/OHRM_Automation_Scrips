package com.TestNG;

import java.util.List;

import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Amazon_valids.Amazon_valid_images;

public class Amazon_fresh_valids extends Amazon_valid_images {
	// WebDriver driver;
	
	@Test(priority = 3)
	public void fresh() throws InterruptedException {
		System.out.println("fresh block");

		By freshproperty = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
		WebElement freshbutton = driver.findElement(freshproperty);
		freshbutton.click();
		System.out.println("clicks the fresh button");

		By fresh_block_property = By.className("fs-store");
		WebElement fresh_block = driver.findElement(fresh_block_property);

		By fresh_links_property = By.tagName("a");
		List<WebElement> fresh_links = fresh_block.findElements(fresh_links_property);

		int fresh_links_count = fresh_links.size();
		System.out.println("this is the links counts:-" + fresh_links_count);

		
		  for(int index=0;index<fresh_links_count;index++) { String
		  fresh_links_url=fresh_links.get(index).getAttribute("href");
		  System.out.println(index+":-this is the actual url of :-"+fresh_links_url);
		  
		  String fresh_links_actualtexts=fresh_links.get(index).getText();
		  System.out.println(index+":- this is the actual text:- "
		  +fresh_links_actualtexts); }
		  
		  
		 
		for (int index = 3; index < fresh_links_count; index = index + 2) {
			String Fresh_expect_text = fresh_links.get(index).getText();
			String fresh_actual_text = fresh_links.get(index).getText();

			if (fresh_actual_text.equals(Fresh_expect_text)) {

				System.out.println(index + ":-this texts is matched as per requirement :pass");
				fresh_links.get(index).click();
				System.out.println(index + "clicking the links");
				Thread.sleep(3000);
				driver.navigate().back();
				System.out.println(index + ":-it navigates the home page");
				fresh_block = driver.findElement(fresh_block_property);
				fresh_links = fresh_block.findElements(fresh_links_property);

			}

			else {
				System.out.println("it is not matched fail");
			}

		}

	}



	

}
