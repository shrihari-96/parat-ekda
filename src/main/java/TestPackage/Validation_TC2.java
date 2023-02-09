package TestPackage;

import java.io.IOException;
import java.time.Duration;

import Base.BaseClass;
import POM.HomePage;
import POM.LoginPage;
import POM.MainPage;
import Utility.UtilityClass;
import dev.failsafe.internal.util.Assert;

public class Validation_TC2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		BaseClass.browserLaunch("firefox","https://freecrm.com/");//https://www.mockplus.com/blog/post/login-page-examples
		
		MainPage MP= new MainPage(driver);
		LoginPage LP= new LoginPage(driver);
		HomePage HP=  new HomePage(driver);
		UtilityClass UC = new UtilityClass();
		  
//		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		UC.implicitewaits(5000);

		UtilityClass.screenShot(driver, "Hari", "MainPage", "png");
		MP.LoginClick(driver);
		
//		Thread.sleep(3000);
		UC.implicitewaits(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		UtilityClass.screenShot(driver, "Hari", "LoginPage", "jpg");
		
		LP.emailInsertion(UtilityClass.KeyDrivenByProperties("UN"));
		UtilityClass.screenShot(driver, "Hari", "userID", "jpeg");
		LP.passwordInsertion(UtilityClass.KeyDrivenByProperties("PWD"));
		UtilityClass.screenShot(driver, "Hari", "password", "jpeg");
		LP.loginClick();
		
//		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		UC.implicitewaits(3000);

		UtilityClass.screenShot(driver, "Hari", "HomePage", "jpeg");
		
		if (HP.actualName().equals("Nitesh T"))
		{
			System.out.println("Expected user Name and Actual User Name is same");
		}
		else 
		{
			System.out.println("Expected user Name and Actual User Name is not same");
		}
		HP.settingClick();
		UtilityClass.screenShot(driver, "Hari", "settingClick", "jpg");
		HP.logoutClick(); 
//		Thread.sleep(5000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		UC.implicitewaits(3000);
		UtilityClass.screenShot(driver, "Hari", "logoutClick", "jpg");
		driver.close();
	}

}
