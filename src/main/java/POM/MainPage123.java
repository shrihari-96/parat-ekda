package POM;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage123 
{
	@FindBy(xpath="//div[@clASS='header-menu']/li[9]/a")private WebElement LogClick;
	@FindBy(xpath="//*[text()='Log in']")private WebElement Login;
    public MainPage123(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}
    public void LoginClick123() 
    {
    	LogClick.click();
    }
    public void Login123() 
    {
    	Login.click();
    }
}
