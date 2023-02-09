package Hari_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1ByHari
{
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     driver.manage().window().maximize();
     Thread.sleep(2000);
   //  Actions act = new Actions(driver);
		Actions act = new Actions(driver);

		WebElement rightclickk = driver.findElement(By.xpath("//span[text()='right click me']"));
    Thread.sleep(2000);
    act.contextClick(rightclickk);
    Thread.sleep(2000);
   WebElement copyclick = driver.findElement(By.xpath("//span[text()='Copy']"));
   Thread.sleep(2000);
   act.click(copyclick).perform();
   Thread.sleep(2000);
   Alert alt = driver.switchTo().alert();
   Thread.sleep(2000);
   alt.accept();
   driver.close();
   
     
	}

}
