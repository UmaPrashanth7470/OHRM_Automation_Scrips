package com.Ohrm_valids;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Log4j_Utility.Log;

public class Add_employees_in_ohrm {

	public WebDriver driver;

	@Test(priority = 1)
	public void OHRM_launch() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.out.println("launch the browser");
		Log.info("launch the browser");

		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		System.out.println("get the ohrm");

		FileInputStream path = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(path);
		XSSFSheet page = book.getSheet("OHRM_LoginData");
		Row row = page.getRow(1);

		Cell userName = row.getCell(0);
		String usernameData = userName.getStringCellValue();

		Cell password = row.getCell(1);
		String passwordData = password.getStringCellValue();

		By usernameproperty = By.id("txtUsername");
		WebElement username = driver.findElement(usernameproperty);
		username.click();
		username.sendKeys(usernameData);

		By passwordproperty = By.id("txtPassword");
		WebElement Password = driver.findElement(passwordproperty);
		Password.sendKeys(passwordData);

		By loginpropery = By.id("btnLogin");
		WebElement login = driver.findElement(loginpropery);
		login.click();
		//System.out.println("login the ohrm");
		Log.info("login the ohrm");

	}

	@Test(priority = 4)
	public void close() {
		driver.quit();
		//System.out.println("close the driver");
		Log.info("close the driver");


	}

	@Test(priority = 2)
	public void pim() {
		By pimproperty = By.xpath("//b[text()='PIM']");
		WebElement pim = driver.findElement(pimproperty);
		pim.click();
		//System.out.println("clicks the pim");
		Log.info("clicks the pim");


	}

	@Test(priority = 3)
	public void adding_employee() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet page = book.getSheet("directors");
		Row row1 = page.getRow(1);

		for (int i = 0; i < 6; i++) {
			Cell cell1 = row1.getCell(i);
			String celldata1 = cell1.getStringCellValue();

			By addemployeebutton_property = By.id("menu_pim_addEmployee");
			WebElement addemployee = driver.findElement(addemployeebutton_property);
			addemployee.click();
			System.out.println("click the add employee");
			By firstnameProperty = By.id("firstName");
			WebElement firstname = driver.findElement(firstnameProperty);
			firstname.click();
			firstname.sendKeys(celldata1);
			By middlenameproperty = By.id("middleName");
			WebElement middlename = driver.findElement(middlenameproperty);
			middlename.click();
			middlename.sendKeys("--");
			By lastnameproperty = By.id("lastName");
			WebElement lastname = driver.findElement(lastnameproperty); //
			lastname.click();
			lastname.sendKeys("--");
			By saveproperty = By.id("btnSave");
			WebElement savebutton = driver.findElement(saveproperty);
			savebutton.click();
			System.out.println(i + " - " + "added employee puri");
		}
		By addemployeebutton_property = By.id("menu_pim_addEmployee");
		WebElement addemployee = driver.findElement(addemployeebutton_property);
		addemployee.click();
		//System.out.println("click the add employee");
		Log.info("click the add employee");

	}

//public static void main(String[] args) throws InterruptedException, IOException {
//	Add_employees_in_ohrm add = new Add_employees_in_ohrm();
//	add.OHRM_launch();
//	add.pim();
//	add.adding_employee();
//	add.close();
//
//}
}
