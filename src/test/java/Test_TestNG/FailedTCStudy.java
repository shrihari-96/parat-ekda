package Test_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTCStudy
{
 
	@Test
	public void A()
	{
		Reporter.log("I am A method",true);
		
	}
	
	@Test 
	public void B()
	{
		Reporter.log("I am B method",true);
	}

	@Test
	public void C()
	{
		Reporter.log("I am C method",true);
		
		Assert.fail();
	}
	
	@Test
	public void D()
	{
		Reporter.log("I am D method",true);
	}
	
	@Test
	public void E()
	{
		Reporter.log("I am E method",true);
		
		Assert.fail();
	}





}
