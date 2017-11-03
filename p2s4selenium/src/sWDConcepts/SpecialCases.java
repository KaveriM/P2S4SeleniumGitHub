package sWDConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpecialCases 
{
	WebDriver driver = null;
	
	 public void launchApplication(String sBrowserType,String sURL) 
     {
   	        if(sBrowserType.equals("Chrome"))
   	          { 
   	        	System.setProperty("webdriver.chrome.driver","/Users/kaverikasula/Downloads/chromedriver" ); 
   	            driver = new ChromeDriver();                                                   
                  }
   	        
   	        else if(sBrowserType.equals("Firefox"))
   	          {
   	        	System.setProperty("webdriver.gecko.driver","/Users/kaverikasula/Downloads/geckodriver" );
   		            driver = new FirefoxDriver();
   	          }
   	      
   	        else if(sBrowserType.equals("IE"))
   	         {
   	    	   System.setProperty("webdriver.ie.driver","/Users/kaverikasula/Downloads/iedriver" );
  	               DesiredCapabilities  capabilities = DesiredCapabilities.internetExplorer();
  	              capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
  	               driver = new InternetExplorerDriver(capabilities); 
  	          
   	          }
   	      
   	        else if(sBrowserType.equals("HTMLDriver"))
   	         {
   	        	 driver = new HtmlUnitDriver();
   	         }
   	   driver.get(sURL);
       driver.manage().window().maximize(); 	
     }
     
	
      public void handlingMenus() throws InterruptedException
      {
    	  launchApplication("Chrome","http://www.nasdaq.com/");
    	  Thread.sleep(3000);
    	  
    	  Actions act = new Actions(driver);
    	  act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Quotes')]/ancestor::a")));
    	  //act.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Stock Reports')]")));
    	  act.build();
    	  act.perform();
    	  Thread.sleep(2000);
    	  driver.findElement(By.partialLinkText("Stock Reports")).click();
    	  
      }

     
      public void  getScreenShot(String sFilePath) throws IOException
      {
    	  TakesScreenshot oScn = (TakesScreenshot)driver;
    	  
    	  //osn--->contains Screenshot information
    	  File oSrc =oScn.getScreenshotAs(OutputType.FILE);
    	  
    	  //empty physical file
    	  File oDst = new File(sFilePath);
    	  
    	  //cpoy the osrc file to disc
    	  FileUtils.copyFile(oSrc,oDst);
    	}
      
      
     
      public void captureScreenshot() throws IOException
      {
    	  launchApplication("Chrome","http://www.nasdaq.com/");  
    	  getScreenShot("/Users/kaverikasula/Desktop/Screenshot.rtf");
      }
      
    
      public void handlingAlert() throws InterruptedException
      {
    	  launchApplication("Chrome","http://www.nasdaq.com/symbol/adp/real-time"); 
    	  
    	  if(!driver.findElement(By.id("cookiepref")).isSelected())
    	  {
    		  driver.findElement(By.id("cookiepref")).click();
    	  }
    	  
    	  //unselect
         driver.findElement(By.id("cookiepref")).click();
         
         //get the popup
         //switch the focus to the alert
         Alert alt = driver.switchTo().alert();
         System.out.println(alt.getText());
         Thread.sleep(3000);
         
         //accept 
         alt.accept();
         
         //reject
         //alt.dismiss();
         
      }
      

      public void handlingMultipleBrowsers() throws Exception

      {
    	  launchApplication("Chrome","https://www.cigna.com/"); 
    	 
    	  System.out.println(driver.getTitle());
    	  Thread.sleep(2000);
    	  
    	  //click on Cigna Medicare
    	  driver.findElement(By.linkText("Cigna Medicare")).click();
    	  driver.manage().window().maximize(); 	
    	  Thread.sleep(5000);
    	  
    	  //get parent window/browser id
    	  String sParentId= driver.getWindowHandle();
    	  
    	  //get All window/browser ids
    	 Set<String> sAllBrowserIds = driver.getWindowHandles();
    	 
    	 //switching the focus from main window to child window by excluding sParentid from sAllBrowserids
    	 for(String sEachBrowserId:sAllBrowserIds)
    	 {
    		if(!sEachBrowserId.equals(sParentId)) //excluding Parent browser id
    		{
    			//changing the focus to child browser
    			driver.switchTo().window(sEachBrowserId);
    			break;//exiting the  For-loop
    		}
    	 }
    	 
    	 String sBrowserTitle;
    	 //more than one child switch focus from main window to child window
    	 
    	 for(String sEachBrowserId:sAllBrowserIds)
    	  {
    		 //changing the focus to child browser
    		 driver.switchTo().window(sEachBrowserId);
    		  sBrowserTitle = driver.getTitle();
    		  if(sBrowserTitle.contains("Emirates")) //excluding Parent browser id
    		  {
    			  break; //exiting the  For-loop
    		  }
    	   }	 
    	 
    	  System.out.println(driver.getTitle()); 
    	  Thread.sleep(2000);
    	  driver.findElement(By.linkText("Cigna Medicare Rx (PDP)")).click();
      }

     
      
      @Test
      public void handlingFrames() throws Exception 
      {
    	  launchApplication("Chrome","http://www.proquest.com/about/careers/current-career-opportunities.html"); 
    	 
    	  driver.switchTo().frame(driver.findElement(By.className("careers")));
    	  
    	  Select uiCountry = new Select(driver.findElement(By.id("location")));
    	  uiCountry.deselectAll();
    	  Thread.sleep(2000);
    	  uiCountry.selectByVisibleText("Africa");
    	  Thread.sleep(5000);
    	  uiCountry.selectByVisibleText("Berlin, Germany");
    	  
      }
}
