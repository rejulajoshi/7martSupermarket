package testcase;


import Utilities.ScreenShotUtility;
import Utilities.WaitUtilities;
import constants.Constant;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
	Properties prop;
	FileInputStream fis;
	WaitUtilities waitutility=new WaitUtilities();
	
	
	  @BeforeMethod(alwaysRun=true)
	  @Parameters("browser")
	  public void initialiseBrowser(String browser) throws Exception {
		  prop=new Properties();
		  fis=new FileInputStream(Constant.CONFIGFILE);
		  prop.load(fis);
		  if(browser.equalsIgnoreCase("Chrome"))
		  {
			  driver=new ChromeDriver();
			  
		  }
		  else if(browser.equalsIgnoreCase("Edge"))
		  {
			  driver=new EdgeDriver();
			  
		  }
		  else if(browser.equalsIgnoreCase("FireFox"))
		  {
			  driver=new FirefoxDriver();
			  
		  }
		  else {
			  throw new Exception("invalidBrowser");
		  }
		  driver.get(prop.getProperty("url"));
		  driver.manage().window().maximize();
		  waitutility.implicitylyWait(driver);
		  
		  
	  }

	  @AfterMethod(alwaysRun=true)
	  public void driverquit(ITestResult itestresult)  throws IOException
	  {
		  if(itestresult.getStatus()==ITestResult.FAILURE)
			{
			  ScreenShotUtility screenshot=new ScreenShotUtility();
				screenshot.getScreenShot(driver,itestresult.getName());
			}
		  
	  }
		 // driver.quit();
	  


}
