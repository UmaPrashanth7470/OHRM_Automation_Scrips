package mypractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifingUrl {
	public static void main(String[] args) {
		String ApplicationUrl="https://www.google.com/";
		
		 System.setProperty("webdriver.chrome.driver", "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
ChromeDriver searchengine=new ChromeDriver();searchengine.get(ApplicationUrl);
System.out.println("opening the google");
String SearchEngine=searchengine.getTitle();
System.out.println("validating the tittle of application");

if(SearchEngine.equals(SearchEngine)) 
{System.out.println("it is expecting:"+SearchEngine);}
else
{System.out.println("it is not expecting");}
System.out.println("&&&&&&&&&&&&");
	
if(SearchEngine.equalsIgnoreCase(SearchEngine)) 
{System.out.println("it is also expecting:"+SearchEngine);}
else
{System.out.println("it is not expecting");}
System.out.println("&&&&&&&&&&&&");

if(SearchEngine.contains(SearchEngine)) 
{System.out.println("it contains:"+SearchEngine);}
else
{System.out.println("it is not expecting");}
System.out.println("&&&&&&&&&&&&");

String Tothissite="https://www.tsrtc.telangana.gov.in/";
searchengine.navigate().to(Tothissite);
System.out.println("navigating this tsrtc site");
searchengine.close();
System.out.println("close the google");





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
