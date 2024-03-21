package mypractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naviagation_application {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver yout=new ChromeDriver();
		System.out.println("opening the google");
		yout.get("https://www.youtube.com/");
		System.out.println("opening the youtube");
		String Youtu=yout.getTitle();
		System.out.println("this is the tittle:"+ Youtu);
		if(Youtu.equals(Youtu))
		{System.out.println("it is expecting:"+Youtu);}
		else
		{System.out.println("it is not expecting");}
		
		System.out.println("$$$%%%%########@@@@@@@##$$$$%%%%%%%");
		if(Youtu.equalsIgnoreCase(Youtu))
		{System.out.println("it is also expecting"+Youtu);}
		else
		{System.out.println("it is not expecting");}
		System.out.println("$$$%%%%########@@@@@@@##$$$$%%%%%%%");
		
		yout.navigate().to("https://www.youtube.com/watch?v=mUr_1FNOR74");
		System.out.println("navigate to song");
		yout.close();
		System.out.println("closing the google");
		
		System.setProperty("webdriver.edge.driver", "C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver browser=new EdgeDriver();
		System.out.println("opening the edge");
		browser.get("https://www.youtube.com/");
		System.out.println("opening the youtube");
	String	browsweapplication=browser.getTitle();
	if(browsweapplication.equals(browsweapplication))
	{System.out.println("it is as expecting:"+browsweapplication);}
	else
	{System.out.println("it is not expecting");}
	
	System.out.println("#############$$$$$$$$$$$$##########");
	if(browsweapplication.equalsIgnoreCase(browsweapplication))
	{System.out.println("it is also expecting:"+browsweapplication);}
	else
	{System.out.println("it is not expecting");}
	
	System.out.println("#############$$$$$$$$$$$$##########");
	
	if(browsweapplication.contains(browsweapplication))
	{System.out.println("it contains:"+browsweapplication);}
	else
	{System.out.println("it is not expecting");}
	
	System.out.println("#############$$$$$$$$$$$$##########");
	
	browser.navigate().to("https://www.youtube.com/watch?v=FyBJaugZ3iE");
	System.out.println("playing the jagan inaguration programme");
	browser.quit();
	System.out.println("edge is close");
	System.out.println("&&&&&&&&&&&&&&&&");*/
	
	System.setProperty("webdriver.gecko.driver", "C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	FirefoxDriver mozi=new FirefoxDriver();
	System.out.println("opening the Firefox");
	mozi.get("https://www.youtube.com/");
	System.out.println("opening the youtube");
	String mozilla=mozi.getTitle();
	System.out.println("validating the tittle app");
	if(mozilla.equals(mozilla))
	{System.out.println("it is expecting:"+mozilla);}
	else
	{System.out.println("it is not expecting");}
	
	System.out.println("&&&&&&&&&&&&");
	if(mozilla.equalsIgnoreCase(mozilla))
	{System.out.println("it is also expecting:"+mozilla);}
	else
	{System.out.println("it is not expecting");}
	System.out.println("&&&&&&&&&&&&");
	

	if(mozilla.contains(mozilla))
	{System.out.println("it contains:"+mozilla);}
	else
	{System.out.println("it is not expecting");}
	System.out.println("&&&&&&&&&&&&");
	
	mozi.navigate().to("https://www.youtube.com/watch?v=apubw_6Y_Hs");
	System.out.println("it is navigating to the song");
	
	mozi.close();
	System.out.println("firefox close");

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
