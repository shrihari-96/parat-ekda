package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		
		JSE.executeScript("window.scrollBy(0,600)");
//		Thread.sleep(3000);
//		JSE.executeScript("window.scrollBy(0,-400)");
		
		Thread.sleep(3000);
		WebElement seleniumElement = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		JSE.executeScript("arguments[0].scrollIntoView();", seleniumElement);
	
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		JSE.executeScript("arguments[0].value='Redmi 10 prime';", searchBox);
		
		Thread.sleep(3000);
		WebElement ClickSearch = driver.findElement(By.id("nav-search-submit-button"));
		JSE.executeScript("arguments[0].click();", ClickSearch);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
