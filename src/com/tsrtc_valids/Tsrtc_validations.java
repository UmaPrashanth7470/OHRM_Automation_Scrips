package com.tsrtc_valids;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tsrtc_validations {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String browser = "https://www.google.com/";
		String browsingtheapp = "https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("launch the browser");

		driver.manage().window().maximize();
		System.out.println("maximisize the window");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("wait for the element to find");
		driver.get(browser);
		System.out.println("open the google");
		driver.navigate().to(browsingtheapp);
		System.out.println("it navigates the tsrtc onnline link");
		String actual_tittle = driver.getTitle();
		System.out.println("this is the actual tittle :" + actual_tittle);
		String actual_url = driver.getCurrentUrl();
		System.out.println("this is the actual url of page:: " + actual_url);

		String expect_tittle = "Online Bus Ticket Booking | TSRTC Official Website | Telangana";
		String expect_url = "https://www.tsrtconline.in/oprs-web/";
		if (actual_tittle.equals(expect_tittle)) {
			System.out.println("1)it is matched as per requirement:pass");
		} else {
			System.out.println("1)it is not matched as per requirement :fail");
		}

		if (actual_tittle.contains(expect_tittle)) {
			System.out.println("2)it contains the same as per requirement:pass");
		} else {
			System.out.println("2)it contains not the same as per requirement:fail");
		}

		if (actual_tittle.equalsIgnoreCase(expect_tittle)) {
			System.out.println("3)it is equal ignores as per requirement:pass");
		} else {
			System.out.println("3)it is not equal ignores as per requirement:fail");
		}

		if (actual_url.equals(expect_url)) {
			System.out.println("this url is matched as per requirement:pass");
		} else {
			System.out.println("this url is not matched aas per requirement:fail");
		}
		System.out.println("***verification the tittle is over***and***verification the linksbegin***");

		By eticketlogin_property = By.xpath("//*[text()='eTicket Login']");
		WebElement eticket_login = driver.findElement(eticketlogin_property);
		// eticket_login.getText();
		// System.out.println("this is the eticket login actual
		// text:"+eticket_login.getText());
		String eticket_expect_text = "eTicket Login";
		if (eticket_login.equals(eticket_expect_text)) {
			System.out.println("1)it is matches as per requirement:pass");
		} else {
			System.out.println("1)it is not matched:fail");
		}

		if (eticket_login.getText().contains(eticket_expect_text)) {
			System.out.println("1)it is contains the same matches as per requirement:pass");
		} else {
			System.out.println("1)it is not contains not matched:fail");
		}

		if (eticket_login.getText().equalsIgnoreCase(eticket_expect_text)) {
			System.out.println("1)it is matches after the ignore cases as per requirement:pass");
		} else {
			System.out.println("1)it is not matched after ignore case:fail");
		}

		eticket_login.click();
		System.out.println("it clicks the eticket_login");
		Thread.sleep(5000);
		File eticket_image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(eticket_image, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/eticket_login_screenshot.png"));
		System.out.println("eticket captures");

		driver.navigate().back();
		System.out.println("back the tsrtc");

		/*
		 * By oprlogin_property=By.xpath("//*[text()='ATB/OPR Login']"); WebElement
		 * opr_login=driver.findElement(oprlogin_property); opr_login.getText();
		 * System.out.println("the opr_login actual texct is:"+opr_login.getText());
		 * opr_login.click(); System.out.println("clicking on opr login");
		 * Thread.sleep(5000); File
		 * oprimge=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(oprimge, new
		 * File("C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/opr_screenshot.png"
		 * )); System.out.println("opr-screen shot captures"); driver.navigate().back();
		 * System.out.println("back the tsrtc home page");
		 */

		By home_property = By.xpath("/html/body/div[3]/div/a[1]");
		WebElement home = driver.findElement(home_property);
		home.getText();
		System.out.println("this is the home actual text: " + home.getText());
		String home_expext_text = "Home";
		if (home.getText().equals(home_expext_text)) {
			System.out.println("2)it is matches as per requirement:pass");
		} else {
			System.out.println("2)it is not matched:fail");
		}

		if (home.getText().contains(home_expext_text)) {
			System.out.println("2)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("2)it is not contains and matched:fail");
		}

		if (home.getText().equalsIgnoreCase(home_expext_text)) {
			System.out.println("2)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("2)it is not match after the ignore cases:fail");
		}

		home.click();
		System.out.println("clicking the home page");
		Thread.sleep(5000);
		File home_img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(home_img, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/home_screenshot.png"));
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By busoncontractproperty = By.linkText("Bus on Contract");
		WebElement Bus_On_contract = driver.findElement(busoncontractproperty);
		Bus_On_contract.getText();
		System.out.println("this is the bus on contract actual text:" + Bus_On_contract.getText());

		Bus_On_contract.click();
		System.out.println("clicking the bus on property");
		Thread.sleep(5000);
		File busoncontract_img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(busoncontract_img, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/bus_on_contract_screenshot.png"));
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By enquirypropety = By.xpath("/html/body/div[3]/div/a[3]");
		WebElement enquiry = driver.findElement(enquirypropety);
		enquiry.getText();
		System.out.println("this is the enquiry actualtext:" + enquiry.getText());
		String enquiry_expect_text = "Enquiry";
		if (enquiry.getText().equals(enquiry_expect_text)) {
			System.out.println("3)it is matches as per requirement:pass");
		} else {
			System.out.println("3)it is not matched:fail");
		}

		if (enquiry.getText().contains(enquiry_expect_text)) {
			System.out.println("3)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("3)it is not contains and matched:fail");
		}

		if (enquiry.getText().equalsIgnoreCase(enquiry_expect_text)) {
			System.out.println("3)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("3)it is not match after the ignore cases:fail");
		}

		enquiry.click();
		System.out.println("clickin the enquiry");
		Thread.sleep(5000);
		File enquiry_img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(enquiry_img, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/enquiry_screenshot.png"));
		System.out.println("captures the screen shot");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By cancel_property = By.xpath("//*[text()='Cancel Tickets']");
		WebElement cancel = driver.findElement(cancel_property);
		cancel.getText();
		System.out.println("this is the cancel actual text:" + cancel.getText());
		String cancel_tickets_expect_text = "Cancel Tickets";
		if (cancel.getText().equals(cancel_tickets_expect_text)) {
			System.out.println("4)it is matches as per requirement:pass");
		} else {
			System.out.println("4)it is not matched:fail");
		}

		if (cancel.getText().contains(cancel_tickets_expect_text)) {
			System.out.println("4)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("4)it is not contains and matched:fail");
		}

		if (cancel.getText().equalsIgnoreCase(cancel_tickets_expect_text)) {
			System.out.println("4)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("4)it is not match after the ignore cases:fail");
		}

		cancel.click();
		System.out.println("cancel clicking");
		Thread.sleep(5000);
		File cancel_img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(cancel_img, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/cancel_screenshot.png"));
		System.out.println("capture the screenshot of cancel");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By cancel_service_property = By.xpath("//*[text()='Cancelled Services']");
		WebElement cancel_services = driver.findElement(cancel_service_property);
		cancel_services.getText();
		System.out.println("this is the cancel services actual text:" + cancel_services.getText());
		String cancel_services_expect_text = "Cancelled Services";
		if (cancel_services.getText().equals(cancel_services_expect_text)) {
			System.out.println("5)it is matches as per requirement:pass");
		} else {
			System.out.println("5)it is not matched:fail");
		}

		if (cancel_services.getText().contains(cancel_services_expect_text)) {
			System.out.println("5)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("5)it is not contains and matched:fail");
		}

		if (cancel_services.getText().equalsIgnoreCase(cancel_services_expect_text)) {
			System.out.println("5)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("5)it is not match after the ignore cases:fail");
		}

		cancel_services.click();
		System.out.println("clicking the cancel services");
		Thread.sleep(5000);
		File cancelserviceimg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(cancelserviceimg, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/cancelsevices_screenshot.png"));
		System.out.println("capture the screenshot of cancel_services");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By aboutproperty = By.xpath("/html/body/div[3]/div/a[6]");
		WebElement about_us = driver.findElement(aboutproperty);
		about_us.getText();
		System.out.println("this is the about us actual text:" + about_us.getText());
		String aboutus_expect_text = "About Us";
		if (about_us.getText().equals(aboutus_expect_text)) {
			System.out.println("6)it is matches as per requirement:pass");
		} else {
			System.out.println("6)it is not matched:fail");
		}

		if (about_us.getText().contains(aboutus_expect_text)) {
			System.out.println("6)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("6)it is not contains and matched:fail");
		}

		if (about_us.getText().equalsIgnoreCase(aboutus_expect_text)) {
			System.out.println("6)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("6)it is not match after the ignore cases:fail");
		}

		about_us.click();
		System.out.println("clicking the about us");
		Thread.sleep(5000);
		File aboutimg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(aboutimg,
				new File("C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/about_us.png"));
		System.out.println("capture the about us ");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By tourismproperty = By.xpath("//*[text()='Tourism']");
		WebElement tourism = driver.findElement(tourismproperty);
		tourism.getText();
		System.out.println("tourism actual text:" + tourism.getText());
		String tourism_expect_text = "Tourism";
		if (tourism.getText().equals(tourism_expect_text)) {
			System.out.println("7)it is matches as per requirement:pass");
		} else {
			System.out.println("7)it is not matched:fail");
		}

		if (tourism.getText().contains(tourism_expect_text)) {
			System.out.println("7)it is contains and  matches as per requirement:pass");
		} else {
			System.out.println("7)it is not contains and matched:fail");
		}

		if (tourism.getText().equalsIgnoreCase(tourism_expect_text)) {
			System.out.println("7)it is matches after the equalsignorecases as per requirement:pass");
		} else {
			System.out.println("7)it is not match after the ignore cases:fail");
		}

		tourism.click();
		System.out.println("clicking the tourism");
		Thread.sleep(5000);
		File tourismimg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tourismimg, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/tourism_screenshot.png"));
		System.out.println("tourism captures");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");

		By driverproperty = By.xpath("/html/body/div[3]/div/a[8]");
		WebElement driver_info = driver.findElement(driverproperty);
		driver_info.getText();
		System.out.println("driver_info actual text:" + driver_info.getText());
		driver_info.click();
		System.out.println("clicking the driver_info");
		Thread.sleep(5000);
		File driverimg = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(driverimg, new File(
				"C:\\trainings\\selenium automation\\work space\\java project\\screenshot_pra/driver_screenshot.png"));
		System.out.println("driver_info captures");
		driver.navigate().back();
		System.out.println("back of the tsrtc page");
		driver.quit();
		System.out.println("close the browser");
     

  	 

   
    	 
     
 
     

     
     
     
     
     
     
     
     
     
     
     
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
