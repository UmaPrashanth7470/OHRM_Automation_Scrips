package com.Ohrm_valids;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Instagram_valids {
	public static void main(String[] args) {
		WebDriver ChromeDriver;
		String insta="https://www.instagram.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	ChromeDriver browse=new ChromeDriver();
	System.out.println("opens the google");
	browse.get(insta);
	System.out.println("opening the instagram");
	String actualtittle=browse.getTitle();
	 System.out.println("instatittle:"+actualtittle);
	 String expectedname="INSTAGRAM";
	 if(actualtittle.equals(expectedname))
	 {System.out.println("it is as expected tittle as same:pass");}
	 else 
		{System.out.println("it is as not expected tittle as same:fail");}
	 
	String actualurl= browse.getCurrentUrl();
	String expecturl="https://www.instagram.com";
	
	if(actualurl.equals(expecturl))
	{System.out.println("it is exepctedURL as per requirement:pass");}		
	else 
	{System.out.println("it is not expectedURL as per requirement:fail");}
	
	//browse.findElementByXPath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input").sendKeys("8501017470");
	//browse.findElementByXPath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input").sendKeys("955342709");
	//browse.findElementByXPath("//*[@id=\"loginForm\"]/div/div[3]").click();
	System.out.println("insta opens");
	//browse.quit();
		
	
	 
	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
