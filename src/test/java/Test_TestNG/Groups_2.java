package Test_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups_2
{
  @Test
  public void A1()
  {
	  Reporter.log("I am A1 method", true);
  }
  
  @Test
  public void B1()
  {
	  Reporter.log("I am B1 method", true);
  }
  
  @Test
  public void C1()
  {
	  Reporter.log("I am C1 method", true);
  }
  
  @Test
  public void D1()
  {
	  Reporter.log("I am D1 method", true);
  }
  
  @Test
  public void E1()
  {
	  Reporter.log("I am E1 method", true);
  }
}
