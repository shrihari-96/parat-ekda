package Hari_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FChildBrowserPopUP {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.guru99.com/popup.php");
      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
      Set<String> windows = driver.getWindowHandles();
      ArrayList<String> AL=new ArrayList(windows);
      String mainwindow = AL.get(0);
     String childwindow = AL.get(1);
     driver.switchTo().window(childwindow);
     Thread.sleep(2000);
      driver.findElement(By.name("emailid")).sendKeys("shri@gmail.com");
      driver.findElement(By.name("btnLogin")).click();
      Thread.sleep(2000);
      driver.quit();
      
	}

}
