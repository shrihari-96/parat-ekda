  package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath = "//div[@id='top-header-menu']//div[2]/span") private WebElement actualID;
	@FindBy (xpath = "//div[@role='listbox']") private WebElement settingButton;
	@FindBy (xpath = "//span[text()='Log Out']") private WebElement logoutButton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String actualName()
	{
		String actualUserName = actualID.getText();
		return actualUserName;
	}
	
	public void settingClick()
	{
		settingButton.click();
	}
	
	public void logoutClick()
	{
		logoutButton.click();
	}
}
