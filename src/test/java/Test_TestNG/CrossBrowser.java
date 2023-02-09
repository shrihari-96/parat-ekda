package Test_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;

public class CrossBrowser extends BaseClass
{
	@Parameters ("xyz")
	@Test
	public void BrowserTesting(String browserName) throws InterruptedException
	{
		BaseClass.browserLaunch(browserName, "https://freecrm.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(4000);
		driver.close();
	}
	
	@Test
	public void XYZA()
	{
		
	}
}

