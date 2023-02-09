package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDriller
{
	@FindBy(xpath = "//input [@id='login']")private WebElement LoginID;
	@FindBy(id = "password")private WebElement Passwordin;
	@FindBy(xpath = "//input[@class='button form-sub']")private WebElement Singclick;
 public LoginPageDriller(WebDriver driver) 
 {
	 PageFactory.initElements(driver,this);
 }
 public void Loginid(String Email) 
 {
	LoginID.sendKeys(Email);
 }
 public void Password(String Pass)
 {
	 Passwordin.sendKeys(Pass);
 }
 public void singbutton() 
 {
	 Singclick.click();
 }
}
