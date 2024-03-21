package com.Drop_Down;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_language extends Base_for_dropdown {

	@Test
	public void Select_Lanuage_From_DropDown() throws InterruptedException {
		// gtranslate_selector

		WebElement selectLanguage = driver.findElement(By.id("gtranslate_selector"));
		selectLanguage.click();

		// We use already existed "select" class from Predefined java classes
		Select select_Language = new Select(selectLanguage);
		
		select_Language.selectByVisibleText("Hindi");
		//selectLanguage.click();
		System.out.println("clicks the hindi");
		Thread.sleep(3000);

		
		select_Language.selectByValue("en|te");
		//selectLanguage.click();
		System.out.println("clicks the telugu");
		Thread.sleep(3000);
		
		select_Language.selectByIndex(1);
		//selectLanguage.click();
		System.out.println("clicks the 7thindex");
		Thread.sleep(3000);
	
		

//		select_Language.deselectAll();
//		selectLanguage.click();
//		System.out.println("des select all");
//		Thread.sleep(3000);

	}
}
