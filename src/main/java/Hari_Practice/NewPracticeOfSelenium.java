package Hari_Practice;

import java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class NewPracticeOfSelenium
{

	public static void main(String[] args)
	{
    System.setProperty("Webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("Facebook.com");
	driver.manage().window().maximize();
	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}

}
