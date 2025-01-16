package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {
	public void getScreenShot(WebDriver driver, String failedtestcase) throws IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver; // The driver object is cast to TakesScreenshot, enabling
															// the screenshot functionality.
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE); // capture the screenshot and it will store in
																	// temporary path. it saved as a file obj
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); // Generate timestamp-
																							// Formats the current date
																							// and time into a string.
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");
		if (!f1.exists()) {
			f1.mkdirs(); // mkdir --> will create folder using java
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedtestcase + timeStamp
				+ ".png";

		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);

	}

}
