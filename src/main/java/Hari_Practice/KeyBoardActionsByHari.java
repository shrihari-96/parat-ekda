package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsByHari 
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
		WebElement Listboxdayyy1 = driver.findElement(By.id("day"));
		Actions act = new Actions(driver);
		act.click(Listboxdayyy1).perform();
		Thread.sleep(3000);
		for (int i=0; i<=15; i++);
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(7000);
		driver.close();
		



		

	}

}
