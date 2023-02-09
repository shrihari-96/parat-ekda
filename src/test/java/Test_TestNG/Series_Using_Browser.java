package Test_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Series_Using_Browser 
{
 @Test
 public void Browser() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://freecrm.com/");
	 
	 Thread.sleep(4000);
	 driver.findElement(By.linkText("Login")).click();
 }
}
