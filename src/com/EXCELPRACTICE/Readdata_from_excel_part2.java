package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_from_excel_part2 {
	public static void main(String[] args) throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(path);
		XSSFSheet sh=wb.getSheet("TestData");
		Row tdr1=sh.getRow(0);
		Cell tdc1=tdr1.getCell(0);
		 String test_data_cell1 = tdc1.getStringCellValue();
		 System.out.println("this is value of 1stcell:-"+test_data_cell1);
		
		Row tdr2=sh.getRow(15);
		Cell tdc2=tdr2.getCell(2);
		String test_data_cell2 = tdc2.getStringCellValue();
		System.out.println("this is value of 2ndcell:-"+test_data_cell2);
		
		Row tdr3=sh.getRow(11);
		Cell tdc3=tdr3.getCell(5);
		String test_data_cell3 = tdc3.getStringCellValue();
		System.out.println("this is value of 3rdcell:-"+test_data_cell3);
		
		Row tdr4=sh.getRow(7);
		Cell tdc4=tdr4.getCell(3);
		String test_data_cell4 = tdc4.getStringCellValue();
		System.out.println("this is value of 4thcell:-"+test_data_cell4);
		
		Row tdr5=sh.getRow(17);
		Cell tdc5=tdr5.getCell(10);
		String test_data_cell5 = tdc5.getStringCellValue();
		System.out.println("this is value of 5thcell:-"+test_data_cell5);
		
		
		Row tdr6=sh.getRow(23);
	    Cell tdc6=tdr6.getCell(3);
	    String test_data_cell6 = tdc6.getStringCellValue();
	    System.out.println("this is value of 6thcell:-"+test_data_cell6);
	   
	    		
	    
	    
		
				
		
				
		
		
		 
		
		
		
		
		
		
		
		
	}

}
