package Hari_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1ByHari2
{
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
	
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();
   
		Thread.sleep(2000);
		
		Actions act2 = new Actions(driver);
		WebElement drag = driver.findElement(By.id("box3"));
		WebElement drop = driver.findElement(By.id("box103"));
		act2.dragAndDrop(drag, drop).perform();
		driver.close();
   

}
}