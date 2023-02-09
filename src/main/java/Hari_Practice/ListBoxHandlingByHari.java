package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandlingByHari
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
    	Thread.sleep(3000);
      driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
      Thread.sleep(3000);
      WebElement ListBoxDay=driver.findElement(By.id("day"));
      WebElement ListBoxMonth=driver.findElement(By.id("month"));
      WebElement ListBoxYear = driver.findElement(By.id("year"));
      
      Thread.sleep(3000);
      
      Select S = new Select(ListBoxDay);
      S.selectByValue("5");
      
      Thread.sleep(3000);
      
      Select S1 = new Select(ListBoxMonth);
      S1.selectByVisibleText("Jan");
      
      Select S2 = new Select(ListBoxYear);
      S2.selectByIndex(14);

      

    //  s.selectByIndex(9);

      
      

      


	}

}
