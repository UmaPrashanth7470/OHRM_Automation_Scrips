 package com_Youtube_validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Youtube_validating {
	public static void main(String[] args) throws InterruptedException {
	WebDriver youtube;
    System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	youtube=new ChromeDriver();
	System.out.println("open the edge browser");
	youtube.manage().window().maximize();
	System.out.println("windows the maximisize");
	youtube.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	System.out.println("wait for 10 seconds to find element");
	youtube.get("https://www.google.com/");
	System.out.println("opens the google");
	youtube.navigate().to("https://www.youtube.com/");
	System.out.println("it is navigates the you tube");
	 String youtube_actual_tittle=youtube.getTitle();
	 System.out.println("this is the actual titttle:"+youtube_actual_tittle);
	 String youtube_expect_tittle="You tube";
	 if (youtube_actual_tittle.equals(youtube_expect_tittle)) 
	 {System.out.println("1)it is the matches the tittle :it is pass");}
	 else {
		System.out.println("1)it is not matches the tittle :it is fail");
	}
	 if (youtube_actual_tittle.contains(youtube_expect_tittle)) {
		 System.out.println("2)it is the contains the tittle :it is pass");}
	 else {
		System.out.println("2)it is the not contains the tittle :it is pass");
	}
		
	 if (youtube_actual_tittle.equalsIgnoreCase(youtube_expect_tittle)) {
		 System.out.println("3)it is equals ignore cases the tittle :it is pass");}
	 else {
		System.out.println("3)it is not equals the ignore cases the tittle :it is fail");}
	 String youtube_expect_url="https://www.youtube.com/";
	  String youtube_actual_url= youtube.getCurrentUrl();
	  System.out.println("this is the actual currenturl :"+youtube_actual_url);
	  if (youtube_actual_url.equals(youtube_expect_url)) 
	  {System.out.println("it is equals the url:it is pass");}
	  else {
		System.out.println("it is not equals the url:it is fail");
	}
	 By home_property=By.linkText("Home");
	 WebElement home_button=youtube.findElement(home_property);
	 home_button.click();
	 System.out.println("clicking the home butoon");
	 youtube.navigate().back();
	 System.out.println("back the home page");
	 By shorts_property=By.linkText("Shorts");
	 WebElement shorts_videos=youtube.findElement(shorts_property);
	 shorts_videos.click();
	 System.out.println("back the home page from shorts pagae");
	 By subscriptions_property=By.linkText("Subscriptions");
	 WebElement subscription=youtube.findElement(subscriptions_property);
	 subscription.click();
	 System.out.println("clicks the subscription button");
	 youtube.navigate().back();
	 System.out.println("back the subscription");
	 By you_property=By.linkText("You");
	 WebElement you_button=youtube.findElement(you_property);
	 System.out.println("clicks the you button");
	 youtube.navigate().back();
	 System.out.println("back the home page from you link");
		
		/*
		 * By histoty_property = By.linkText("History"); WebElement history =
		 * youtube.findElement(histoty_property); history.click();
		 * System.out.println("clicking the history"); youtube.navigate().back();
		 * System.out.println("back from history");
		 * 
		 */ 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	By youtube_search_ptoperty = By.xpath("//input[@id=\"search\"]");
	WebElement youtube_search = youtube.findElement(youtube_search_ptoperty);
	youtube_search.click();
	System.out.println("clicking the search");
	youtube_search.sendKeys("yathra");
	Thread.sleep(3000);
	System.out.println("printing the yathra");
	youtube_search.clear();
	System.out.println("clear the yathra");
	youtube_search.sendKeys("yatra-2 teaser");
	Thread.sleep(3000);
	System.out.println("clicking the yathra 2 teaser");
	By serch_click_property = By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div");
	WebElement search_click_button = youtube.findElement(serch_click_property);
	search_click_button.click();
	System.out.println("clicking the search button and showing the results");
	youtube.navigate().back();
	System.out.println("back the home page");
	youtube_search.clear();
	System.out.println("clearing the yatra 2 in search bar");
	youtube_search.sendKeys("yathra songs telugu");
	Thread.sleep(3000);
	search_click_button.click();
	System.out.println("displaying the yathra songs");
	By nerakakosam_song_property = By
			.linkText("Nee Raaka Kosam Video Song | Yatra Movie | YSR | Mammootty | Penchal Das");
	WebElement nerakakosam_song = youtube.findElement(nerakakosam_song_property);
	nerakakosam_song.click();
	System.out.println("playing the song ne raka kosam");

	Thread.sleep(20000);
	By stop_button_property = By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div");
	WebElement stop_button = youtube.findElement(stop_button_property);
	stop_button.click();
	System.out.println("pause the ne raka kosam song");
	Thread.sleep(5000);
	youtube.navigate().back();
	System.out.println("back the home page");

	By samarashankam_property = By
			.xpath("//*[text()='Samara Shankham Video Song | Yatra Movie | YSR | Mammootty | Krishna Kumar']");
	WebElement samarashankam_song = youtube.findElement(samarashankam_property);
	samarashankam_song.click();
	System.out.println("playing the samarashankam song");
	Thread.sleep(20000);
	stop_button.click();
	System.out.println("pause the samaaraashankam song");
	Thread.sleep(5000);
	youtube.navigate().back();
	System.out.println("back the home page");
	By pallellokala_property = By
			.linkText("Pallello Kala Undhi Video Song | Yatra Movie | YSR | Mammootty | SPB | Krishna Kumar");
	WebElement palleykala_song = youtube.findElement(pallellokala_property);
	palleykala_song.click();
	System.out.println("playing palleyllo kala vundhi song");
	Thread.sleep(20000);
	stop_button.click();
	System.out.println("pause the paalllello song");
	youtube.navigate().back();
	System.out.println("back  the playlist song");

	By mandithopatu_property = By
			.linkText("Manditho Paatugaa Video Song | Yatra Movie | YSR | Mammootty | Krishna Kumar");
	WebElement madhithopatu_song = youtube.findElement(mandithopatu_property);
	madhithopatu_song.click();
	System.out.println("playing the mandhipatutho song");
	Thread.sleep(20000);
	stop_button.click();
	System.out.println("pause the mandhi tho patu song");
	Thread.sleep(5000);

	By marugainava_song_property = By.linkText("Marugainaava Rajanna | Yatra Movie | YSR | Mammootty | Penchal Das");
	WebElement marugainava_song = youtube.findElement(marugainava_song_property);
	marugainava_song.click();
	System.out.println("playing the maruguaina rajanna song");
	Thread.sleep(20000);
	System.out.println("pause the marugainava song");
	stop_button.click();
	Thread.sleep(5000);
	System.out.println("complete this yathra playlist");

	youtube.quit();
	System.out.println("quit the youtube");

}

}
