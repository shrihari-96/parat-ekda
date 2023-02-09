package Hari_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngpracticeTest
{
	@Test (groups = "reg")
  public void AAA() 
  {
	  Reporter.log("I m in AAA",true);
  }
	@Test
	  public void BBB() 
	  {
		  Reporter.log("I m in BBB",true);
  
	  }
	@Test (groups = "reg")
	  public void CCC() 
	  {
		  Reporter.log("I m in CCC",true);
 
	  }
	@Test
	  public void DDD() 
	  {
		  Reporter.log("I m in DDD",true);
 
	  }
	@Test
	  public void EEE() 
	  {
		  Reporter.log("I m in EEE",true);

	  }
	@Test
	  public void FFF() 
	  {
		  Reporter.log("I m in FFF",true);

	  }
	@Test
	  public void GGG() 
	  {
		  Reporter.log("I m in GGG",true);
 
	  }
}
