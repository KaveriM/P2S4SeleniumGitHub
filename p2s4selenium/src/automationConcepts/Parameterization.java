package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameterization 
{ 
	@Test
	public void searchItem() throws Exception
	{
		
		
	// ExcelRead osearchSht = new ExcelRead("/Users/kaverikasula/Desktop/parameruzation.xls","ebaySearch"); 
	 ExcelRead osearchSht = new ExcelRead("/Users/kaverikasula/Desktop/params.xls","Sheet1");
	String sSearchItem= osearchSht.getCellData("search for",1);
	 
	
	System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
    WebDriver  driver = new ChromeDriver();
    Thread.sleep(500);
    driver.get("http://www.ebay.com");
    
    //find web elements
    driver.findElement(By.id("gh-ac")).clear();
    driver.findElement(By.id("gh-ac")).sendKeys("sSearchItem");
     Thread.sleep(500);
     driver.findElement(By.id("gh-btn")).click();
}
}
