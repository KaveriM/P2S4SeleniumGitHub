package sWDConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDiffObjects
{
	
	 public void handleLink() throws InterruptedException 
	 {
		//open chrome browser
	   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	   ChromeDriver  driver = new ChromeDriver();
	   Thread.sleep(500);
	
	   // launch webpage
	   driver.get("http://www.ebay.com");
	   Thread.sleep(500);
	
	   
	   //find web element for Link
	    WebElement element = driver.findElement(By.linkText("Sign in"));
	   element.click();
	   
	 //OR
	   // driver.findElement(By.linkText("Sign in")).click();
	   
       // driver.findElement(By.linkText("https://ir.ebaystatic.com/rs/v/fxxj3ttftm5ltcqnto1o4baovyl.png")).click();
     }
	 
	
	 public void handleCheckbox() throws InterruptedException
	   
	   {
		 //open chrome browser
		   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
		   ChromeDriver  driver = new ChromeDriver();
		   Thread.sleep(500);
		
		   // launch webpage
		   driver.get("http://www.ebay.com");
		   Thread.sleep(500);
		
		   
		 //checkbox
	    driver.findElement(By.linkText("Advanced")).click();
	
	    
	    /*if(driver.findElement(By.name("LH_TitleDesc")).isSelected())
	    {
	    	//dont do anything
	    }
	    else
	    {
	   driver.findElement(By.name("LH_TitleDesc")).click();
	    }*/
	    
	    
	    if(!driver.findElement(By.name("LH_TitleDesc")).isSelected())
	    {
	    	driver.findElement(By.name("LH_TitleDesc")).click();
	    }
	   
	   }
	 

     public void handleRadiobutton() throws InterruptedException
	   
	   {
		 //open chrome browser
		   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
		   ChromeDriver  driver = new ChromeDriver();
		   Thread.sleep(500);
		
		   // launch webpage
		   
		   driver.get("https://www.southwest.com/");
		   Thread.sleep(500);
		   
		   String option = "Oneway";
		
		 if(option.equals("RoundTrip"))
	    {
			driver.findElement(By.id("trip-type-round-trip")).click();
	    }
		 else
		 {
			 driver.findElement(By.id("trip-type-one-way")).click();
		 }
	   
	   }
	 
	 
	 public void handleDropdown() throws InterruptedException
	   
	   {
		 //open chrome browser
		   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
		   ChromeDriver  driver = new ChromeDriver();
		   Thread.sleep(500);
		
		   // launch webpage
		   driver.get("https://www.ebay.com/");
		   Thread.sleep(500);
		   
		   // Select from DROPDOWN
	       WebElement uiCategoryObj = driver.findElement(By.id("gh-cat"));
	       Select  uiCategory = new Select (uiCategoryObj);
	       
	       //OR
		  // Select  uiCategory = new Select(driver.findElement(By.id("gh-cat")));
	       
	       uiCategory.selectByVisibleText("Books");
	       Thread.sleep(500);
	       
	       uiCategory.selectByIndex(2);
	       Thread.sleep(500);
	       
	       uiCategory.selectByValue("11232");
	       Thread.sleep(500);
	       
	       System.out.print(uiCategory.getOptions().size());
	   
    }	 


public void handleComplexXpath() throws InterruptedException
  
  {
	 //open chrome browser
	   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	   ChromeDriver  driver = new ChromeDriver();
	   Thread.sleep(500);
	   
	   driver.get("http:ebay.com/");
	   Thread.sleep(500);
	   
	   //driver.findElement(By.id("gh-ac")).clear();
	   driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	   
	   driver.findElement(By.xpath("//input[@value='Search']")).click();
  }

@Test
public void handleTableComplexXpath() throws InterruptedException
  
  {
	 //open chrome browser
	   System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" );
	   ChromeDriver  driver = new ChromeDriver();
	   Thread.sleep(500);
	   
	   driver.get("http://www.nasdaq.com/");
	   Thread.sleep(500);
	   
	   String str = "Destination Maternity";
	  System.out.println(driver.findElement(By.xpath("//a[contains(.,'" +str+ "')]/ancestor::td/following-sibling::td[3]")).getText());
  }

}  
      
      
      
      
      
      
      