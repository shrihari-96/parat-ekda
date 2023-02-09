package Selenium_Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expicit_Waits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		
		hideButton.click();
		
		WebElement displayedTextBox = driver.findElement(By.id("displayed-text"));
		
		WebDriverWait WDW = new WebDriverWait(driver, Duration.ofMillis(10000));
		WDW.until(ExpectedConditions.visibilityOf(displayedTextBox));
		
		displayedTextBox.sendKeys("Hari");
		
		
		
	}

}
