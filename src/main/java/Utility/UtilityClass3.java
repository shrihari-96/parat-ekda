package Utility;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import Base.BaseClass3;

public class UtilityClass3 extends BaseClass3
{
  public static void ScreenShot3() throws IOException 
  {
	 File Source3 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File Destination3 = new File("C:\\Hari Selenium\\AutomatedScreenshotbyhari\\DrillerLogin.jpg");
	 FileHandler.copy(Source3, Destination3);
  }
  public static String ReadExcelsheetData(String SheetData,int RowData,int CellData) throws EncryptedDocumentException, IOException 
  {
	  File F3 = new File("C:\\Hari Selenium\\ExcelData\\Test Data.xlsx");
	  String ReadExcelData3= WorkbookFactory.create(F3).getSheet(SheetData).getRow(RowData).getCell(CellData).getStringCellValue(); 
      return ReadExcelData3;      
  }
  public static void impliciteWaits3(long ofmillisec) 
  {
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(ofmillisec)); 
  }
  public static void JavaScriptScrollBy(long x, long y) 
  {
	  JavascriptExecutor JSE123 = (JavascriptExecutor) ((JavascriptExecutor)driver);
	  JSE123.executeScript("window.scrollBy("+x+","+y+")");
  }
  public static void ActionClass () 
  {
	  Actions Act123 = new Actions(driver);
	 // Act123.
  }

}