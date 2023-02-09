                                     package Selenium_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class 
{
 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions Act = new Actions(driver);
		
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Act.contextClick(RightClick);         //simple method of right click
		
		WebElement DeleteClick = driver.findElement(By.xpath("//span[text()='Delete']"));
//		
//		Act.moveToElement(DeleteClick).build().perform();   //old method of click
//		Act.click().perform();
		
		Act.click(DeleteClick).perform();              ///simple method of click
		
		Alert alt= driver.switchTo().alert();
		alt.accept();
		
		WebElement dblclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));   //simple method of double click
		
		Act.doubleClick(dblclick).perform();
		
		
		Thread.sleep(7000);
		driver.close();
	}

}
