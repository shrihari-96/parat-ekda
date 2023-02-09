package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_By_Hari_2 
{
	@Test(groups ="functional")
	 public void M1() 
	 {
		Reporter.log("I m in M1",true); 
	 }
	  @Test(groups ="Non-functional")
	  public void N1() 
	  {
	 	Reporter.log("I m in N1",true); 
	  }
	  @Test(groups ="functional")
	  public void O1() 
	  {
	 	Reporter.log("I m in O1",true); 
	  }
	  @Test(groups ="Non-functional")
	  public void P1() 
	  {
	 	Reporter.log("I m in P1",true); 
	  }
}
