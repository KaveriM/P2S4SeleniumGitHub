package sWDConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brosermethods
{
	@Test
	public void searchItem() throws InterruptedException 
	{
		
		 //open chrome browser
	   	System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	           ChromeDriver  driver = new ChromeDriver();
	           Thread.sleep(500);
	           
	           //launch webpage
	            driver.navigate().to("http://www.ebay.com");
	            
	            //maximise the Broser
	             driver.manage().window().maximize();
	          
	            //Title of webpage
	            System.out.println(driver.getTitle());
	            System.out.println();
	            
	            //find web elements
	             driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	             Thread.sleep(500);
	             driver.findElement(By.id("gh-btn")).click();
	             driver.navigate().back();
	             driver.navigate().forward();
	            
	             //get current URl
	             System.out.println(driver.getCurrentUrl());
	             System.out.println();
	             
	             //get PageSource
	             System.out.println(driver.getPageSource());
	             
	            driver.close();
	             
	   }
}
