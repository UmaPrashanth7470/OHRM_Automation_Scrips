package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.draw.geom.SinArcTanExpression;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;

public class CapturingSingleCellData extends BaseTest {
	
	public void FetchingWebTableDataGettingSingleCellValue() {
		By cityNameDataproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[9]/td[5]/a");
		WebElement cityNameData= driver.findElement(cityNameDataproperty);
		
		String cityName = cityNameData.getText();
		System.out.println(cityName);
	}
	
	public void gettingFirstColumnData() throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook  book=new XSSFWorkbook(file);
		
		XSSFSheet page=book.getSheet("Data_1");
		
		
		
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		
		
		String xpath1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	
		
		
			String xpath2 = "]/td[1]";
		
		
		
		for (int index = 1; index <= 36; index++) {
			
			
			WebElement entireColmnData= driver.findElement(By.xpath(xpath1+index+xpath2));
			String firstColumncityNames = entireColmnData.getText();
			System.out.println(index+" - "+firstColumncityNames);
			Row row=page.createRow(index);
			Cell cell=row.createCell(index);
			cell.setCellValue(firstColumncityNames);
			
			FileOutputStream outputfile=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			book.write(outputfile);
		}
		
		
		
		
	}
	
	public void second_column_data() throws IOException {
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		
		
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[2]
	//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[2]	
		
		String xString_1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xstring_2="]/td[2]";
		
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook  book =new XSSFWorkbook(file);
		XSSFSheet     page=book.getSheet("Data_1");
		
		for (int i = 1; i < 36; i++) {
			
			
			WebElement secondcellpeoperty=driver.findElement(By.xpath(xString_1+i+xstring_2));
		String	secondcellnames= secondcellpeoperty.getText();
		System.out.println(i+"-"+secondcellnames);	
		
		Row row=page.createRow(i);
		Cell cell=row.createCell(i);
		cell.setCellValue(secondcellnames);
		
		FileOutputStream testout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		book.write(testout);
		
				
			
		}
					
	}
	public void third_column_data() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet  page=book.getSheet("Data_1");
		
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[3]/a
		
		
		String xpath1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpath2="]/td[3]/a";
		
		
		
		System.out.println("third column property");
		for (int i = 1; i <36; i++) {
			
			WebElement third_coloumnproperty=driver.findElement(By.xpath(xpath1+i+xpath2));
			String third_column=third_coloumnproperty.getText();
			System.out.println(i+"-"+third_column);
			
			Row row=page.createRow(i);
			Cell cell=row.createCell(i);
			cell.setCellValue(third_column);
			
			
			FileOutputStream testwrite=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			book.write(testwrite);
			
			
		}	
	}
	public void fourth_column() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet  page=book.getSheet("Data_1");
		
		
		
		
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[4]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[4]
	
		System.out.println("4th column names");
		
		String fullxpath1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String fullxpath2="]/td[4]";
		
		for (int i = 1; i <=36; i++) {
			
			WebElement fourthcolumnnamesproperty=driver.findElement(By.xpath(fullxpath1+i+fullxpath2));
			String fourth_column_names=fourthcolumnnamesproperty.getText();
			System.out.println(i+"-"+fourth_column_names);
			
			Row row=page.createRow(i);
			Cell cell=row.createCell(i);
			cell.setCellValue(fourth_column_names);
			

			
			FileOutputStream testwrite=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			book.write(testwrite);
			
			
		}
			
	}
	
	public void fifth_column() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet  page=book.getSheet("Data_1");
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[5]/a
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[5]
		System.out.println("fifth-column");
		String fullofxpath1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String fullofxpath2="]/td[5]/a";
		
		
		for (int index = 1; index <36; index++) {
			
			
			WebElement fifth_column_property=driver.findElement(By.xpath(fullofxpath1+index+fullofxpath2));
			String fifthcolumnames=fifth_column_property.getText();
			System.out.println(index+"-"+fifthcolumnames);
			Row row=page.createRow(index);
			Cell cell=row.createCell(7);
			cell.setCellValue(fifthcolumnames);
			

			
			FileOutputStream testwrite=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			book.write(testwrite);
			
			
			
		}
		
	}
//	public void sevent_column() throws IOException {
//		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
//		XSSFWorkbook book=new XSSFWorkbook(file);
//		XSSFSheet  page=book.getSheet("Data_1");
//		
//		
//		
//		
//		System.out.println("seventh column ");
//		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]/a
//		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
//		
//		String s1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
//		String s2="]/td[7]/a";
//		
//		for (int ind = 1; ind<36; ind++) {
//						
//			WebElement seventh_column_property=driver.findElement(By.xpath(s1+ind+s2));
//			String seventh_column_names=seventh_column_property.getText();
//			System.out.println(ind+"-"+seventh_column_names);
//			
//			Row row=page.createRow(ind);
//			Cell cell=row.createCell(8);
//			cell.setCellValue(seventh_column_names);
//			
//			FileOutputStream testwrite=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
//			book.write(testwrite);
//			
//			
//		}
//		
//		System.out.println("completes the caputes of all cityu names");
//	}
	
	
	public static void main(String[] args) throws IOException {
		CapturingSingleCellData sigleCellData = new CapturingSingleCellData();
		sigleCellData.applicationLaunch();
		sigleCellData.gettingFirstColumnData();
		sigleCellData.second_column_data();
		sigleCellData.third_column_data();
		sigleCellData.fourth_column();
		sigleCellData.fifth_column();
		//sigleCellData.sevent_column();
		sigleCellData.applicationClose();
	}

	

}
