package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling 
{
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		Thread.sleep(3000);
		WebElement ListBoxDay = driver.findElement(By.id("day"));
		WebElement ListBoxMonth = driver.findElement(By.id("month"));
		WebElement ListBoxYear = driver.findElement(By.id("year"));
		
		Thread.sleep(3000);
		Select s= new Select(ListBoxDay);
		
		s.selectByValue("13");
		
		Thread.sleep(3000);
		Select s1= new Select(ListBoxMonth);
		
		s1.selectByVisibleText("Jul");
		
		Thread.sleep(3000);
		Select s2= new Select(ListBoxYear);
		
		s2.selectByIndex(26);
				
		driver.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
 		WebElement MultiListBox = driver.findElement(By.id("cars"));
		
		Select s3= new Select(MultiListBox);
		System.out.println(s3.isMultiple());
		
//		if(s3.isMultiple())
//		{
//		Thread.sleep(1000);
//		s3.selectByIndex(0);
//		Thread.sleep(1000);
//		s3.selectByValue("saab");
//		Thread.sleep(1000);
//		s3.selectByVisibleText("Audi");
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		s3.deselectByIndex(0);
//		Thread.sleep(1000);
//		s3.deselectByValue("saab");
//		Thread.sleep(1000);
//		s3.deselectByVisibleText("Audi");
//		Thread.sleep(1000);
//		
//		Thread.sleep(1000);
//		s3.selectByIndex(0);
//		Thread.sleep(1000);
//		s3.selectByValue("saab");
//		Thread.sleep(1000);
//		s3.selectByVisibleText("Opel");
//		Thread.sleep(1000);
//		s3.deselectAll();
//		}
	}
}
