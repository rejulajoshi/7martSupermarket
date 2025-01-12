package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public	WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//p[text()='7rmart supermarket']") WebElement homePageText;
@FindBy(xpath="//p[text()='Sub Category']")WebElement subCategoryButton;
@FindBy(xpath="//p[text()='Manage Category']")WebElement manageCategoryButton;
@FindBy(xpath="//p[text()='Manage News']")WebElement manageNewsButton;
@FindBy(xpath="//p[contains(text(), 'Admin Users')]")WebElement adminusersbutton;
@FindBy(xpath="//p[contains(text(), 'Manage Users')]")WebElement manageuserbutton;
public String getHomePageText()
{
	return homePageText.getText();
		}

public SubCategoryPage clickOnSubCategoryButton()
{
	subCategoryButton.click();
	return new SubCategoryPage(driver);
	
}
public ManageCategory ClickOnManageCategoryButton()
{
	manageCategoryButton.click();
	return new ManageCategory(driver);
}
public ManageNewsPage clickOnManageNewsButton()
{
	 manageNewsButton.click();
	 return new ManageNewsPage(driver);
}
public ManageUsersPage clickOnAdminUserButton()
{
	adminusersbutton.click();
	manageuserbutton.click();
	return new ManageUsersPage(driver);
}

}