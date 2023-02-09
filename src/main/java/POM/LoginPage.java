package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

public class LoginPage extends BaseClass
{
	@FindBy (name = "email") private WebElement emailTextBox;
	@FindBy (name = "password") private WebElement passwordTextBox;
	@FindBy (xpath = "//div[text()='Login']") private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void emailInsertion(String emailID)
	{
//		WebDriverWait WDW =  new WebDriverWait(driver, Duration.ofMillis(3000));
//		WDW.until(ExpectedConditions.visibilityOf(emailTextBox));
		emailTextBox.sendKeys(emailID);
	}
	
	public void passwordInsertion(String password)
	{
		passwordTextBox.sendKeys(password);
	}
	
	public void loginClick()
	{
		loginButton.click();
	}
}
