package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude_2 
{
	@Test
	  public void PP1() 
	  {
		Reporter.log("I m in PP1",true);  
	  }
		@Test
	  public void QQ1() 
	  {
		Reporter.log("I m in QQ1",true);  
	  }
		@Test
	  public void RR1() 
	  {
		Reporter.log("I m in RR1",true);  
	  }
}
