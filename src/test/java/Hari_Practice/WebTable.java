package Hari_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
//		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='product']//tr"));
//		for (WebElement tbl:tableData)
//		{
//			System.out.println(tbl.getText());
//		}
		
		for(int i=0;i<7;i++){
			System.out.print(tableHeader.get(i).getText() + "|");
		}
		System.out.println();
		
		for(int i=2;i<=tableData.size();i++)
		{
			List<WebElement> tableData1 = driver.findElements(By.xpath("//table[@id='product']//tr["+i+"]//td"));
			for (int j=0; j<tableHeader.size();j++)
			{
			System.out.print(tableData1.get(j).getText() + "|");
			}
			System.out.println();
		}
		
		driver.quit();
	}

}
