package com.osmania_valids;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.apache.commons.collections4.functors.PredicateTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Osmania_validations {
	public static void main(String[] args) throws InterruptedException {
		WebDriver osmania;
		String browsingapp="https://www.google.co.in/";
		String navigatingapp="https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	    osmania=new ChromeDriver();
	    System.out.println("launching the browser");
	    osmania.manage().window().maximize();
	    System.out.println("maximisize the window of osmania");
	   osmania.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    System.out.println("wait for 10 seconds waiting for web elements");
	    
	    osmania.get(browsingapp);
	    System.out.println("open the browser");
	    osmania.navigate().to(navigatingapp);
	    System.out.println("it is navigating the app");
	   String  osmania_actual_tittle =osmania.getTitle();
	   System.out.println("the actual tittle:"+osmania_actual_tittle);
	   String osmania_actual_url= osmania.getCurrentUrl();
	   System.out.println("the actual url:"+osmania_actual_url);
	   
		By home_text_property = By.xpath("//*[@id=\"top1\"]/ul/li[1]/a");
		WebElement home_actual_text = osmania.findElement(home_text_property);
		System.out.println(home_actual_text.getText());

		By newappointmentstextproperty = By.xpath("//*[@id=\"top1\"]/ul/li[2]/a");
		WebElement new_appointment_actual_text = osmania.findElement(newappointmentstextproperty);
		System.out.println(new_appointment_actual_text.getText());

		/*
		 * By staffproperty = By.xpath("//a[text()='Staff']"); WebElement
		 * staff_actual_text = osmania.findElement(staffproperty);
		 * System.out.println(staff_actual_text.getText());
		 */

		By telephonedirctorypropert = By.xpath("//*[@id=\"top1\"]/ul/li[4]/a");
		WebElement telephonedirectorty_actual_text = osmania.findElement(telephonedirctorypropert);
		System.out.println(telephonedirectorty_actual_text.getText());

		By alamanacproperty = By.xpath("//a[text()='Almanac']");
		WebElement almanac_actual_text = osmania.findElement(alamanacproperty);
		System.out.println(almanac_actual_text.getText());

		By downloadsformsproperty = By.xpath("//a[text()='Download Forms']");
		WebElement downloads_actual_text = osmania.findElement(downloadsformsproperty);
		System.out.println(downloads_actual_text.getText());

		By universityemailpropaerty = By.xpath("//a[text()='University e-mail']");
		WebElement university_email_actual_text = osmania.findElement(universityemailpropaerty);
		System.out.println(university_email_actual_text.getText());

		By contactusproperty = By.xpath("//a[text()='Contact Us']");
		WebElement contactus_actual_text = osmania.findElement(contactusproperty);
		System.out.println(contactus_actual_text.getText());

		By osmaniafondationproperty = By.xpath("//a[text()='Osmania Foundation']");
		WebElement osmania_foundation_actual_text = osmania.findElement(osmaniafondationproperty);
		System.out.println(osmania_foundation_actual_text.getText());

		By eofficeproperty = By.xpath("//a[text()='e-Office Portal']");
		WebElement eoffice_portal_actual_text = osmania.findElement(eofficeproperty);
		System.out.println(eoffice_portal_actual_text.getText());
		
		
	
	home_actual_text.click();
	System.out.println("it clicking the home");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	new_appointment_actual_text.click();
	System.out.println("clicking the new apppointment");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	/*
	 * staff_actual_text.click(); System.out.println("it is clicking the  staff");
	 * osmania.navigate().back();
	 * System.out.println("it backs the osmania home page");
	 */
	
	telephonedirectorty_actual_text.click();
	System.out.println("it is clicking the telephone page");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	almanac_actual_text.click();
	System.out.println("click the alamanac");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	downloads_actual_text.click();
	System.out.println("clicking the downloads");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	university_email_actual_text.click();
	System.out.println("clicking the university email");
	osmania.navigate().back();
	System.out.println("it backs the osmania home page");
	
	/*
	 * contactus_actual_text.click(); System.out.println("clicking the contact us");
	 * osmania.navigate().back();
	 * System.out.println("it backs the osmania home page");
	 */
	/*
	 * osmania_foundation_actual_text.click();
	 * System.out.println("clicking the osmania foudation");
	 * osmania.navigate().back();
	 * System.out.println("it backs the osmania home page");
	 */	
	/*
*/   
	
	osmania.quit();
	System.out.println("quit the osmania");
	   
	   
	  
	 
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
