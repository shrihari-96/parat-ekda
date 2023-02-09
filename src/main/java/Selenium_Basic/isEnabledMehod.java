package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMehod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.findElement(By.id("#signIn")).click();
		WebElement getOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		System.out.println(getOTP.isEnabled());
		driver.findElement(By.id("mobileNumber")).sendKeys("9970359310");
		System.out.println(getOTP.isEnabled());
		
	}
}
