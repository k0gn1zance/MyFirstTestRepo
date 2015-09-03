package listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
 
public class mainclass {
 
	public static void main(String[] args) {
		// TODO Auto-genrated method stub
 
         FirefoxDriver driver = new FirefoxDriver();
         EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
 
		EventHandler h = new EventHandler();
		
		
 
	}
 
}