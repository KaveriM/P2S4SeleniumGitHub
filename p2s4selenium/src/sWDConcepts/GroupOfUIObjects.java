package sWDConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupOfUIObjects 
{
	
	public void groupOfUIObjects() throws InterruptedException
	{
	//open chrome browser
	   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	   ChromeDriver  driver = new ChromeDriver();
	   Thread.sleep(500);
	   
	   driver.get("https://www.redflagdeals.com/");
	   
	   List<WebElement>  uigroupofobj = driver.findElements(By.xpath("//h4[@type='checkbox']/a"));
	   
	   int totaluigroupofobj = uigroupofobj.size();
	   
	   System.out.println("total no of deals  :"  +totaluigroupofobj);
	   for(int i = 0 ; i<totaluigroupofobj ;i++)
	   {
		   System.out.println(uigroupofobj.get(i).getText());
		   System.out.println();
	   }
	   
	 }
	

	public void groupOfUIObjectsForEachLoop() throws InterruptedException
	{
	//open chrome browser
	   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	   ChromeDriver  driver = new ChromeDriver();
	   Thread.sleep(500);
	   
	   driver.get("https://www.redflagdeals.com/");
	   
	   List<WebElement>  uigroupofobj = driver.findElements(By.xpath("//h4[@class='block__title']/a"));
	   
	   //int totaluigroupofobj = uigroupofobj.size();
	   
	   //System.out.println("total no of deals  :"  +totaluigroupofobj);
	   
	   for(WebElement uiEachDeal:uigroupofobj)
	   {
		   System.out.println(uiEachDeal.getText());
		   System.out.println();
	   }
	   
	}


	public void groupOfUIObjectsWriteIntoNotepad() throws InterruptedException, FileNotFoundException
	{
	
		//open chrome browser
		   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
		   ChromeDriver  driver = new ChromeDriver();
		   Thread.sleep(500);
		   
		   driver.get("https://www.redflagdeals.com/");
		   
		   List<WebElement>  uigroupofobj = driver.findElements(By.xpath("//h4[@class='block__title']/a"));
		   
		   //Create File
		   File  oFile = new File("/Users/kaverikasula/Desktop/2.rtf");
		   
		   //Write
		   PrintWriter pWriter = new PrintWriter(oFile);
		   
		  
		   for(WebElement uiEachDeal:uigroupofobj)
		   {
			  // System.out.println(uiEachDeal.getText());
			   System.out.println();
			   pWriter.println(uiEachDeal.getText());
		   }
	    
		   //Save
		   pWriter.flush();
		   
		   //Close
		   pWriter.close();
    }


	@Test
	public void handleAllCheckboes() throws InterruptedException
	{
	
		//open chrome browser
		   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
		   ChromeDriver  driver = new ChromeDriver();
		   Thread.sleep(500);
		   
		   driver.get("https://www.ebay.com/sch/ebayadvsearch");
		   List<WebElement>  list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		   //Thread.sleep(3000);
		    
		    int checkBox =list.size();
		    
		    System.out.println("Total no of checkboxes"  +checkBox);
		  
		   for(int i=0;i<checkBox;i++)
		   {
			   if(!(list.get(i).isSelected()))
			   {
			    list.get(i).click();   
			   }
		   }
		   
		   
	}
		   
}
