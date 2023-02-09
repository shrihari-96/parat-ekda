package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Browser_Opening 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);    // exception part ignore 
		
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
//		Thread.sleep(2000);
//		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.manage().window().minimize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(2000);
//		driver.close();
		driver.quit();
		
		
		
	}

}
