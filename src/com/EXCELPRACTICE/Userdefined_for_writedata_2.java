package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Userdefined_for_writedata_2 {
	public void manual() throws IOException {
		FileInputStream address = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook bookname = new XSSFWorkbook(address);

		XSSFSheet page = bookname.createSheet("testing topics");
		Row row = page.createRow(0);

		Cell cell = row.createCell(1);
		cell.setCellValue("manual testing");

		Cell cell1 = row.createCell(2);
		cell1.setCellValue("retesting");

		Cell cell2 = row.createCell(3);
		cell2.setCellValue("regression");

		Cell cell3 = row.createCell(4);
		cell3.setCellValue("smoke test");

		Cell cell4 = row.createCell(5);
		cell4.setCellValue("this are the topics");

		FileOutputStream testout = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		bookname.write(testout);
		System.out.println(cell);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);

	}

	public void automation() throws IOException {
		FileInputStream pathoffile = new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook bookname = new XSSFWorkbook(pathoffile);
		XSSFSheet page = bookname.getSheet("testing topics");

		Row row = page.createRow(1);

		Cell cell1 = row.createCell(0);
		cell1.setCellValue("Automation");

		Cell cell2 = row.createCell(1);
		cell2.setCellValue("launching the web browsers");

		Cell cell3 = row.createCell(2);
		cell3.setCellValue("validating the links");

		Cell cell4 = row.createCell(3);
		cell4.setCellValue("validating the links");

		Cell cell5 = row.createCell(4);
		cell5.setCellValue("Taking the screenshots");

		FileOutputStream testout = new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		bookname.write(testout);

		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);

	}

	public static void main(String[] args) throws IOException {
		Userdefined_for_writedata_2 write = new Userdefined_for_writedata_2();
		write.manual();
		write.automation();

	}

}
