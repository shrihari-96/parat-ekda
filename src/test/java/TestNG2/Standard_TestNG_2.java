package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Standard_TestNG_2 
 {
	@Test(groups = "functional")
	public void st11() 
	{
		Reporter.log("I m in st11",true);
	}
	@Test(groups = "non-functional")
	public void st22 () 
	{
		Reporter.log("I m in st22",true);
	}
	@Test(groups = "functional")
	public void st33 ()
	
	{
		Reporter.log("I m in st33",true);
	}
	@Test(groups = "non-functional")
	public void st44 () 
	{
		Reporter.log("I m in st44",true);
	}
	@Test(groups = "functional")
	public void st55 () 
	{
		Reporter.log("I m in st55",true);
	}
	
	
 
 
}
