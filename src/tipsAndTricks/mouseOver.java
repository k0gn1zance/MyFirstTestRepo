package tipsAndTricks;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver{

public static WebDriver driver;

public static void main(String[] args) {

 driver = new FirefoxDriver();

 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 driver.get("http://www.snapdeal.com");
 driver.manage().window().maximize();

 

 Actions action = new Actions(driver);

 action.moveToElement(driver.findElement(By.xpath(".//*[@id='leftNavNemu']/div/div[1]/ul/li[3]/a/span[1]"))).build().perform();
 action.moveToElement(driver.findElement(By.xpath(".//*[@id='leftNavNemu']/div/div[1]/ul/li[3]/div/ul/li[3]/a/span[1]"))).build().perform();
 

 driver.findElement(By.xpath(".//*[@id='leftNavNemu']/div/div[1]/ul/li[3]/div/ul/li[3]/div/div/ul/li/div[1]/div/form/div[1]/p[5]/a")).click();

 }

}