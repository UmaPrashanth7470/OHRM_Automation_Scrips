package comBrowserslaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getthetittle2 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe"
		 * ); ChromeDriver driver= new ChromeDriver(); String
		 * URL="https://big.ibomma.day/telugu-movies/"; driver.get(URL);
		 * System.out.println("chrome launch successfully"); String
		 * tittle=driver.getTitle();
		 * System.out.println("the applicationlaunch successfully : "+tittle);
		 * driver.close(); System.out.println("close the chrome");
		 * 
		 * 
		 */	
		/*
		 * String songurl="https://www.youtube.com/watch?v=apubw_6Y_Hs";
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe"
		 * ); FirefoxDriver driver= new FirefoxDriver();
		 * System.out.println("fire fox is launching"); driver.get(songurl); String
		 * tittlename=driver.getTitle();
		 * System.out.println("the actual tittle:"+tittlename); driver.quit();
		 * System.out.println("the application is closed");
		 * 
		 */
		
	/*	String inbox="https://web.whatsapp.com/";
		System.setProperty("webdriver.edge.driver", "C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver drive=new EdgeDriver ();
		System.out.println("edge is launching");
		drive.get(inbox);
		System.out.println("opening whatsappweb");
	 String	 name =drive.getTitle();
	 System.out.println("the actual tittle is:"+ name);
	 
		drive.quit();
		System.out.println("closing the edge browser");
		
	*/	
		
		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();

		String applicationUrlAddress="http://bing.com"; // url address is assigned to a variable

		// variable name(applicationUrlAddress) is passed as an argument to the get method
		chromeBrowser.get(applicationUrlAddress);

		// expected title of the Bing Home Page - should be Bing
		String expected_BingHomePageTitle="Bing";
		System.out.println(" The expected title of the Bing Home Page is :- "+expected_BingHomePageTitle);

		String actual_BingHomePageTitle=chromeBrowser.getTitle();
		System.out.println(" The Actual title of the Bing Home Page is :- "+actual_BingHomePageTitle);

		//if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		if(actual_BingHomePageTitle.equalsIgnoreCase(expected_BingHomePageTitle))
		{
		System.out.println(" The Title of the Bing Home Page Matched - PASS");
		}
		else
		{
		System.out.println(" The Title of the Bing Home Page NOT Matched - FAIL");
		}
		chromeBrowser.quit();
		}

		
		
	}

 
