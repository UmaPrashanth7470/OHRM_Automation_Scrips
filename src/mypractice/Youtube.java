package mypractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		System.out.println("opening the chrome browser");
		ChromeDriver Browsingsong =new ChromeDriver();
		System.out.println("opening the google");
		Browsingsong.get("https://www.youtube.com/watch?v=C8zL_kbospE");
		System.out.println("selavanuko song");
		
		/*System.setProperty("webdriver.edge.driver", "C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver Utubevalidating=new EdgeDriver();
		System.out.println("opening the edge");
		Utubevalidating.get("https://www.youtube.com/");
		System.out.println("opening youtube");
		Utubevalidating.getTitle();
		System.out.println("validating the tittle");
		if(Utubevalidating.ig(Utubevalidating)) {
			System.out.println("this is validating:-"+Utubevalidating);
		}
		
				
		else {
			System.out.println("it is  not validating");
		}
		
		Utubevalidating.close();
		System.out.println("close the edge");*/
		
		System.setProperty("webdriver.gecko.driver", "C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver bing=new FirefoxDriver();
		System.out.println("opening the fire fox");
		bing.get("https://www.bing.com/");
		System.out.println("opening the bing");
		bing.getTitle();
		System.out.println("validating the tittle:-"+bing);
		if(bing.equals(bing))
		{ System.out.println("its expecting tittle:"+bing);} 
		else
		{System.out.println("it is not expecting");}
		
		bing.close();
		System.out.println("edge is closed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
