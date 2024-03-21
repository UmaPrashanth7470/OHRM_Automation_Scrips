package comBrowserslaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver currentbrowser=new ChromeDriver ();
		System.out.println("launch chrome successfully");
		currentbrowser.get("https://mail.google.com/mail/u/0/#inbox");
    System.out.println("launch the mail in chrome");
		currentbrowser.quit();
		System.out.println("close the chrome");
		System.out.println("##########complete the first operations in chrome###########");	
		
		System.setProperty("webdriver.gecko.driver", "C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe ");
		FirefoxDriver webpage=new FirefoxDriver();
		System.out.println("fire fox launch successfully");
		webpage.get("https://www.youtube.com/");
		System.out.println("launch the youtube in firefox");
		webpage.quit();
		System.out.println("close the firefox");
		System.out.println("##########$$$complete the first operations in firefox$$$###########");	
		
		

		
		System.setProperty("webdriver.edge.driver","C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe" );
		EdgeDriver web =new EdgeDriver() ;
		System.out.println("launnch edge successfully");
		web.get("https://www.youtube.com/watch?v=9HOOw2u6SSk");
		System.out.println("playing the suryudey song in sallar in edge browser");
		web.quit();
		System.out.println("close the edge");
		System.out.println("##########@@@@@@@@$$$$complete the first operations in MS EDGE@@@@@@@@@@@%%%###########");	
			
					}
			
			
		}
		
	


