package Selenium_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Options 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions CO= new ChromeOptions();
		
		//CO.addArguments("--headless");//===use for without opening chrome driver
		//CO.addArguments("incognito");//
		// CO.addArguments("--disable-extension");//=======use for the uncontrolled popup=====
		//CO.addArguments("window-size=100*100");//===reduce window size 
          
		
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(CO);
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	 
		
		Thread.sleep(3000);
		driver.close();

	}

}
