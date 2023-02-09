package Test_TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import POM.HomePage;
import POM.LoginPage;
import POM.MainPage;
import Utility.UtilityClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners (Listener.ListenersClass.class)
public class RealProgramListener extends BaseClass{
  
	MainPage MP;
	LoginPage LP;
	HomePage HP;
	UtilityClass UC;
	int count=1;
  
  
  @BeforeClass
  public void beforeClass() throws InterruptedException 
  {
	  BaseClass.browserLaunch("chrome","https://freecrm.com/");
	  MP = new MainPage(driver);
	  UC = new UtilityClass();
	  UC.implicitewaits(5000);
	  MP.LoginClick(driver);
  }
  
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, IOException 
  {
	  UC = new UtilityClass();
	  LP= new LoginPage(driver);
	  UC.implicitewaits(3000);
	  LP.emailInsertion(UC.readExcelDataInString("Login", count, 0));
	  LP.passwordInsertion(UC.readExcelDataInString("Login", count, 1));
	  LP.loginClick();
  }

  @Test
  public void ValidationOfLogin()
  {
	  HP = new HomePage(driver);
//	  Assert.assertEquals(HP.actualName(), "Nitesh T", "Expected Result and Actual Result of UserName is not valid");
	 
//	  String xyz = null;
//	  String A= "Nitesh";
	  
//	  Assert.assertEquals(A, "Nitesh", "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  Assert.assertNotEquals(A, "Nitesh1", "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  Assert.assertTrue(true, "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  Assert.assertFalse(false,"Expected Result and Actual Result of UserName "+A+" is not valid");
//	  Assert.assertNull(xyz, "Expected Result and Actual Result of UserName "+A+" is not valid" );
//	  Assert.assertNotNull(A, "Expected Result and Actual Result of UserName "+A+" is not valid" );
//	  Assert.fail();
	  
	  SoftAssert SA= new SoftAssert();
//	  
//	  SA.assertEquals(A, "Nitesh", "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  SA.assertNotEquals(A, "Nitesh1", "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  SA.assertTrue(true, "Expected Result and Actual Result of UserName "+A+" is not valid");
//	  SA.assertFalse(false,"Expected Result and Actual Result of UserName "+A+" is not valid");
//	  SA.assertNull(xyz, "Expected Result and Actual Result of UserName "+A+" is not valid" );
//	  SA.assertNotNull(A, "Expected Result and Actual Result of UserName "+A+" is not valid" );
//	  SA.fail();
	  
	  SA.assertEquals(HP.actualName(), "Nitesh T", "Expected and Actual are not same");
	  SA.assertAll();
	  count++;
  }
  
  @Test
  public void ValidationOfLoginByInvalidCredentials()
  {
	  HP = new HomePage(driver);
	  Assert.assertEquals(HP.actualName(), "Shrihari Bartakke1", "Expected and Actual are not Matching");
  
  }
  
  @AfterMethod
  public void afterMethod() 
  {
	  HP = new HomePage(driver);
	  
	  HP.settingClick();
	  HP.logoutClick();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
