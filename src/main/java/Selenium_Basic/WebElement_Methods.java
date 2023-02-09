
package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_Methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("email")).sendKeys("ksdc");	
//		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("jaskdc");
//		
//		Thread.sleep(3000);
//		password.clear();
//		
//		Thread.sleep(3000);
//		password.sendKeys("Hari");
//		//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
//		//driver.findElement(By.linkText("Forgotten password?")).click();
//		
//		//driver.findElement(By.partialLinkText("Forgotten")).click();
//		
//		Thread.sleep(3000);
//		String textfromfb = driver.findElement(By.tagName("h2")).getText();
//		
//		System.out.println(textfromfb);
		
		Thread.sleep(3000);
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		System.out.println(checkbox2.isSelected());
		System.out.println("=============="+ "");
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("hide-textbox")).click();
		
		WebElement displayedBlock = driver.findElement(By.id("displayed-text"));
		
		System.out.println(displayedBlock.isDisplayed());
		
		Thread.sleep(3000);
		driver.findElement(By.id("show-textbox")).click();
		System.out.println(displayedBlock.isDisplayed());
		
		Thread.sleep(5000);
		driver.close();
	}

}
