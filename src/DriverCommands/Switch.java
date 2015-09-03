package DriverCommands;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Switch {
	
	public static void main(String args[])
	{
		WebDriver df=new FirefoxDriver();
		df.get("http://www.quackit.com/javascript/popup_windows.cfm");
		df.findElement(By.xpath("html/body/div[1]/div/article/div[2]/div[2]/div[2]/div/input")).click();
		
		Set<String> handles= df.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String mw=it.next();
		String nw=it.next();
		
		df.switchTo().window(nw);
		df.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//df.get("http://www.facebook.com");
		df.findElement(By.xpath("html/body/div[1]/div/article/p[2]/a")).click();
		
		System.out.println("the end");
		
		
		
		
		//df.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
		
	}

}
