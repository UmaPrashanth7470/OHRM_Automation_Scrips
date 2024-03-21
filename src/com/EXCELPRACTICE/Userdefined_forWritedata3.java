package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Userdefined_forWritedata3 {
	public void subjects() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.createSheet("Marks Sheet");
		Row row0=page.createRow(0);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("     ");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Subjects");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("Telugu");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("English");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("Maths");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("science");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("Social");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	
	}
	public void student_1() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(1);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Uma prashanth");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("92");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("94");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("79");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("84");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_2() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(2);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Vikesh");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("99");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("99");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("99");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("99");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("96");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		

		
		
		
		
		
	}
	public void student_3() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(3);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Venkatesh Thota");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("80");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("70");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("69");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	
	
	}
	public void student_4() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(4);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Ravi Kumar");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("70");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("40");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("50");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("59");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
		
	}
	public void Student_5() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(5);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Praveena");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("75a");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("70");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("78");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("79");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_6() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(6);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Vennala");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("80");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("70");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("89");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_7() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(7);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Pooja");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("60");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("62");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("72");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("64");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("69");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_8() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(8);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Lakshmi");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("80");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("70");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("79");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_9() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(9);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Naga Lakshmi");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("80");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("70");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("60");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("59");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	

		
	}
	public void student_10() throws IOException {
		FileInputStream path=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(path);
		
		XSSFSheet page=book.getSheet("Marks Sheet");
		Row row0=page.createRow(10);
		Cell cell0=row0.createCell(0);
		cell0.setCellValue("Students Name");
		
		Cell cell1=row0.createCell(1);
		cell1.setCellValue("Venkata lakshmi");
		
		Cell cell2=row0.createCell(2);
		cell2.setCellValue("90");
		
		Cell cell3=row0.createCell(3);
		cell3.setCellValue("80");
		
		Cell cell4=row0.createCell(4);
		cell4.setCellValue("60");
		
		Cell cell5=row0.createCell(5);
		cell5.setCellValue("70");
		
		Cell cell6=row0.createCell(6);
		cell6.setCellValue("89");
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		System.out.println(cell0);
		System.out.println(cell1);
		System.out.println(cell2);
		System.out.println(cell3);
		System.out.println(cell4);
		System.out.println(cell5);
		System.out.println(cell6);	
		System.out.println("completes all");

		
	}
	public static void main(String[] args) throws IOException {
		Userdefined_forWritedata3 note=new Userdefined_forWritedata3();
		note.subjects();
		note.student_1();
		note.student_2();
		note.student_3();
		note.student_4();
		note.Student_5();
		note.student_6();
		note.student_7();
		note.student_8();
		note.student_9();
		note.student_10();
		
	}

	
	}
