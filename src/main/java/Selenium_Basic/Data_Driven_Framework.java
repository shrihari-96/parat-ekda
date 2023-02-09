package Selenium_Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven_Framework 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		for (int i=1; i<=4; i++)
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://in.freecrm.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		
		////////////////////////////////Data Driven//////////////////////////
	
		
		File F= new File("C:\\Hari Selenium\\ExcelData\\NT Company.xlsx");
		Row TillRow = WorkbookFactory.create(F).getSheet("Sheet1").getRow(i);
		
//		WorkbookFactory.create(F).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		WorkbookFactory.create(F).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
//		WorkbookFactory.create(F).getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
		Thread.sleep(1000);
		WebElement userID = driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login']"));
		
		try {
		 
		userID.sendKeys(TillRow.getCell(0).getStringCellValue());
		//userID.sendKeys)
		password.sendKeys(TillRow.getCell(1).getStringCellValue());
		loginButton.click();
		
		
		Thread.sleep(1000);
		
		WebElement actualName = driver.findElement(By.xpath("//div[@id='top-header-menu']//div[2]/span"));  //Dynamic Xpath
		
		String ActualUserNameText = actualName.getText();
		
		if (ActualUserNameText.contains(TillRow.getCell(2).getStringCellValue()))
		{
			System.out.println("Validation Successful Actual UserName and Expected Username are same");
		}
		else 
		{
			System.out.println("Validation Successful Actual UserName and Expected Username are not same");
		}
		
	driver.findElement(By.xpath("//div[@role='listbox']")).click();
	
	driver.findElement(By.xpath("(//a[@role='option'])[5]")).click();
	
		}
	catch (Exception e) {
		// TODO: handle exception
	}
		Thread.sleep(5000);
		driver.close();
		
		}
		
	}

}
