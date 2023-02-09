package TestNGByHari;

import org.testng.annotations.Test;

import Base.BaseClass3;
import POM.LoginPage123;
import POM.MainPage;
import POM.MainPage123;
import Utility.UtilityClass3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class RealProgramByHari extends BaseClass3
{
	MainPage123 MP123;
	LoginPage123 LP123;
	UtilityClass3 UC123;
 
  @BeforeClass
  public void beforeClass() 
  {
	  BaseClass3.BrowserPage("https://www.ni.com/en-in/about-ni.html");
	  MP123=new MainPage123(driver);
	  UC123=new UtilityClass3();
	  UC123.impliciteWaits3(5000);
	  MP123.LoginClick123();  
  }
  
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, IOException 
  {
	  LP123=new LoginPage123(driver);
	  UC123=new UtilityClass3();
	  UC123.impliciteWaits3(5000);
	  LP123.EmailInsertion(UC123.ReadExcelsheetData("Login", 2, 0));
	  LP123.PassInsertion(UC123.ReadExcelsheetData("Login", 2, 1));
	  LP123.SignButton();  
  }
  @Test
  public void ScrollDownUp() 
  {
	 UC123=new UtilityClass3();
	 UC123.JavaScriptScrollBy(0, 1000);
  }

  @AfterMethod
  public void afterMethod()
  {
	  
  }

 
  @AfterClass
  public void afterClass() 
  {
	  
  }

}
