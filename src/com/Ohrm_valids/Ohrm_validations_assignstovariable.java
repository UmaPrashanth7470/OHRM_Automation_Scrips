 package com.Ohrm_valids;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrm_validations_assignstovariable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ChromeDriver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		ChromeDriver ohrm = new ChromeDriver();
		ohrm.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("open the google browser");
		ohrm.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		System.out.println("open the Ohrm App");
		String ohrmactualtittle = ohrm.getTitle();
		// <input type="submit" name="Submit" class="button" id="btnLogin"
		// value="LOGIN">
		WebElement ohrmHeadText = ohrm.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		System.out.println("the actual tittle of:" + ohrmactualtittle);
		String ohrmexptittle = "OrangeHRM";
		System.out.println(ohrmHeadText.getText());
		if (ohrmexptittle.equals(ohrmexptittle)) {
			System.out.println("Tittle is matched :pass");
		} else {
			System.out.println("Tittle is not matched :Fail");
		}

		System.out.println("*********************");
		String ohrmactualurl = ohrm.getCurrentUrl();
		String ohrmexpecturl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		if (ohrmactualurl.equals(ohrmexpecturl)) {
			System.out.println("url is matched:pass");
		} else {
			System.out.println("url is not mat");
		}

		String invalidname = "ummmmmaaa";
		String invalidpassword = "7444477";
		String validname = "Uma@7470";
		String validpaassword = "Pra@7470";
		By usernameproperty = By.xpath("//input[@id='txtUsername']");
		By passwordproperty = By.id("txtPassword");
		By buttonproperty = By.id("btnLogin");
		By welcomeproperty = By.partialLinkText("Welcome");
		//// *[@id="welcome-menu"]/ul/li[3]
		By logoutproperty = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");

		WebElement username = ohrm.findElement(usernameproperty);
		WebElement password = ohrm.findElement(passwordproperty);
		WebElement button = ohrm.findElement(buttonproperty);
		// Thread.sleep(3000);
		username.sendKeys(invalidname);
		password.sendKeys(invalidpassword);
		button.click();
		System.out.println("is displays showing invalid crendintails");

		ohrm.navigate().back();

		username.clear();
		password.clear();

		username.sendKeys(validname);
		password.sendKeys(validpaassword);
		button.click();

		System.out.println("it is login ");
		System.out.println("$$$$$$$$$$$$");
		By assigntextproperty = By.xpath("//span[contains(text(),'Assign Leave')]");
		WebElement assigntext = ohrm.findElement(assigntextproperty);

		System.out.println(assigntext.getText());
		System.out.println("*************");
		By leavelistpreoperty = By.xpath("//span[contains(text(),'Leave List')]");
		WebElement leavelist = ohrm.findElement(leavelistpreoperty);
		System.out.println(leavelist.getText());
		System.out.println("&&&&&");
		By timesheetproperty = By.xpath("//span[contains(text(),'Timesheets')]");
		WebElement timesheet = ohrm.findElement(timesheetproperty);
		System.out.println(timesheet.getText());

		WebElement welcome = ohrm.findElement(welcomeproperty);
		WebElement logout = ohrm.findElement(logoutproperty);

		welcome.click();

		logout.click();
		System.out.println("logout the ohrm");

		ohrm.quit();
		System.out.println("quit the ohrm");

	}

}
 