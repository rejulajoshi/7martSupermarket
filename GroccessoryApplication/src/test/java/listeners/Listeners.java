package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Utilities.ExtentReportUtility;
import testcase.BaseClass;

public class Listeners extends BaseClass implements ITestListener{
	
	ExtentTest test;  // represents a single test in the report.
	ExtentReports extent = ExtentReportUtility.createExtentReports();  //ExtentReports object extent initializes the reporting framework using a utility class (ExtentReportUtility).
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();  //ThreadLocal<ExtentTest> ensures that the reporting is thread-safe when tests run in parallel.


	public void onTestStart(ITestResult result) {   ////Called when a test starts.
		ITestListener.super.onTestStart(result);   //retrieves the test method name.
		test = extent.createTest(result.getMethod().getMethodName());  // Creates an ExtentReport test entry using createTest.
		extentTest.set(test);
}
	public void onTestSuccess(ITestResult result) {

		ITestListener.super.onTestSuccess(result);
		extentTest.get().log(Status.PASS, "Test Passed");
	}
	 public void onTestFailure(ITestResult result) { 
		  
	 		ITestListener.super.onTestFailure(result); 
	 		extentTest.get().log(Status.FAIL, "Test Failed"); 
	 		extentTest.get().fail(result.getThrowable()); 
	 		WebDriver driver = null; 
	 		String testMethodName = result.getMethod().getMethodName(); 
	 		try { 
	 			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver") 
	 					.get(result.getInstance()); 
	 		} catch (IllegalArgumentException e) { 
	  
	 			e.printStackTrace(); 
	 		} catch (IllegalAccessException e) { 
	  
	 			e.printStackTrace(); 
	 		} catch (NoSuchFieldException e) { 
	  
	 			e.printStackTrace(); 
	 		} catch (SecurityException e) { 
	  
	 			e.printStackTrace(); 
	 		} 
	  
	 		try { 
	 			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver") 
	 					.get(result.getInstance()); 
	 		} catch (Exception e) { 
	 		} 
	 	}
	 public void onTestSkipped(ITestResult result) {   //Called when a test is skipped.
			ITestListener.super.onTestSkipped(result);
			extentTest.get().log(Status.SKIP, "Test Skipped");
			//String testMethodName = result.getMethod().getMethodName();
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  //Called if the test fails but still meets the defined success percentage. Rarely used.

			ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		}
	public void onTestFailedWithTimeout(ITestResult result) {  //Called if a test fails due to a timeout

			ITestListener.super.onTestFailedWithTimeout(result);
		}
	public void onStart(ITestContext context) {  //Called at the start of a test context (e.g., suite or test tag in testng.xml).

		ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {   //Called at the end of the test context.

		ITestListener.super.onFinish(context);  //Called at the end of the test context.
		extent.flush();  //extent.flush() saves and writes all the collected logs and test details into the final report.
	}

	}
