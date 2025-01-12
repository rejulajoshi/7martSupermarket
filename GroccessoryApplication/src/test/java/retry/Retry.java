package retry;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	private static final Logger LOG = (Logger) LogManager.getLogger("Retry.class");  //logger is initialised to track and log test retry attempt using log4J
	 private static final int maxTry = 3; // maximum no of retry attempts   
	 private int count = 0;  //how many times the retry attempted for the current test cases
	 public boolean retry(final ITestResult iTestResult) 
	 { 
	 	if (!iTestResult.isSuccess()) //  checks if the test fails 
	 	{   
	 		if (this.count < maxTry) {      				 
	 			LOG.info("Retrying test " + iTestResult.getName() + " with status " 
	 						+ getResultStatusName(iTestResult.getStatus()) + " for the " + (this.count + 1) + " time(s).");   
	 		this.count++; 
	 		return true;   //indicates a retry attempt 
	 	} 
	 		 
	 	} 
	 	return false;   //no more retries, so the test will not rerun 
	 } 
	 public String getResultStatusName(final int status) { 
	 		String resultName = null; 
	 		if (status == 1) { 
	 			resultName = "SUCCESS"; 
	 		} 
	 		if (status == 2) { 
	 			resultName = "FAILURE"; 
	 		} 
	 		if (status == 3) { 
	 			resultName = "SKIP"; 
	 		} 
	 		return resultName; 
	 	}
	

}
