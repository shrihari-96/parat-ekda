package Hari_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupByHari
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	    Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
         alert.accept();
		
		
			}

}
