package Listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.BaseClass;
import Utility.UtilityClass;

public class ListenersClass extends BaseClass implements ITestListener 
{
 
	public void onStart(ITestContext result) 
	{
		Reporter.log("Program has been Started in "+result.getName(), true);
	}
	
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test has been Started in "+result.getName(), true);
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test has been Skipped in "+result.getName(), true);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test has been Success in "+result.getName(), true);
	}
	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test has been Failed in "+result.getName(), true);
		
		try 
		{
			UtilityClass.screenShot(driver, "Failed TC", result.getName(), "jpg");
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onFinish(ITestContext result) 
	{
		Reporter.log("Program has been Finished in "+result.getName(), true);
	}
	
}
