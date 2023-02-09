package Selenium_Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FPracti 
{
   public static void main (String []args) throws InterruptedException, IOException
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	   driver.get("https://www.google.com/");
	   Thread.sleep(5000);
	   driver.navigate().to("https://www.amazon.com/");
	   Thread.sleep(2000);
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File Destination = new File("C:\\Hari Selenium\\Automated ScreenShot\\AmazonSceenshot.jpg");
	   FileHandler.copy(source, Destination);
	   Thread.sleep(2000);
	   WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	   Thread.sleep(2000);
	   searchbox.sendKeys("iphone 14 128 gb");
	   Thread.sleep(2000);
	   searchbox.clear();
	   Thread.sleep(2000);
	   searchbox.sendKeys("iphone 13 128 gb");
	   WebElement searchclick = driver.findElement(By.id("nav-search-submit-button"));
	   searchclick.click();
	   Thread.sleep(4000);
	   Thread.sleep(5000);
       driver.navigate().back();
	   Thread.sleep(4000);
	   driver.navigate().forward();
	   Thread.sleep(2000);
       driver.navigate().refresh();
	   Thread.sleep(2000);
       String url = driver.getCurrentUrl();
       System.out.println(url);
	   Thread.sleep(2000);
	   String title = driver.getTitle();
	   System.out.println(title);
	   Thread.sleep(2000);
	   driver.close();
   }
}
