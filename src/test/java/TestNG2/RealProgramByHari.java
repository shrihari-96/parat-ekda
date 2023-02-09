package TestNG2;

import org.testng.annotations.Test;

import Base.BaseClass3;
import POM.LoginPageDriller;
import POM.MainPageDriller;
import Utility.UtilityClass3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class RealProgramByHari extends BaseClass3
{
	  MainPageDriller MP3; 
	  LoginPageDriller LP3;
	  UtilityClass3 UC3;

  @BeforeClass
  public void beforeClass() 
  {
	  BaseClass3.BrowserPage("https://dribbble.com");
	  MP3 = new MainPageDriller(driver);
	  UC3 = new UtilityClass3();
	  UC3.impliciteWaits3(5000);
	  MP3.SignUP();
	  UC3.impliciteWaits3(5000);
  }
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, IOException 
  {
	  MP3 = new MainPageDriller(driver);
	  LP3 = new LoginPageDriller(driver);
	  UC3 = new UtilityClass3();
	  UC3.impliciteWaits3(5000);
	  LP3.Loginid(UC3.ReadExcelsheetData("Login", 2, 0));
	  UC3.impliciteWaits3(5000);
	  LP3.Password(UC3.ReadExcelsheetData("Login", 2, 1));
	  UC3.impliciteWaits3(5000);
	  LP3.singbutton();
	  UC3.impliciteWaits3(5000);
  
  }

  @Test
  public void aa()
  {
	  
  }
  @AfterMethod
  public void afterMethod() 
  {
	  
  }

 

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
