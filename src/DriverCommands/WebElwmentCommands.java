package DriverCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElwmentCommands {
	public static void main(String args[])
	{
		
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("http://www.facebook.com");
		d.get("http://www.gmail.com");
		d.navigate().to("http://www.yahoo.com");
		
		
		Navigation n=d.navigate();
	    n.to("http://www.paytm.com");
		
		
	}

}
