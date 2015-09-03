package DriverCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownmultilpleselection {
	
	public static void main(String args[])throws InterruptedException
	{
		int size,i;
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		
		Select sel=new Select(d.findElement(By.name("continents")));
		sel.selectByIndex(5);
		//Thread.sleep(1000);
		//sel.selectByVisibleText("Asia");
		
		List<WebElement> w=sel.getOptions();
		size=w.size();
		
		for(i=0;i<size;i++)
		{
			System.out.println(w.get(i).getText());
		}
		
		
		
	}

}
