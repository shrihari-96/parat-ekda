package Hari_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelementmethodpractice 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(500);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File distination = new File("C:\\Hari Selenium\\AutomatedScreenshotbyhari\\flipkartScreenshotbyhari.jpg");
        FileHandler.copy(source,distination);
		driver.close();
	}

}
