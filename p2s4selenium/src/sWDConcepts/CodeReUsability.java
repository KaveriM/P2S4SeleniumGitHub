package sWDConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class CodeReUsability
{
	
	
	
		 WebDriver driver;
	      public void openBrowser(String sBrowserType,String sURL) 
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
	    	}
	      
	      
	      @Test
	      public void searchItemChrome()

	      {
	    	  openBrowser("Chrome","http://www.ebay.com");
	    	  driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	          driver.findElement(By.id("gh-btn")).click();
	      }
	     
	      public void searchItemIE()
	       {
	    	  openBrowser("IE","http://www.ebay.com");
	    	  driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	          driver.findElement(By.id("gh-btn")).click();
	       }
	      
	      public void searchItemFirefox()
	      {
	   	     openBrowser("Firefox","http://www.ebay.com");
	   	     driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	         driver.findElement(By.id("gh-btn")).click();
	      }
	     
	      public void searchItemHTMLUnit()
	      {
	   	     openBrowser("HTMLDriver","http://www.ebay.com");
	   	     driver.findElement(By.id("gh-ac")).sendKeys("laptop");
	         driver.findElement(By.id("gh-btn")).click();
	     }

	}



