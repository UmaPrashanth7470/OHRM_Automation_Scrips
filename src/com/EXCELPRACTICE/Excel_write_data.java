package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_data {
	
	public static void main(String[] args) throws IOException {
		FileInputStream addressofbook=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book =new XSSFWorkbook(addressofbook);
		
		XSSFSheet page =book.createSheet("jai balayya");
		Row row=page.createRow(2);
		Cell cell=row.createCell(1);
		
		cell.setCellValue("balayya");
		
		
		FileOutputStream bala =new FileOutputStream("C:\\\\Users\\\\Hp\\\\Desktop\\\\TestDataFamily.xlsx");
		book.write(bala);
		
		System.out.println(cell);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
