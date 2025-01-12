package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelUtility;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='username']")WebElement userNameField;
    @FindBy(xpath="//input[@name='password']")WebElement passwordField;
    @FindBy(xpath="//button[@type='submit']")WebElement submitButton;
    @FindBy(xpath="//span[text()='7rmart supermarket']")WebElement homePage;
    @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
    public void enterUsername(String username)
    {
    	userNameField.sendKeys(username);
    }
    public void enterPassword(String password)
    {
    	passwordField.sendKeys(password);
    }
    public void clickonSubmit()
    {
    	submitButton.click();
    }
    public boolean isHomepageIsloaded()
    {
    	return homePage.isDisplayed();
    }
    
    public String getAlert()
    {
    	return alert.getText();
    }
    public HomePage loginByUsingExceldata() throws IOException
    {
    	String username=ExcelUtility.readStringData(1, 0,"LoginPage");
    	String password=ExcelUtility.readStringData(1, 1,"LoginPage");
    	userNameField.sendKeys(username);
    	passwordField.sendKeys(password);
    	submitButton.click();
    	return new HomePage(driver);
    	
    }
}
