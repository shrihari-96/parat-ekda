package Hari_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FAlertPoUp {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver","C:\\\\Hari Selenium\\\\Softwares\\\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.automationtesting.in/Alerts.html");
      Thread.sleep(4000);
      driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
      Alert alt = driver.switchTo().alert();
      Thread.sleep(4000);
      alt.accept();
      Thread.sleep(4000);
      driver.findElement(By.partialLinkText("Alert with OK &")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
      Thread.sleep(3000);
      alt.dismiss();
      driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
      Thread.sleep(2000);
      System.out.println(alt.getText());
      Thread.sleep(3000);
      alt.sendKeys("Hellow");
      Thread.sleep(5000);
      alt.accept();
      driver.close();
	}

}
