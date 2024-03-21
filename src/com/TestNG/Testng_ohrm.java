package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Log4j_Utility.Log;

public class Testng_ohrm extends BaseTest {
	
	@Test(priority = 1,description ="blank credintials" )
	
	public void blank() throws InterruptedException {
		String validemail = "";
		String validpassword = "";

		By loginpanelpropert = By.id("logInPanelHeading");
		WebElement logintext = driver.findElement(loginpanelpropert);
		//System.out.println("the text of :" + logintext.getText());

		By usernameproperty = By.id("txtUsername");
		By passwordpropery = By.id("txtPassword");
		By loginproperty = By.id("btnLogin");

		WebElement username = driver.findElement(usernameproperty);
		WebElement password = driver.findElement(passwordpropery);

		username.sendKeys(validemail);
		password.sendKeys(validpassword);
		WebElement login = driver.findElement(loginproperty);
		login.click();
		//login.clear();
		System.out.println("it displays the invalid credintails - Both Blanks");
		Thread.sleep(3000);
		driver.navigate().refresh();;
		//System.out.println("refreshh the page");
		
		

	}
	
    @Test (priority = 2,description = "invalid credintials")
    
	public void invalid() throws InterruptedException {

		String validemail = "Uma@70";
		String validpassword = "Pra@770";

		By loginpanelpropert = By.id("logInPanelHeading");
		WebElement logintext = driver.findElement(loginpanelpropert);
		System.out.println("the text of :" + logintext.getText());

		By usernameproperty = By.id("txtUsername");
		By passwordpropery = By.id("txtPassword");
		By loginproperty = By.id("btnLogin");

		WebElement username = driver.findElement(usernameproperty);
		WebElement password = driver.findElement(passwordpropery);

		username.sendKeys(validemail);
		password.sendKeys(validpassword);

		WebElement login = driver.findElement(loginproperty);
		login.click();
		//login.clear();
		System.out.println("it displays the invalid credintails");
		Thread.sleep(3000);
		driver.navigate().refresh();
		//System.out.println("back the page");
		

	}
    @Test (priority = 3,description = "valid credintails")

	public void valid() throws InterruptedException {
		String validemail = "Uma@7470";
		String validpassword = "Pra@7470";

		By loginpanelpropert = By.id("logInPanelHeading");
		WebElement logintext = driver.findElement(loginpanelpropert);
		System.out.println("the text of :" + logintext.getText());

		By usernameproperty = By.id("txtUsername");
		By passwordpropery = By.id("txtPassword");
		By loginproperty = By.id("btnLogin");

		WebElement username = driver.findElement(usernameproperty);
		WebElement password = driver.findElement(passwordpropery);

		username.sendKeys(validemail);
		password.sendKeys(validpassword);

		WebElement login = driver.findElement(loginproperty);
		login.click();
		Thread.sleep(3000);
		Log.info("it displays the valid credintails");

	}

	@Test(priority = 4, description = "clicking pim")
	
	public void pim() {
		By pimproperty = By.xpath("//b[text()='PIM']");
		WebElement pim = driver.findElement(pimproperty);
		pim.click();
		Log.info("clicks the pim");
	}

	@Test(priority = 5, description = "add employee")
	
	public void add_employee() {

		By addemployeebutton_property = By.id("menu_pim_addEmployee");
		WebElement addemployee = driver.findElement(addemployeebutton_property);
		addemployee.click();
		System.out.println("click the add employee");

		By firstnameProperty = By.id("firstName");
		WebElement firstname = driver.findElement(firstnameProperty);
		firstname.click();
		firstname.sendKeys("ranganna");

		By middlenameproperty = By.id("middleName");
		WebElement middlename = driver.findElement(middlenameproperty);
		middlename.click();

		middlename.sendKeys("babu");
		By lastnameproperty = By.id("lastName");
		WebElement lastname = driver.findElement(lastnameproperty); //
		lastname.click();

		lastname.sendKeys("ranga sthalam");
		By saveproperty = By.id("btnSave");
		WebElement savebutton = driver.findElement(saveproperty);
		savebutton.click();
		Log.info("added employee viswamithra");

	}
	
@Test (priority=6,description = "logout")

	public void logout() {
		driver.findElement(By.linkText("Welcome Admin")).click();
		By logoutproperty = By.xpath("//*[@id='welcome-menu']/ul/li[3]/a");
		WebElement logout = driver.findElement(logoutproperty);
		logout.click();
	 Log.info("logout the ohrm");

	}
}
