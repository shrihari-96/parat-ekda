package Selenium_Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Hari Selenium\\Automated ScreenShot\\fbScreenshot.jpg");
		
		FileHandler.copy(source, destination);
		
		
		
		/////////////////////////////////////////////////////////////////////////////////
		////////////////////    MULTIPLE SCREENSHOT   ///////////////////////////////////
		
		File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String xyz = RandomString.make(2);
		
		File destination2 = new File("C:\\Hari Selenium\\Automated ScreenShot\\fbScreenshot_"+xyz+".jpg");
		
		FileHandler.copy(source2, destination2);
		
		
		
	}

}
