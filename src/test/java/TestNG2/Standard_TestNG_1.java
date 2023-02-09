package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Standard_TestNG_1
{
	@Test(groups = "functional")
	public void st1() 
	{
		Reporter.log("I m in st1",true);
	}
	@Test(groups = "non-functional")
	public void st2 () 
	{
		Reporter.log("I m in st2",true);
	}
	@Test(groups = "functional")
	public void st3 ()
	
	{
		Reporter.log("I m in st3",true);
	}
	@Test(groups = "non-functional")
	public void st4 () 
	{
		Reporter.log("I m in st4",true);
	}
	@Test(groups = "functional")
	public void st5 () 
	{
		Reporter.log("I m in st5",true);
	}
	
}
