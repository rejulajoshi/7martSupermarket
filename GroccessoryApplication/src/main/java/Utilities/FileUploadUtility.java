package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	public void fileuploadSendkeys() 
	{
		/*WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		WebElement choosefile=driver.findElement(By.xpath(""));
		choosefile.sendKeys("C:\\Users\\nkrej\\OneDrive\\Desktop\\Testing\\TestPlan-V1.docx");
		*/
	}
	public void fileuploadUsingRobotkey() throws AWTException
	{
		/*driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		StringSelection ss=new StringSelection("C:\\Users\\nkrej\\OneDrive\\Desktop\\Testing\\TestPlan-V1.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	    Robot robot=new Robot();
	    robot.delay(500);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.delay(500);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.delay(500);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    */
	}
}
