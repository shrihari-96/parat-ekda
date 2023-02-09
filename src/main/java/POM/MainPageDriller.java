package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageDriller 
{
	@FindBy(xpath = "//a[@data-site-nav-element='Sign in']")private WebElement SignInButton;
  public MainPageDriller(WebDriver driver) 
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void SignUP() 
  {
	  SignInButton.click();
  }
	  
  
}
