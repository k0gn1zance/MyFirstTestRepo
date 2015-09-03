package DriverCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHandle {
	public static void main(String args[])throws InterruptedException
	{
		int sizei,sizej,i=0,j=0;
		List<WebElement> wi=null;
		List<WebElement> wj=null;
		
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.toolsqa.com/automation-practice-table");
		d.manage().window().maximize();
		
		//d.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]"));
		 wi=d.findElements(By.xpath(".//*[@id='content']/table/thead/tr"));
		sizei=wi.size();
		System.out.println(sizei);
		
		for(i=1;i<sizei;i++)
		{
			//wj.clear();
			wj=wi.get(i).findElements(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/th"));
			sizej=wj.size();
			System.out.println(sizej);
			
			for(j=1;j<sizej;j++)
			{
				System.out.println(wj.get(j).getText());
			}
		
			
		}
		
	}
	
		

}
