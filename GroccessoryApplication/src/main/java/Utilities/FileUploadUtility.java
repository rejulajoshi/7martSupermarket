package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileuploadSendkeys(WebElement element) {
		element.sendKeys("C:\\Users\\nkrej\\OneDrive\\Desktop\\Screenshot 2024-12-25 082555.png");

	}

	public void fileuploadUsingRobotkey() throws AWTException {

		StringSelection ss = new StringSelection("C:\\Users\\nkrej\\OneDrive\\Desktop\\Testing\\TestPlan-V1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
