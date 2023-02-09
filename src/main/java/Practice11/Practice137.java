package Practice11; 

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice137 
{
    public static void main(String[] args) throws InterruptedException, IOException
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Hari Selenium\\Softwares\\chromedriver.exe");
     WebDriver driver = new ChromeDriver ();
     driver.manage().window().maximize();
     driver.get("https://www.youtube.com/");
     File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File destination = new File ("C:\\Hari Selenium\\Automated ScreenShot\\Fscreenshot.jpg");
     FileHandler.copy(source, destination);
     //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(222));
     WebElement EXP = driver.findElement(By.id("text"));
      WebElement EXP11 = driver.findElement(By.id("text"));
     
    //WebDriverWait wdw = new WebDriverWait(driver,Duration.ofMillis(2344));
    //wdw.until(ExpectedConditions.visibilityOf(EXP));
    //driver.switchTo().frame("");
    //Alert alt = driver.switchTo().Alert();
    //alt.accept();  
    //alt.dismiss();
    //alt.getText();
    //Set<String> windowss = driver.getWindowHandles();
    // ArrayList<String> AL = new ArrayList<String>(windowss);
    //String mainwindow = AL.get(0);
    // String childwindow = AL.get(1);
    // driver.switchTo().window(childwindow);
    // Actions act = new Actions(driver);
    // act.contextClick().perform();
    //  act.click().perform();
    //  act.dragAndDrop(EXP, EXP11).perform();
    //  act.doubleClick().perform();
    //  act.sendKeys(Keys.ARROW_UP).perform();
    //JavascriptExecutor JSE = ((JavascriptExecutor)driver);
    //JSE.executeScript("window.scrollBy(0,344)");
    //JSE.executeAsyncScript("arguments[0].scrollinToView();",EXP);
    //JSE.executeAsyncScript("arguments[0].value='Hiii';", EXP11);
    //JSE.executeScript("arguments[0].click();", EXP11);
    //Select s = new Select(EXP);
    //s.selectByIndex(13);
    //s.selectByValue("7");
    //s.selectByVisibleText("96");
    //s.deselectAll();
    //s.isMultiple();
    //Dimension D = new Dimension(333, 666);
    //driver.manage().window().setSize(D);
    //Point P = new Point(200,400);
    //Thread.sleep(5000);
    //driver.manage().window().setPosition(P);
    //Thread.sleep(5000);
    //File F1 = new File ("C:\\Hari Selenium\\ExcelData\\NT Company 2.xlsx");
   //double row = WorkbookFactory.create(F1).getSheet("sheet1").getRow(1).getCell(2).getNumericCellValue();
       

    
     
    //driver.close();
	}


}
