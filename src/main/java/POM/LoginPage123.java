package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage123 
{
	@FindBy(id= "LoginForm:email")private WebElement Email123;
	@FindBy(id  = "LoginForm:password")private WebElement Pass123;
	@FindBy(id = "LoginForm:continue")private WebElement SingIn123;
	
  public LoginPage123(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
  }
  public void EmailInsertion(String Email) 
  {
	  Email123.sendKeys(Email);
  }
  public void PassInsertion(String Pass) 
  {
	  Pass123.sendKeys(Pass);
  }
  public void SignButton() 
  {
	  SingIn123.click(); 
  }
  
}
