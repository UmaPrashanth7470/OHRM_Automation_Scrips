package com.Amazon_valids;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_screenshots {
	static WebDriver driver;
	// globalize the driver...
	//static String google = "https://www.google.co.in/";
	// globalize the google url..
	//static String amazon = "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=11918764668823110194&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062150&hvtargid=kwd-10573980&hydadcr=14453_2367553";

	// globalize the amazonurl
	private void beginingstep() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		// creates the object for driver..
		System.out.println("launch the browser");

		driver.manage().window().maximize();
		// maximisizing the window;
		System.out.println("maximisizing the window");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// giving the impllicitywait for find element..
		System.out.println("wait for find the elements");

		//driver.get(google);
		// getting the google for searches
		System.out.println("opening the google");

	//	driver.navigate().to(amazon);
		// navigate the application
		System.out.println("navigates the amazon application");

		// navigation over,tittle validations begins

		String actual_tittle_of_app = driver.getTitle();
		// getting the actualtittle of app
		System.out.println("this is the actual tittle of application:-" + actual_tittle_of_app);

		String actual_url_of_app = driver.getCurrentUrl();
		// getting the current url
		System.out.println("this is the current url:-" + actual_url_of_app);

		String expecttittle_of_app = actual_tittle_of_app;

		if (actual_tittle_of_app.equals(expecttittle_of_app)) {
			System.out.println("it is matched as per requirement :-pass");
		} else {
			System.out.println("it is not matched as per requirement :-fail");
		}
		// compare the tittle as per require ment..

		String expect_url_of_app = actual_url_of_app;

		// url vallidations..
		if (actual_url_of_app.equals(expect_url_of_app)) {
			System.out.println(" this url is matched as per requirement :-pass");
		} else {
			System.out.println("this url is not matched as per requirement :-fail");
		}
	}

	public void closethapp() {
		driver.quit();
		// quittting from driver
		System.out.println("quit the driver");

	}

	public void main_operations_in_the_application() throws InterruptedException, IOException {
		By headerblock_property = By.id("nav-xshop");
		WebElement headerblock = driver.findElement(headerblock_property);
		// storing the headerblock elements

		By headerlinks_property = By.tagName("a");
		List<WebElement> headerlinks = headerblock.findElements(headerlinks_property);
		// storing the header links elements

		int headerlinks_count = headerlinks.size();
		// counting the header links
		System.out.println("this is the count:-" + headerlinks_count);
		for (int index = 0; index <= 9; index++) {
			String headerlinks_actualurl = headerlinks.get(index).getAttribute("href");
			System.out.println(index + ":- this is actual url:" + headerlinks_actualurl);
			// getting the actual url

		}

		for (int index = 0; index <= 9; index = index + 2)

		{
			String actualtext_of_links = headerlinks.get(index).getText();
			System.out.println("this is the actual texts:-" + index + ":-" + actualtext_of_links);
			// getting the actual texts

			String expect_text_of_links = actualtext_of_links;
			if (expect_text_of_links.equals(actualtext_of_links)) {
				System.out.println(index + ":-" + "it is passed as per requirement");
			} else {
				System.out.println(index + ":-" + "it is failed as per requirement");
			}

			headerlinks.get(index).click();
			// clicking the links
			System.out.println("clicking the links");

			Thread.sleep(3000);

			driver.navigate().back();
			// backs the home page
			System.out.println("backs the home page");

			Thread.sleep(3000);

			headerblock = driver.findElement(headerblock_property);
			headerlinks = headerblock.findElements(headerlinks_property);

		}

		for (int index = 1; index <= 9; index = index + 2)

		{

			String actualtext_of_links = headerlinks.get(index).getText();
			System.out.println("this is the actual texts:-" + index + ":-" + actualtext_of_links);
			// getting the actual texts

			String expect_text_of_links = actualtext_of_links;
			if (expect_text_of_links.equals(actualtext_of_links + "s")) {
				System.out.println(index + ":-" + "it is passed as per requirement");
			} else {
				System.out.println(index + ":-" + "it is failed as per requirement");

				File amazon_pics = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(amazon_pics,
						new File("./ecommercescreenshots/amazonpics" + actualtext_of_links + ".png"));
				System.out.println("captures the failure screenshots");

			}

			headerlinks.get(index).click();
			// clicking the links
			System.out.println("clicking the links");

			Thread.sleep(3000);

			driver.navigate().back();
			// backs the home page
			System.out.println("backs the home page");

			Thread.sleep(3000);

			headerblock = driver.findElement(headerblock_property);
			headerlinks = headerblock.findElements(headerlinks_property);

		}

	}
	/*
	 * public static void main(String[] args) throws InterruptedException,
	 * IOException { //calling the operations main method.. Amazon_screenshots
	 * amaz=new Amazon_screenshots(); //creating objects for amazon screenshots
	 * class..
	 * 
	 * amaz.beginingstep(); //calling the first step to do perform actions what the
	 * operations exist at their block
	 * 
	 * amaz.main_operations_in_the_application(); //calling the main oprerations to
	 * do perform actions what the operations exist at their block
	 * 
	 * amaz.secondstep(); //calling the second step to do perform actions what the
	 * operations exist at their block
	 * 
	 * 
	 * 
	 * amaz.closethapp(); //calling the close the app to do perform actions what the
	 * operations exist at their block }
	 */
}
