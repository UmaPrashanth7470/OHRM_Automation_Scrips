package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXcel_Multipletestdata_writedata2 {
	public static void main(String[] args) throws IOException {
		 
		FileInputStream addressofbook =new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(addressofbook);
		
		XSSFSheet page=book.getSheet("automate");
		Row row1=page.createRow(29);
		Cell cell1=row1.createCell(0);
		cell1.setCellValue("Locators");
		
		Cell cell2=row1.createCell(1);
		cell2.setCellValue("full of xpath");
		
		Cell cell3=row1.createCell(2);
		cell3.setCellValue("methods");
		
		Cell cell4=row1.createCell(3);
		cell4.setCellValue("actions of mouse and keyboard");
		
		Cell cell5=row1.createCell(4);
		cell5.setCellValue("screenshots");
		
		Cell cell6=row1.createCell(5);
		cell6.setCellValue("excel sheet");
		
		Cell cell7=row1.createCell(6);
		cell7.setCellValue("read data");
		
		Cell cell8=row1.createCell(7);
		cell8.setCellValue("write data");
		
		Cell cell9=row1.createCell(8);
		cell9.setCellValue("user defined methods");
		
		Cell cell10=row1.createCell(9);
		cell10.setCellValue("test ng");
		
		Cell cell11=row1.createCell(10);
		cell11.setCellValue("data driven");
		
		Cell cell12=row1.createCell(11);
		cell12.setCellValue("POM");
		
		Cell cell13=row1.createCell(12);
		cell13.setCellValue("cucumber");
		
		FileOutputStream testingout=new FileOutputStream("C:\\\\Users\\\\Hp\\\\Desktop\\\\TestDataFamily.xlsx");
		book.write(testingout);
		
		System.out.println("this is the cell value:-"+cell1);
		System.out.println("this is the cell value:-"+cell2);
		System.out.println("this is the cell value:-"+cell3);
		System.out.println("this is the cell value:-"+cell4);
		System.out.println("this is the cell value:-"+cell5);
		System.out.println("this is the cell value:-"+cell6);
		System.out.println("this is the cell value:-"+cell7);
		System.out.println("this is the cell value:-"+cell8);
		System.out.println("this is the cell value:-"+cell9);
		System.out.println("this is the cell value:-"+cell10);
		System.out.println("this is the cell value:-"+cell11);
		System.out.println("this is the cell value:-"+cell12);
		System.out.println("this is the cell value:-"+cell13);
			
		
		
		
		
		
				
		
		
	
			
		
	}

}
