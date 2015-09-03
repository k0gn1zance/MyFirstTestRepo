package DriverCommands;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String args[])throws InterruptedException
	{
		WebDriver d=new FirefoxDriver();
		
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.facebook.com");
		
		
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getCurrentUrl().length());
		System.out.println(d.getPageSource());
		System.out.println(d.getPageSource().length());
		
		WebElement w= d.findElement(By.xpath(".//*[@id='email']"));
		
		w.clear();
		
		w.sendKeys("pegasus.devil");
		
		d.navigate().refresh();
		
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		
		
		//d.close();
		
		
		
	}
}
