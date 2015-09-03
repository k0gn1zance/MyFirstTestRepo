package DriverCommands;


import java.util.List;
import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class checkBoxRadiobutton {
	
	public static void main(String args[])
	{
		int size,i;
		WebDriver d=new FirefoxDriver();
		d.get("http://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> w=d.findElements(By.name("exp"));
		
		size=w.size();
		
		for(i=0;i<size;i++)
		{
			if(w.get(i).getAttribute("value").equalsIgnoreCase("4"))
			{
				w.get(i).click();
			}
		}
		
		w.clear();
		w=d.findElements(By.xpath(".//*[@id='continents']/option"));
		size=w.size();
		
		for(i=1;i<=size;i++)
		{
			WebElement wb=d.findElement(By.xpath(".//*[@id='continents']/option["+i+"]"));
			System.out.println(wb.getText());
			if(wb.getText().equalsIgnoreCase("Asia"))
			{
				wb.click();
			}
		}
		
	}

}
