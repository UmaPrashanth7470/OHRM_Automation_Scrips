package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseTest.BaseTest;

public class NestesdForLoop_CapturingEntireWebTable extends BaseTest {
	
	
	public void NestesdForLoop_CapturingEntireWebTable_DataInConsole() throws IOException {
				
		// WebTable - Property -- /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
		
		FileInputStream addressofbook =new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(addressofbook);	
		XSSFSheet page=book.getSheet("TableData_Write");
	
		
		//tBody - WebTable Property
		By WebtableProperty = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody");
		WebElement Webtable = driver.findElement(WebtableProperty);
		
		//WebTable - no.of rows Properties ---- common tag name is "tr"
		By rowsProperty = By.tagName("tr");
		List<WebElement> rows = Webtable.findElements(rowsProperty);
		
		// size of the rows in a webTable
		int rowsCounts = rows.size();
		
		
		// Going to Every row in a webTable
		for (int rowIndex = 0; rowIndex < rowsCounts; rowIndex++) {
			
			Row row1=page.createRow(0);
			WebElement webtableRow = rows.get(rowIndex);
			
			//WebTable - no.of columns in a rows(rowOfCells) Properties ---- common tag name is "tr"
			By rowOfCellsProperty = By.tagName("td");
			List<WebElement> rowOfCells = webtableRow.findElements(rowOfCellsProperty);
			
			// size of cells in a row
			int rowOfCellsCount = rowOfCells.size();
			
			
			//Going to a Every Cell in a Row
			for (int rowOfCellIndex = 0; rowOfCellIndex < rowOfCellsCount; rowOfCellIndex++) {
				
				// Going to Particular cell in a row
				
				WebElement rowOfCell = rowOfCells.get(rowOfCellIndex);
				
				String data = rowOfCell.getText();
				System.out.print(data+ " | "); 
				
				Cell cell1=row1.createCell(0);
				cell1.setCellValue(data);
				
				FileOutputStream testingout=new FileOutputStream("C:\\\\Users\\\\Hp\\\\Desktop\\\\TestDataFamily.xlsx");
				book.write(testingout);				
			}
			System.out.println();				
		}
	}
	
	public static void main(String[] args) throws IOException {
		NestesdForLoop_CapturingEntireWebTable webTable_Data = new NestesdForLoop_CapturingEntireWebTable();
		webTable_Data.applicationLaunch();
		webTable_Data.NestesdForLoop_CapturingEntireWebTable_DataInConsole();
		webTable_Data.applicationClose();
	}

}
