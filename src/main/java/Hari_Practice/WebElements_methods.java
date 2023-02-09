package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_methods
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("Shree");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
        Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Shree");

		Thread.sleep(5000);
		driver.close();
		

	}

}
