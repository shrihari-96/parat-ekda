package TestPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Base.BaseClass3;
import POM.LoginPageDriller;
import POM.MainPageDriller;
import Utility.UtilityClass3;

public class ValidationTC3 extends BaseClass3
{
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
      BaseClass3.BrowserPage("https://dribbble.com/");
	  MainPageDriller MP33 = new MainPageDriller(driver);
      LoginPageDriller LP3 = new LoginPageDriller(driver);
      UtilityClass3 UC3 = new UtilityClass3();
      UC3.impliciteWaits3(5000);
      MP33.SignUP();
      UC3.impliciteWaits3(5000);
      LP3.Loginid(UtilityClass3.ReadExcelsheetData("Login",2,0));
      UC3.impliciteWaits3(5000);
      LP3.Password(UtilityClass3.ReadExcelsheetData("Login",2,1));
      LP3.singbutton();
      UC3.impliciteWaits3(7000);

      driver.close();
	}
	

}
