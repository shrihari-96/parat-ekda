package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		Thread.sleep(2000);
		
		Actions Act = new Actions(driver);
		WebElement ListBoxDay =  driver.findElement(By.id("day"));
		Act.click(ListBoxDay).perform();
		Thread.sleep(2000);

		
		for (int i=0; i<=10; i++)
		{
		Thread.sleep(500);
		Act.sendKeys(Keys.ARROW_UP).perform();
		//Act.sendKeys(Keys.ARROW_DOWN).perform();
		//Act.sendKeys(Keys.ARROW_LEFT).perform();
		}
		
		Thread.sleep(7000);
		driver.close();
//		Act.sendKeys(Keys.ALT).build().perform();
//		Act.sendKeys(Keys.F4).perform();
	}

}
