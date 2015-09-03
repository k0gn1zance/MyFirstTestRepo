package abhisheksir;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

public class grid
{
   public WebDriver driver;
   public String URL, Node;
   protected ThreadLocal<RemoteWebDriver> threadDriver = null;
   
   
   @BeforeTest
   public void launchapp() throws MalformedURLException
   {
	   System.setProperty("webdriver.chrome.driver", "C:/Users/harshit.chauhan/Desktop/selenium/crome driver/chromedriver.exe");
	   String browser="chrome";
      String URL = "http://www.calculator.net";
      
      if (browser.equalsIgnoreCase("firefox"))
      {
         System.out.println(" Executing on FireFox with chrome");
         String Node = "http://localhost:4444/wd/hub";
         DesiredCapabilities cap = DesiredCapabilities.firefox();
         cap.setBrowserName("firefox");
         
         driver = new RemoteWebDriver(new URL(Node), cap);
         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else if (browser.equalsIgnoreCase("chrome"))
      {
         System.out.println(" Executing on CHROME");
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         String Node = "http://localhost:4444/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else if (browser.equalsIgnoreCase("ie"))
      {
         System.out.println(" Executing on IE");
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("ie");
         String Node = "http://localhost:4444/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else
      {
         throw new IllegalArgumentException("The Browser Type is Undefined");
      }
   }
   
   @Test
   public void calculatepercent()
   {
      
	   System.out.println("in test");
   }
   
   @AfterTest
   public void closeBrowser()
   {
	   System.out.println("in aftertest");
   }
}