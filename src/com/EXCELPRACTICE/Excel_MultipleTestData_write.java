package com.EXCELPRACTICE;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_MultipleTestData_write {
	public static void main(String[] args) throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(path);
		
		XSSFSheet sheet = workBook.getSheet("Sheet3");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue("uma Prashanth");
		
		Row row2= sheet.createRow(3);
		Cell cell2 = row.createCell(1);
		cell2.setCellValue("salaar");
		
		
		
		
		
		FileOutputStream testOuputfile = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		workBook.write(testOuputfile);
		System.out.println(cell);
		System.out.println(cell2);
	}
}
