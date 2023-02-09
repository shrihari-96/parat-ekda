package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Position 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Dimension D= new Dimension(300, 500);
		
		driver.manage().window().setSize(D);
		
		System.out.println(driver.manage().window().getSize());
		
		
		Thread.sleep(3000);
		
		Point P= new Point(650, 600);
		driver.manage().window().setPosition(P);
		System.out.println(driver.manage().window().getPosition());
	}
}
