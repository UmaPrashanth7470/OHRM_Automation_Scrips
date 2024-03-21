package com.Ohrm_valids;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrmvalidations {
	public static void main(String[] args) {
		
	
	
	ChromeDriver browser ;
	System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	browser=new ChromeDriver();
	System.out.println("google opens");
browser.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");	
System.out.println("OHRM OPENS");
String actualtittle=browser.getTitle();
System.out.println("valids thr tittle:"+actualtittle);

String expectingtittle="OrangeHRM";
if (actualtittle.equals(expectingtittle))
{	System.out.println("it is expected as  per requirement:pass");}
else
{System.out.println("it is not expected as  per requirement:fail");}

 String actualurl=browser.getCurrentUrl();
 System.out.println("it is the actual url of OHRM:"+actualurl);
String expecturl="//127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
if(actualurl.equals(expecturl))
{System.out.println("this url is matched asper requirement:pass");}
else
{System.out.println("this url is not  matched asper requirement:fail");}
//browser.findElementById("txtUsername").sendKeys("Uma@7470");
//browser.findElementById("txtPassword").sendKeys("Pra@7470");
//browser.findElementById("btnLogin").click();
System.out.println("login the ohrm");
	
//browser.close();
//System.out.println("close the google");

	}
}
