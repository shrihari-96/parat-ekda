package Selenium_Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		
		ArrayList<String> AL= new ArrayList(windows);
		
		String MainWindow = AL.get(0);
		String ChildWindow1 = AL.get(1);
		
		
		System.out.println(MainWindow);
		System.out.println(ChildWindow1);
		
		driver.switchTo().window(ChildWindow1);
		
		Thread.sleep(3000);
		driver.findElement(By.name("emailid")).sendKeys("hari@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		Thread.sleep(3000);
 		driver.quit();
	}

}
