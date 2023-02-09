package Hari_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractice1ByHari 
{
   public static void main (String []args) throws InterruptedException, IOException 
   {
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
	Thread.sleep(2000);
	WebDriver driver = new ChromeDriver();

	//WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	File sources = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destinations = new File("C:\\Hari Selenium\\Automated ScreenShot\\amazonScreenshot.jpg");
	FileHandler.copy(sources, destinations);
    driver.close();
   }
}
