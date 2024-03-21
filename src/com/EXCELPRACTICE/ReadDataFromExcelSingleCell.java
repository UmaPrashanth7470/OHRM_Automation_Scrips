package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSingleCell  {
	public static void main(String[] args) throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(path);
		XSSFSheet sheet = workBook.getSheet("TestData");
		Row testDataRow = sheet.getRow(2); 
		Cell testDataRowOfCell = testDataRow.getCell(1);
		Row secondtestdatarow=sheet.getRow(7);
		Cell secondtestdatacell=secondtestdatarow.getCell(3);
		
		String testData = testDataRowOfCell.getStringCellValue();
		System.out.println("The Value in the cellData is :- "+testData);
		
		String secondtestdata=secondtestdatacell.getStringCellValue();
		System.out.println("the value of second test data is :-"+secondtestdata);
		
		
		
		
	}
	
}
