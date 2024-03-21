package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetData_in_Console {
	public void uma() throws IOException {
		
	
	
		FileInputStream path = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(path);
		XSSFSheet page = book.getSheet("HybridFrameWorks");
		Row row = page.getRow(1);

		for (int i = 0; i < 5; i++) {
			Cell cell = row.getCell(i);
			String data1 = cell.getStringCellValue();
			System.out.println(data1);
		}
		System.out.println("Got Row one Data");
		}	
		
	
	
	
	public void directors() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book2=new XSSFWorkbook(excel);
		
		XSSFSheet page=book2.getSheet("directors");
		Row row1=page.getRow(0);
		
		for (int i = 0; i <6; i++) {
			Cell cell =row1.getCell(i);
		   String   output  =  cell.getStringCellValue();
		   System.out.println(output);
			
			
		} 
		System.out.println( "get the data");
	}
	
	public void Marks() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book3=new XSSFWorkbook(excel);
		
		XSSFSheet page=book3.getSheet("Marks");
		Row row1=page.getRow(0);
		
		for (int i = 0; i <5; i++) {
			Cell cell =row1.getCell(i);
		   String   output  =  cell.getStringCellValue();
		   System.out.println(output);
			
			
		} 
		System.out.println( "get the data");

		
		
	}
	public void rows() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book3=new XSSFWorkbook(excel);
		
		XSSFSheet page=book3.getSheet("Marks");
		Row row0=page.getRow(0);
		Row row1=page.getRow(1);
		Row row2=page.getRow(2);
		Row row3=page.getRow(3);
		Row row4=page.getRow(4);
		Row row5=page.getRow(5);
		
		
		for (int i = 0; i <5; i++) {
			
			Cell cell =row0.getCell(i);
		   String   output  =  cell.getStringCellValue();
		   System.out.println(output);
		   
		   Cell cell1 =row1.getCell(i);
		   String   out =  cell1.getStringCellValue();
		   System.out.println(out);
		   
		   Cell cell2 =row2.getCell(i);
		   String   outputtest =  cell2.getStringCellValue();
		   System.out.println(outputtest);
		   
		   Cell cell3 =row3.getCell(i);
		   String   ou  =  cell3.getStringCellValue();
		   System.out.println(ou);
		   
		   Cell cell4 =row4.getCell(i);
		   String   outp  =  cell4.getStringCellValue();
		   System.out.println(outp);
		   
		   Cell cell5 =row5.getCell(i);
		   String   outpu  =  cell5.getStringCellValue();
		   System.out.print(outpu+ " | ");
	
		} 
		System.out.println( "get the data");

		
	}
	
		 
	public static void main(String[] args) throws IOException {
		GetData_in_Console get=new GetData_in_Console();
		get.uma();
		get.directors();
		get.Marks();
		get.rows();
		
	}
}
