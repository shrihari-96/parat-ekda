package Selenium_Basic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class2 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
//		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions Act = new Actions(driver);
		
		WebElement src1 = driver.findElement(By.id("box1"));
		WebElement dest1= driver.findElement(By.id("box101"));
		
		Thread.sleep(2000);
		
//		Act.clickAndHold(src1).build().perform();    //old method for drag and drop
//		Act.release(dest1).perform();
		
		Act.dragAndDrop(src1, dest1).perform();
		
		
		Thread.sleep(7000);
		driver.close();
		
		File f = new File(System.getProperty("user.dir")+"\\testData\\test.xlsx");
		 String data = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(data);
	
	}

}
