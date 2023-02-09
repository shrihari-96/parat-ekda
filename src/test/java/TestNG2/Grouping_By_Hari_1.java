package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_By_Hari_1 
{
  @Test(groups ="functional")
 public void M() 
 {
	Reporter.log("I m in M",true); 
 }
  @Test(groups ="Non-functional")
  public void N() 
  {
 	Reporter.log("I m in N",true); 
  }
  @Test(groups ="functional")
  public void O() 
  {
 	Reporter.log("I m in O",true); 
  }
  @Test(groups ="Non-functional")
  public void P() 
  {
 	Reporter.log("I m in P",true); 
  }
}
