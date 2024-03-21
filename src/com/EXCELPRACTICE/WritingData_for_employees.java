package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_for_employees {
	
	public void addemployee() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.createSheet("directors");
		Row row0=page.createRow(0);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("shankar");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Ar Muruga das");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("lokesh kanagaraj");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("Mani rathnam");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("vetrimaran");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("Pa ranjth");
		
		
		FileOutputStream test = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(test);
		
		
		
		
				
		
	}
	public static void main(String[] args) throws IOException {
		 WritingData_for_employees wrote=new WritingData_for_employees();
		 //wrote.addemployee();
		 wrote.heoros();
		 
	}
	public void heoros() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("directors");
		Row row0=page.createRow(1);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Rajini");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("kamal hasan");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("vijayi");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("ajith");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("vijayi sethupathi");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("siva karthikeyan");
		
		
		FileOutputStream test = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(test);
		
		
		
		
				

		
		
		
		
		
		
	}

}
