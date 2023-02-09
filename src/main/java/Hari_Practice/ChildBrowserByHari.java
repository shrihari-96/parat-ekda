package Hari_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserByHari
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		Thread.sleep(3000);
		Set<String> window11 = driver.getWindowHandles();
		ArrayList<String> Als = new ArrayList<String>(window11);
		String mainwindow = Als.get(0);
		String subwindow = Als.get(1);
	//	driver.switchTo().window.(subwindow);
	//	driver.switchTo().window(subwindow);

        driver.switchTo().window(subwindow);
	 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Shree@gmail.com");
		Thread.sleep(3000);

		
		//driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		driver.close();
        driver.switchTo().window(mainwindow);

		driver.close();
		
	}

}
