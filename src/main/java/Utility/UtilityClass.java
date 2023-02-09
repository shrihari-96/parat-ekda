package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

import Base.BaseClass;

public class UtilityClass extends BaseClass
{
	public static void screenShot(WebDriver driver, String Folder,String FileName, String ExtensionType ) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Hari Selenium\\Automated ScreenShot\\"+Folder+"\\"+FileName+"."+ExtensionType);
//		File destination = new File("C:\\Hari Selenium\\Automated ScreenShot\\Hari\\FBLogin.jpg");
		
		FileHandler.copy(source, destination);
	 }
	
	public static String readExcelDataInString(String SheetName, int RowData, int CellData) throws EncryptedDocumentException, IOException
	{
		File F = new File("C:\\Hari Selenium\\ExcelData\\Test Data.xlsx");
		String readExcelData = WorkbookFactory.create(F).getSheet(SheetName).getRow(RowData).getCell(CellData).getStringCellValue();
		return readExcelData;
	}
	
	public static double readExcelDataNumeric(String SheetName, int RowData, int CellData) throws EncryptedDocumentException, IOException
	{
		File F= new File("C:\\Hari Selenium\\ExcelData\\NT Company 2.xlsx");
	double ReadExelNumericData = WorkbookFactory.create(F).getSheet(SheetName).getRow(RowData).getCell(CellData).getNumericCellValue();
	return ReadExelNumericData;
	}
	public static void implicitewaits(long ofmillisec) 
	{
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(ofmillisec));
 	}
	
	public static String KeyDrivenByProperties(String Key) throws IOException
	{
		Properties P = new Properties();
		
		FileInputStream FIS= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NT_Company\\keyDriven.properties");
		
		P.load(FIS);
		String Pr = P.getProperty(Key);
		return Pr;
	}
	
}
