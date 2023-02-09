package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAMEbyHARI 
{
  public static void main(String[]args) throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
	  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	
    	driver.manage().window().maximize();
		
       WebElement iframe2 = driver.findElement(By.name("SingleFrame"));
        
       driver.switchTo().frame(iframe2);
        
       Thread.sleep(3000);
        
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("SHREE");
	  
      Thread.sleep(3000);
      driver.close();
  
	  
  }
}
