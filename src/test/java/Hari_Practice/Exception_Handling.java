package Hari_Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Exception_Handling {

	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		Thread.sleep(0);
		WebElement xy,xyz;
		
		
		WebDriver driver=  null;
		try 
		{
			driver.switchTo().frame(0);			//NotFoundException It will handle this exception
			driver.switchTo().window("");		//Exception It will handle this exception
			driver.findElement(By.id(""));
			
			String a = "Hari";					//Exception It will handle this exception
			System.out.println(a.charAt(8));	//NotFoundException It will not handle this exception
		} 
		catch (NotFoundException e) 
		{
			System.out.println("I am NotFoundException");
		}
		////////////////////////////////////////////////////////////////////////////////////////
		try 
		{
			String a = "Hari";					//Exception It will handle this exception
			System.out.println(a.charAt(8));	//StringIndexOutOfBoundsException It will handle this exception
		} 
//		catch (StringIndexOutOfBoundsException e) 
//		{
//			System.out.println("I am StringIndexOutOfBoundsException");
//		}
		
		finally {
			System.out.println("I will show all process is completed");
		}
	}

}
