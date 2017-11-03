package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Verifications
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

  @Test
 public void ExVerifications()
 {
	 launchApplication("Chrome","http://www.deal4loans.com/Contents_Calculators.php");
	 
	 try
	 { 
		 if( driver.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed())
		 System.out.println("pass,EMI Calculator page is isDisplayed ");
	 }
	 catch(Exception e)
	 {
		 System.out.println("fail,EMI Calculator page  not is isDisplayed ");
	 }
	 
	
	  driver.findElement(By.id("Loan_Amount")).clear();
	  driver.findElement(By.id("Loan_Amount")).sendKeys("5000");
	  driver.findElement(By.name("rate")).clear();
	    
	  
	  
	  String sExpectedText ="Five Thousand";
	  String sActualLAText = driver.findElement(By.id("wordloanAmount")).getText();
	  
	  sExpectedText = sExpectedText.toLowerCase();
	  sActualLAText = sActualLAText.toLowerCase();
	  
	  
	  if(sActualLAText.contains(sExpectedText))
	  {
		  System.out.println("pass,loan amount text is displyed as expected");
	  }
	  else
	  {
		 
              System.out.println("fail,loan amount text is not displyed as expected");
                    }
	  
	  
	
	  driver.findElement(By.name("rate")).clear();
	  driver.findElement(By.name("rate")).sendKeys("5");
	    
	  driver.findElement(By.name("months")).clear();
	  driver.findElement(By.name("months")).sendKeys("20");
	    
	  driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	  String  sExpectedEMI = "261.08";
       
	  String  sActualEMI = driver.findElement(By.name("pay")).getAttribute("value");

      if(sExpectedEMI.contains(sActualEMI))
      {
    	  System.out.println("pass,EMI Calculator is displyed as expected");   

      }

      else
      {

         System.out.println("fail ,EMI Calculator is  not displyed as expected");
      }
	
 }
}
