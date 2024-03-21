package mypractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingUrl2 {
	public static void main(String[] args) {
		ChromeDriver webapp;
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		webapp=new ChromeDriver();
		System.out.println("opening the browser");
		webapp.get("https://www.google.com/");
		System.out.println("opening the google");
		webapp.navigate().to("https://www.tsrtconline.in/oprs-web/");
		System.out.println("navigate to  tsrtc portal");
	String webapptittle=webapp.getTitle();
	System.out.println("validating the tittle:"+webapptittle);
	String expectingtittle="Online Bus Ticket Booking | TSRTC Official Website | Telangan";
	if(webapptittle.equals(expectingtittle))
	{System.out.println("it is matching as expected:pass");}
	else
	{System.out.println("it is not matching fail");}
	String ur="https://www.tsrtconline.in/oprs-web/";
	String weburl=webapp.getCurrentUrl();
	if(weburl.equals(ur))
	{System.out.println("this url is as per expected:pass:");}
	else
	{System.out.println("this url is as per not expected:fail:");}
	
	
	
	
	webapp.close();
	System.out.println("closing the browser");
	System.out.println("&&&&&&&&&&&&&&&");
	
	EdgeDriver gog;
	
	System.setProperty("webdriver.edge.driver", "C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe");
	gog=new EdgeDriver();
	System.out.println("edge open");
	
	String youtubeapp;
	youtubeapp="https://www.youtube.com/";
	 
	gog.get(youtubeapp);
	System.out.println("opening the youtube");
	
	gog.navigate().to("https://www.youtube.com/watch?v=RWve-9n0m48");
	 System.out.println("it navigate dont stop song nanaku prematho");
	
String	actualtittle=gog.getTitle();
System.out.println("it is validating youtube tittle"+youtubeapp);
String expectedtittle="youtube";
if(actualtittle.equals(expectedtittle))
{System.out.println("it expected as per requirement :pass");}
else 
{
	System.out.println("it is not expected as per requirement:fail ");
}
String googl=gog.getCurrentUrl();
System.out.println("it is the url validation"+googl);
String acturl="//htppp.youtubt";
if(googl.equals(acturl))
{System.out.println("it is matced the url:pass");}
else {
	System.out.println("it is not matcheurl:fail");
}
	
gog.close();
System.out.println("edge is closed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
