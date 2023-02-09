package Test_TestNG;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations_TestNG {
  
	@BeforeSuite
	  public void beforeSuite() 
	  {
		Reporter.log("I am Before Suite", true);
	  }
	
	@BeforeTest
	  public void beforeTest() 
	  {
		Reporter.log("I am Before Test", true);
	  }
	
	@BeforeClass
	  public void beforeClass() 
	  {
		Reporter.log("I am Before Class", true);
	  }
	
	@BeforeMethod
	  public void beforeMethod() 
	  {
		Reporter.log("I am Before Method", true);
	  }
	
	
	
 @Test
 public void A()
 {
	 Reporter.log("I am Test A", true);
 }
 
 @Test
 public void B()
 {
	 Reporter.log("I am Test B", true);
 }
 
  

  	@AfterMethod
  	   public void afterMethod() 
  	  {
  		Reporter.log("I am After Method", true);
  	  }

  	@AfterClass
  	   public void afterClass() 
  	  {
  		Reporter.log("I am After Class", true);
  	  }

  	@AfterTest
  	   public void afterTest() 
  	  {
  		Reporter.log("I am After Test", true);
  	  }

  	@AfterSuite
  	   public void afterSuite() 
  	  {
  		Reporter.log("I am After Suite", false);
  	  }

}
