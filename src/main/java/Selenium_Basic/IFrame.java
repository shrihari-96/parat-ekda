package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html ");
		driver.manage().window().maximize();
		
		WebElement iframeWindow = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(iframeWindow);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hari");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
