package com.EXCELPRACTICE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedForLoop3_capturing_webtablee_data {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\trainings\\selenium automation\\work space\\java project\\BrowserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("launch the browser");
		
		driver.get("https://www.google.co.in/");
		System.out.println("opens the google");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://webdatacommons.org/webtables/");
		System.out.println("opens the application");
		
		FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet page=book.getSheet("data_2");
		
		
		
		By webtableproperty=By.xpath("//*[@id=\"toccontent\"]/table[2]/tbody");
		WebElement webtable=driver.findElement(webtableproperty);
		
		
		By rowsproperty=By.tagName("tr");
		List<WebElement> rows=webtable.findElements(rowsproperty);
		    int   countofrow=  rows.size();
		    
		    System.out.println("this is the count of row "+countofrow);
		    
		    for (int i = 0; i < countofrow; i++) {
		    	
		   WebElement	row=rows.get(i);
		   
		   
		   By cellproperty=By.tagName("td");
		   List<WebElement> cell=row.findElements(cellproperty);
		   int countofcell=cell.size();
			Row rown=page.createRow(i);
		  
		   for (int j = 0; j < countofcell; j++) {
			WebElement celldata= cell.get(j);
			
			String data=celldata.getText();
			System.out.print(j+":-"+data+"|");
			
			Cell celln=rown.createCell(j);
			celln.setCellValue(data);
			
			
		
			
			   
			
		}
		   System.out.println();
		}
		    
		    By webtable_2property=By.xpath("//*[@id=\"toccontent\"]/table[3]/tbody");
		   WebElement webtable_2=driver.findElement(webtable_2property);
		   
		   By rows2ofproperty=By.tagName("tr");
		   List<WebElement> rows2=webtable_2.findElements(rows2ofproperty);
		   int count0frows2=rows2.size();
		   
		   for (int ind = 0; ind < count0frows2; ind++) {
			   
			   Row rown2=page.createRow(ind);
			 WebElement rowss = rows2.get(ind);
			 
			 By cellS2property=By.tagName("td");
			 List<WebElement> cells2=rowss.findElements(cellS2property);
			 
		int	countofcellls2= cells2.size();
			 
			 
			 
			 
			 for (int index = 0; index < countofcellls2; index++) {
				 WebElement cellsname=cells2.get(index);
				 
	      String data2=cellsname.getText();
	      System.out.println(index+":-"+data2+"|");
	      
	      Cell celln2=rown2.createCell(index);
	      celln2.setCellValue(data2);
	      
	      
	      
	      
	      
	      
	      FileOutputStream test=new FileOutputStream("C:\\Users\\Hp\\Desktop\\TestDataFamily.xlsx");
			book.write(test);
			
			
		
				
			}
			System.out.println();
			 
			
		}
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		      System.out.println("completes the actions");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		System.out.println("close the driver");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
