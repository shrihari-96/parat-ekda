package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude1
{
	@Test
  public void PP() 
  {
	Reporter.log("I m in PP",true);  
  }
	@Test
  public void QQ() 
  {
	Reporter.log("I m in QQ",true);  
  }
	@Test
  public void RR() 
  {
	Reporter.log("I m in RR",true);  
  }
}
