import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtility;

public class ManageUsersPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public ManageUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
