 package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	@FindBy (xpath = "//div[@aria-label='Dismiss']") private WebElement dismissButton;
	@FindBy (linkText = "Login") private WebElement loginButton;   //declaration
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);                   // Initialization
	}
	
	public void LoginClick(WebDriver driver)
	{
		
//		JavascriptExecutor JSE = ((JavascriptExecutor)driver);
//		JSE.executeScript("arguments[0].click();", dismissButton);
//		JSE.executeScript("arguments[0].click();", loginButton);
		loginButton.click();
	}
	
//	public MainPage(int a)
//	{
//		
//	}
}
