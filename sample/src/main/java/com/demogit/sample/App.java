package com.demogit.sample;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class App 
{
		
		public WebDriver driver;

	  @Test
	  public void openMyBlog() {
		  System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
		  driver = new FirefoxDriver();
		  //driver.get("https://www.softwaretestingmaterial.com/");
		  
		  try {
	            FileInputStream file = new FileInputStream(new File("src/main/resources/Datasheet.xlsx"));
	 
	            // Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            // Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            // Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            while (rowIterator.hasNext()) {
	                Row row = rowIterator.next();
	                // For each row, iterate through all the columns
	                Iterator<Cell> cellIterator = row.cellIterator();
	 
	                while (cellIterator.hasNext()) {
	                    Cell cell = cellIterator.next();
	                    driver.get(cell.getStringCellValue());
	                    
	                }
	                System.out.println("");
	            }
	            file.close();
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		  
		  
	  
	  


    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "learning git starting" );
        
        
        
    }*/
}
