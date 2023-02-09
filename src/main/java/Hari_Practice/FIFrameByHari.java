package Hari_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIFrameByHari {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement iframe = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        WebElement IframeText = driver.findElement(By.xpath("//input[@type='text']"));
        Thread.sleep(3000);
        IframeText.sendKeys("Shree");
        Thread.sleep(3000);
        driver.close();
       
	}

}
