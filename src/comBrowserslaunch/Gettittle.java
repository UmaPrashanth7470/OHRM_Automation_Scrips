package comBrowserslaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittle {
	public static void main(String[] args) {
		String applicationURl="https://www.bing.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("launch the chrome");
		System.out.println("launch the bing application");
		String Tittle=driver.getTitle();
		System.out.println(" The Actual title of the Bing Home Page is :- " +Tittle);
		System.out.println("application url is;"+applicationURl);

		driver.quit();


		
		
		
		
		
		
		
		
		
		
		
		
	}

}
