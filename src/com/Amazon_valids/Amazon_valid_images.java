package com.Amazon_valids;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Amazon_valid_images  {
	public static WebDriver driver;
	//globalize the webdriver..
	
	@Test(priority = 1)

public void firststep() {
	String google="https://www.google.com/";
	String amazon="https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=4738520473090409203&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062150&hvtargid=kwd-10573980&hydadcr=14453_2367553";
    //string for navigating to the app..
	
	System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	//creating the object for driver for the launching of browser..
	System.out.println("launch the browser");
	  
	driver.manage().window().maximize();
	//maximisize the window
	System.out.println("maximisize the window");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//implicity for find elements
	System.out.println("wait for find elements");
	
	driver.get(google);
	//get the google
	System.out.println("get the google");
	
	driver.navigate().to(amazon);
	//navigate the app
	System.out.println("navigate the amazon");
	
	String actualtittle_of_application= driver.getTitle();
	System.out.println("this is the actual tittle:-"+actualtittle_of_application);
	//getting the actual tittle of application
	
	String actualurl_of_app=driver.getCurrentUrl();
	System.out.println("this is the ACTUAL URL of application:-"+actualurl_of_app);
	//getting the actual url
	
	String expect_tittle_of_app ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	String expect_url_of_app ="https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=4738520473090409203&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062150&hvtargid=kwd-10573980&hydadcr=14453_2367553"	;	
	
	if(actualtittle_of_application.equals(expect_tittle_of_app))
	{System.out.println("the tittle is matched as per requirement:pass");}
	else
	{System.out.println("the tittle is not matched as per requirement:fail");}
	
	if(actualurl_of_app.equals(expect_url_of_app))
	{System.out.println("the url is matched as per requirement:pass");}
	else
	{System.out.println("the url  is not matched as per requirement:fail");}
		
}
@AfterTest
public void finalstep() {
	driver.quit();
	System.out.println("quit the driver");
	//quittting the driver
	
}
@Test(priority = 2)
public void secondstep() throws InterruptedException, IOException {
	By allbuttonproperty=By.xpath("//*[@id=\"nav-hamburger-menu\"]/i");
	WebElement allbutton=driver.findElement(allbuttonproperty);
	Thread.sleep(3000);
	allbutton.click();
	Thread.sleep(5000);
	System.out.println("clicking the all button");
	//it is about all button
	
	By bestsellersproperty=By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a");
	WebElement bestseller=driver.findElement(bestsellersproperty);
	Thread.sleep(3000);
	bestseller.click();
	Thread.sleep(5000);
	System.out.println("clicking the bestsellar button");
	//it is about sellar property
	
	By bestseller_blockproperty=By.xpath("//*[@id=\"zg\"]");
	WebElement bestseller_block=driver.findElement(bestseller_blockproperty);
	//storing the best seller block property;
	
	By bestsellar_linkproperty=By.tagName("a");
	List<WebElement> bestsellar_link=bestseller_block.findElements(bestsellar_linkproperty);
	//storing the best sellar link property;
	
	
	int bestsellar_linkcount=bestsellar_link.size();
	System.out.println("this is the count of links:-"+bestsellar_linkcount);
    //count of links 
	
	
	
	//getting the actual texts and texts links
	for(int index=0;index<bestsellar_linkcount;index++)
				
	{String bestsellar_actual_text=bestsellar_link.get(index).getText();
	System.out.println("getting the actual text of links");
	//getting the actual texts
	System.out.println(index+":- this is the actual text:-"+bestsellar_actual_text);
	
	System.out.println("getting the links");
	String bestsellar_actual_links=bestsellar_link.get(index).getAttribute("href");
	System.out.println(index+":- this is the actual links:-"+bestsellar_actual_links);
		
	}
	
	//comparing the texts and links its matches or not with the requirement
	
	for(int index=0;index<4;index=index+2)
	{  String bestsellar_expect_text=bestsellar_link.get(index).getText();
	   String bestsellar_actual_text=bestsellar_link.get(index).getText();
	   if (bestsellar_actual_text.equals(bestsellar_expect_text)) 
	   {System.out.println(index+bestsellar_actual_text +":-it is matched as per requirement as passs");} 
	   else
	   {System.out.println(index+bestsellar_actual_text +":-it is not matched as per requirement as fail");}
	}
	
	// this is not matches as per requirement so i take the screen shots for reporting the lead it is as defect
	
	for(int index=1;index<4;index=index+2)
	{  String bestsellar_expect_text=bestsellar_link.get(index).getText();
	   String bestsellar_actual_text=bestsellar_link.get(index).getText();
	   if (bestsellar_actual_text.equals(bestsellar_expect_text +"s") ) 
	   {System.out.println(index+ bestsellar_actual_text+" :-it is matched as per requirement as passs");} 
	   else
	   {System.out.println(index+ bestsellar_actual_text +":-it is not matched as per requirement as fail");
	   Thread.sleep(3000);
	   File bestsellarpics=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(bestsellarpics, new File("./ecommercescreenshots/bestsellarscreenshots"+bestsellar_actual_text+".png"));
	   
	  }
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	/*public static void main(String[] args) throws InterruptedException, IOException {
		////calling the operations main method..
		
		Amazon_valid_images ammu= new Amazon_valid_images();
		//creating objects for amazon valid images  class..
		

		ammu.firststep();
		//calling the first step to do perform actions what the operations exist at their block
		
		
		ammu.main_operations_in_the_application();
		//calling the main operations to do perform actions what the operations exist at their block
		
		ammu.secondstep();
		//calling the second step to do perform actions what the operations exist at their block
		

		
		ammu.finalstep();
		//calling the final stop to do perform actions what the operations exist at their block
*/
	}


