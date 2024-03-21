package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_excel_Part3 {
	public static void main(String[] args) throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		XSSFSheet   page=book.getSheet("TestData");
		Row tdr_1 =page.getRow(23);
		Cell tdc_1=tdr_1.getCell(3);
		
		Row tdr_2=page.getRow(19);
		Cell tdc_2=tdr_2.getCell(2);
		
		Row  tdr_3=page.getRow(17);
		Cell tdc_3=tdr_3.getCell(2);
		
		Row  tdr_4=page.getRow(17);
		Cell tdc_4=tdr_4.getCell(10);
		
		Row  tdr_5=page.getRow(16);
		Cell tdc_5=tdr_5.getCell(3);
		
		Row  tdr_6=page.getRow(15);
		Cell tdc_6=tdr_6.getCell(2);
		
		Row  tdr_7=page.getRow(13);
		Cell tdc_7=tdr_7.getCell(2);
		
		Row  tdr_8=page.getRow(11);
		Cell tdc_8=tdr_8.getCell(5);
		
		Row  tdr_9=page.getRow(9);
		Cell tdc_9=tdr_9.getCell(2);
		
		Row  tdr_10=page.getRow(7);
		Cell tdc_10=tdr_10.getCell(3);
		
		Row  tdr_11=page.getRow(6);
		Cell tdc_11=tdr_11.getCell(0);
		
		Row  tdr_12=page.getRow(5);
		Cell tdc_12=tdr_12.getCell(2);
		
		Row  tdr_13=page.getRow(5);
		Cell tdc_13=tdr_13.getCell(04);
		
		Row  tdr_14=page.getRow(2);
		Cell tdc_14=tdr_14.getCell(01);
		
		Row  tdr_15=page.getRow(1);
		Cell tdc_15=tdr_15.getCell(4);
		
		Row  tdr_16=page.getRow(0);
		Cell tdc_16=tdr_16.getCell(0);
		

		String tdc1=tdc_1.getStringCellValue();
		String tdc2=tdc_2.getStringCellValue();
		String tdc3=tdc_3.getStringCellValue();
		String tdc4=tdc_4.getStringCellValue();
		String tdc5=tdc_5.getStringCellValue();
		String tdc6=tdc_6.getStringCellValue();
		String tdc7=tdc_7.getStringCellValue();
		String tdc8=tdc_8.getStringCellValue();
		String tdc9=tdc_9.getStringCellValue();
		String tdc10=tdc_10.getStringCellValue();
		String tdc11=tdc_11.getStringCellValue();
		String tdc12=tdc_12.getStringCellValue();
		String tdc13=tdc_13.getStringCellValue();
		String tdc14=tdc_14.getStringCellValue();
		String tdc15=tdc_15.getStringCellValue();
		String tdc16=tdc_16.getStringCellValue();
		
		System.out.println("test data of cell:-"+tdc16);
		System.out.println("test data of cell:-"+tdc15);
		System.out.println("test data of cell:-"+tdc14);
		System.out.println("test data of cell:-"+tdc13);
		System.out.println("test data of cell:-"+tdc12);
		System.out.println("test data of cell:-"+tdc11);
		System.out.println("test data of cell:-"+tdc10);
		System.out.println("test data of cell:-"+tdc9);
		System.out.println("test data of cell:-"+tdc8);
		System.out.println("test data of cell:-"+tdc7);
		System.out.println("test data of cell:-"+tdc6);
		System.out.println("test data of cell:-"+tdc5);
		System.out.println("test data of cell:-"+tdc4);
		System.out.println("test data of cell:-"+tdc3);
		System.out.println("test data of cell:-"+tdc2);
		System.out.println("test data of cell:-"+tdc1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
