package comBrowserslaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_tittle {
public static void main(String[] args) {
	/*
	 * String url="https://www.youtube.com/watch?v=rrXvdEMHVXc";
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:\\trainings\\selenium automation\\soft ware\\geckodriver-v0.33.0-win64\\geckodriver.exe"
	 * ); FirefoxDriver firefox=new FirefoxDriver();
	 * System.out.println("launch the fire fox"); firefox.get(url);
	 * System.out.println("opening the youtube"); String
	 * nameofapp=firefox.getTitle(); System.out.println("opening youtube");
	 * 
	 * if(nameofapp.equals(nameofapp)) {
	 * System.out.println("the expected result:passed"+nameofapp); } else {
	 * System.out.println("failed");
	 * 
	 * }
	 */
	//firefox.quit();
	/*
	 * String link="https://www.youtube.com/"; System.setProperty(
	 * "webdriver.edge.driver","C:\\trainings\\selenium automation\\soft ware\\edgedriver_win64\\msedgedriver.exe"
	 * ); System.out.println("edge launch successfully"); EdgeDriver edge=new
	 * EdgeDriver(); //that whatever browser we will call in the selenium for
	 * testing with the java concnept creating the object..... edge.get(link);
	 * System.out.println("opening the youtube"); String utube=edge.getTitle();
	 * System.out.println("the tittle:"+utube); if(utube.equals(utube)) {
	 * System.out.println("the expected result is matched itspassed:"+utube); }
	 * if(utube.equalsIgnoreCase(utube)) {
	 * System.out.println("the expected result is matched its passed:"+utube); }
	 * else {
	 * System.out.println("the expected result is not matched its failed:"+utube); }
	 * edge.quit(); System.out.println("edge is closed");
	 */
	
	System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
	ChromeDriver google=new ChromeDriver();
	System.out.println("Google launch");
	String tsrtcUrl="https://www.tsrtc.telangana.gov.in/";
	google.get(tsrtcUrl);
	System.out.println("launching the TSRTC APP");
	String tsrtcname=google.getTitle();
	System.out.println("The Tittle of TSRTC:"+tsrtcname);
	if(tsrtcname.equals(tsrtcname)) 
	{
		System.out.println("expected result is passed;"+tsrtcname);
	}
	if(tsrtcname.equalsIgnoreCase(tsrtcname))
	{
		System.out.println("expected result is passed;"+tsrtcname);
	}
	else {
		System.out.println("expected result is failed"+tsrtcname);
	}
	
	google.close();
	System.out.println("google is close");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		

}
