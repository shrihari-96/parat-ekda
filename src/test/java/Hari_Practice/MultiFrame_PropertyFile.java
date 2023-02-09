package Hari_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiFrame_PropertyFile {

	public static void main(String[] args) throws IOException 
	{
//		WebDriver driver = null;
//		
//		List<WebElement> MultipleIframes = driver.findElements(By.tagName("iframe"));
//		
//		for(WebElement MultiFrame:MultipleIframes)
//		{
//			driver.switchTo().frame(MultiFrame);
//			try
//			{
//			driver.findElement(By.linkText("Forgot Password")).click();
//			}
//			catch(Exception e)
//			{
//			
//			}
//		}
		
		MultiFrame_PropertyFile MP = new MultiFrame_PropertyFile();
		
		System.out.println(MP.PropertyFile("UN"));
		System.out.println(MP.PropertyFile("PWD"));
	}
	
	public String PropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NT_Company3\\hari.properties");
		
		prop.load(FIS);
		
		String xyz = prop.getProperty(key);
		return xyz;
		
	}

}
