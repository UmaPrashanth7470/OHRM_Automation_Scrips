package mypractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingUrl {

	/*static ChromeDriver browser;

	public static void main(String[] args) {
		EdgeDriver drive;
		String appurl="https://www.google.com/";
		System.setProperty("webdriver.edge.driver","C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe" );
		drive =new EdgeDriver();
		System.out.println("launching the edge");
		drive.get(appurl);
		System.out.println("opening the google");
		String actualurl=drive.getCurrentUrl();
		System.out.println("the actual url of current application:"+actualurl);
		String actualtittle =drive.getTitle();
		System.out.println("the actual tittle:" +actualtittle);
		if(actualtittle.equals(actualtittle))
		{System.out.println("tittle is expecting"+actualtittle);}
		else
		{System.out.println("not expecting");}
		
		String siteurl="https://www.youtube.com/watch?v=gdlFsiz3wpU&list=PPSV";
		drive.navigate().to(siteurl);
		System.out.println("navigating youtube");
		drive.close();
		System.out.println("close the edge");
	public static void main(String[] args) {
		ChromeDriver browser;
	String	url="https://www.google.com/";
	
	System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	browser=new ChromeDriver();
	System.out.println("opening the browser");
	browser.get(url);
	System.out.println("oprning the google");
	String browsetheurl=browser.getCurrentUrl();
	System.out.println( browsetheurl);
	String browsetheapp=browser.getTitle();
	System.out.println(browsetheapp);
	if(browsetheapp.equalsIgnoreCase(browsetheurl))
	{System.out.println("the tittle and url is matched-it is passed");}
	else
	{System.out.println("it is not matched");}
	browser.close();
	System.out.println("google is closed");*/
		
	public static void main(String[] args) {
		ChromeDriver application;
		String appurl="https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		application=new ChromeDriver();
		System.out.println("opening th chrome");
		application.get(appurl);
		System.out.println("opening the google");
		String expectedtitle="Google";
		String actualtittle=application.getTitle();
		if(actualtittle.equals(expectedtitle))
		{System.out.println("it is expected -passed");}
		else
		{System.out.println("it is not expected-failed");}
		System.out.println("$$$$$$$$$$$$$$");
		String expectingurl="google.com";
		String    actualUrl = application.getCurrentUrl();
		if(actualUrl.equals(expectingurl))
		{System.out.println("it is matched-passed");}
		else
		{System.out.println("it is not matched -failed");}
		
		System.out.println("##############");
		
		
		
		
		application.close();
		System.out.println("appplication is close");
		
		}
	}

































	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	


