package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedforLoop2_capturing_entirewebtabledata {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launch the browser");
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		//http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login		
		System.out.println("opens the ohrm");
		
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		XSSFSheet page=book.getSheet("Crendintials");
		
		Row row=page.getRow(0);
		Cell cell=row.getCell(0);
	    String	username=cell.getStringCellValue();
	   System.out.println(username);
		
		Row row1=page.getRow(1);
		Cell cell1=row1.getCell(0);
		String password=cell1.getStringCellValue();
		System.out.println(password);
		
		By usernam=By.id("txtUsername");
		WebElement user =driver.findElement(usernam);
		user.sendKeys(username);
		System.out.println("clicking the user name");
		
		By paasword=By.id("txtPassword");
		WebElement pass=driver.findElement(paasword);
		pass.sendKeys(password);
		
		By loginproperty=By.id("btnLogin");
		WebElement login=driver.findElement(loginproperty);
		login.click();
		System.out.println("click the login");
		
		By  pimproperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimproperty);
		pim.click();
		
		By employeelist=By.linkText("Employee List");
		WebElement employee=driver.findElement(employeelist);
		employee.click();
		System.out.println("clicks the employee list");
		
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		
		
	   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		
		By webtableproperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
		WebElement webtable=driver.findElement(webtableproperty);
		
		 By rowspropery=By.tagName("tr");
		 List<WebElement> rows=webtable.findElements(rowspropery);
		
		int countofrow=rows.size();
		System.out.println("this is the actual count:"+countofrow);
		
		for (int i = 0; i < countofrow; i++) {
			WebElement webtablerow=rows.get(i);
			
			By rowofcellproperty=By.tagName("td");	
			List<WebElement> rowofcell=webtablerow.findElements(rowofcellproperty);
			int rowsofcellscount=rowofcell.size();
			
             for (int rowOfCellIndex = 0; rowOfCellIndex < rowsofcellscount; rowOfCellIndex++) {
				
				// Going to Particular cell in a row
				
				WebElement rowOfCell = rowofcell.get(rowOfCellIndex);
				
				String data = rowOfCell.getText();
				System.out.print(data+ " | ");  
				
			}
			System.out.println();				
		
			
			
		}
		
			
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
