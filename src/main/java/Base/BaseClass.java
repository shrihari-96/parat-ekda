package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	
	public static void browserLaunch(String browser, String URL)
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Hari Selenium\\Softwares\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.get(URL);
	}
}
