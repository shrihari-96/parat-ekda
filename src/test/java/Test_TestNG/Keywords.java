package Test_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords 
{
  @Test (invocationCount = 3, enabled = true, priority = 1, timeOut = 1000)
  public void A() throws InterruptedException
  {
	  Thread.sleep(2000);
	  Reporter.log("I am A Method", true);
  }
  
  @Test (dependsOnMethods = "A")
  public void B()
  {
	  Reporter.log("I am B Method", true);
  }
  
  @Test (dependsOnMethods = "B")
  public void C()
  {
	  Reporter.log("I am C Method", true);
  }
  
  @Test (enabled = false)
  public void D()
  {
	  Reporter.log("I am D Method", true);
  }
}
