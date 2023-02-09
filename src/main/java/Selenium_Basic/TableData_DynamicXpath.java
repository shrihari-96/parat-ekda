package Selenium_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData_DynamicXpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		//List<WebElement> tableHeader = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		for (WebElement xyz:tableHeader)
		{
		System.out.print(xyz.getText()+ " | ");
		}
		System.out.println();
		
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		List<WebElement> tableCell;
		for (int i=1; i<=tableRow.size();i++)
		{
			tableCell=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));		
			for (int j=0; j<tableCell.size();j++)
			{
				System.out.print(tableCell.get(j).getText()+ " | ");
			}
			System.out.println();
		}
		
		
	}
}


