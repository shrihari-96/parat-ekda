package Selenium_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alt.accept();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alt2.getText());
		
		alt2.dismiss();
		Thread.sleep(5000);
		driver.close();
			
	}

}
