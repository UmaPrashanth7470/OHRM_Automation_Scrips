package com.EXCELPRACTICE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_excel_part4 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream address_of_workbook=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook bookoftesting  = new XSSFWorkbook(address_of_workbook);
		XSSFSheet  nameofpage=bookoftesting.getSheet("testdata2");
		
		Row  test_row_1=nameofpage.getRow(14);
		Cell test_cell_1=test_row_1.getCell(0);
		
		Row  test_row_2=nameofpage.getRow(13);
		Cell test_cell_2=test_row_2.getCell(3);
		
		Row  test_row_3=nameofpage.getRow(12);
		Cell test_cell_3=test_row_3.getCell(6);
		
		Row  test_row_4=nameofpage.getRow(10);
		Cell test_cell_4=test_row_4.getCell(5);
		
		Row  test_row_5=nameofpage.getRow(8);
		Cell test_cell_5=test_row_5.getCell(2);
		
		Row  test_row_6=nameofpage.getRow(7);
		Cell test_cell_6=test_row_6.getCell(1);
		
		Row  test_row_7=nameofpage.getRow(6);
		Cell test_cell_7=test_row_7.getCell(5);
		
		Row  test_row_8=nameofpage.getRow(5);
		Cell test_cell_8=test_row_8.getCell(3);
		
		Row  test_row_9=nameofpage.getRow(1);
		Cell test_cell_9=test_row_9.getCell(5);
		
		Row  test_row_10=nameofpage.getRow(1);
		Cell test_cell_10=test_row_10.getCell(2);
		
		Row  test_row_11=nameofpage.getRow(0);
		Cell test_cell_11=test_row_11.getCell(0);
		
		
		String T_C_1=test_cell_1.getStringCellValue();
		
		String T_C_2=test_cell_2.getStringCellValue();
		
		String T_C_3=test_cell_3.getStringCellValue();
		
		String T_C_4=test_cell_4.getStringCellValue();
		
		String T_C_5=test_cell_5.getStringCellValue();
		
		String T_C_6=test_cell_6.getStringCellValue();
		
		String T_C_7=test_cell_7.getStringCellValue();
		
		String T_C_8=test_cell_8.getStringCellValue();
		
		String T_C_9=test_cell_9.getStringCellValue();
		
		String T_C_10=test_cell_10.getStringCellValue();
		
		String T_C_11=test_cell_11.getStringCellValue();
		
		System.out.println("the cell of data is:-"+T_C_1);
		System.out.println("the cell of data is:-"+T_C_2);
		System.out.println("the cell of data is:-"+T_C_3);
		System.out.println("the cell of data is:-"+T_C_4);
		System.out.println("the cell of data is:-"+T_C_5);
		System.out.println("the cell of data is:-"+T_C_6);
		System.out.println("the cell of data is:-"+T_C_7);
		System.out.println("the cell of data is:-"+T_C_8);
		System.out.println("the cell of data is:-"+T_C_9);
		System.out.println("the cell of data is:-"+T_C_10);
		System.out.println("the cell of data is:-"+T_C_11);
		System.out.println("the cell of data is:-"+T_C_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
