package com.demogit.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class App 
{
		
		public WebDriver driver;

	  @Test
	  public void openMyBlog() {
		  System.setProperty("webdriver.gecko.driver", "D:/Drivers/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.softwaretestingmaterial.com/");
	  }
	  


    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "learning git starting" );
        
        
        
    }*/
}
