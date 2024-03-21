package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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

import com.BaseTest.BaseTest;

public class Write_WebTableData_in_ExcelSheet {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe"
		  ); driver=new ChromeDriver(); //browser launching
		  System.out.println("launch the browser");
		  
		  driver.get("https://www.timeanddate.com/worldclock/"); 
		  //getting the   application
		 
		  System.out.println("getting the World Clock - Time And Date Application");
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  String xpath1 =
		  "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["; String
		  xpath2 = "]/td[1]";
		  
		  FileInputStream path = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(path);

		for (int index = 1; index <= 36; index++) {

			XSSFSheet sheet = workBook.getSheet("WebTableData");
			Row row = sheet.createRow(index);
			Cell cell = row.createCell(2);

			WebElement entireColmnData = driver.findElement(By.xpath(xpath1 + index + xpath2));
			String firstColumncityNames = entireColmnData.getText();

			cell.setCellValue(firstColumncityNames);
			FileOutputStream testOutputFile = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			workBook.write(testOutputFile);
			System.out.println(index + " - " + firstColumncityNames);
		}
	}

}
