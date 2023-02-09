package Practice11;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class F2Practice
{
public static void main (String [] args) throws IOException
{
System.setProperty("webdriver.chrome.driver","C:\\Hari Selenium\\Softwares\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Hari Selenium\\Automated ScreenShot\\fbScreenshot22/11.jpg");
FileHandler.copy(source, destination);
}
}