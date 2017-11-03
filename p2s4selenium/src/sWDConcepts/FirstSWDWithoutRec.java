package sWDConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class FirstSWDWithoutRec 
{
	
	public void searchItem() throws InterruptedException 
	{
		
		 //open chrome browser
	   	System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	           ChromeDriver  driver = new ChromeDriver();
	           Thread.sleep(500);
	           
	           
	          // Create IE Browser
	           /*
	            * System.setProperty("webdriver.ie.driver","/Users/kaverikasula/Downloads/iedriver" );
	            *DesiredCapabilities  capabilities = DesiredCapabilities.internetExplorer();
	            *capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_SECURITY_DOMAINS,true);
	            *InternetExplorerDriver  driver = new InternetExplorerDriver(capabilities); 
	            */
	           
	           //Create FireFox Driver
	           /*
	           System.setProperty("webdriver.gecko.driver","/Users/kaverikasula/Downloads/geckodriver" );
	           WebDriver  driver = new WebDriverDriver();
	           Thread.sleep(500);
	          */
	           
	           
	           
	           //launch web page
	            driver.get("http://www.ebay.com");
	          
	            //find web elements
	            driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	             Thread.sleep(500);
	             driver.findElement(By.id("gh-btn")).click();
	  }
	
	@Test
	public void searchHTMLUnitDriver() throws InterruptedException
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//launch web page
        driver.get("http://www.ebay.com");
        
        //find Title And Current URL 
        System.out.println(driver.getTitle());
        System.out.println();
        System.out.println(driver.getCurrentUrl());
        System.out.println();
        
        
        //find web elements
        driver.findElement(By.id("gh-ac")).sendKeys("laptop");
         Thread.sleep(500);
         driver.findElement(By.id("gh-btn")).click();
         
         
		
	
	}
}
