package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
		JSE.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
        JSE.executeScript("window.scrollBy(0,-200)");
        WebElement viewpoint = driver.findElement(By.linkText("New Tours"));
        JSE.executeScript("arguments[0].scrollIntoView();",viewpoint);
		Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.in/");
        WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        JSE.executeScript("arguments[0].value='iphone 13';",SearchBox);
        WebElement SearchClick = driver.findElement(By.id("nav-search-submit-button"));
        JSE.executeScript("arguments[0].click();",SearchClick);
        driver.close();
        
        
	}

}
