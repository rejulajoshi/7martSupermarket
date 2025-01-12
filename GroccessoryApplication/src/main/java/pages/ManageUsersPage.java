package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newuserbutton;
	@FindBy(xpath="//input[@id='username']")WebElement usernamefield;
    @FindBy(xpath="//input[@id='password']")WebElement passwordfiled;
    @FindBy(xpath="//select[@id='user_type']")WebElement usertypeselect;
    @FindBy(xpath="//button[@name='Create']")WebElement savebutton;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchUserbutton;
    @FindBy(xpath="//input[@id='un']")WebElement searchusername;
    @FindBy(xpath="//select[@id='ut']")WebElement searchusertype;
    @FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
    @FindBy(xpath="//i[@class='fas fa-trash-alt']")WebElement deleteuser;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
    @FindBy(xpath="//center[contains(text(), 'RESULT NOT FOUND')]")WebElement searchresult;
    @FindBy(xpath="//i[@class='icon fas fa-check']")WebElement deletealert;
    public ManageUsersPage clickOnNewButton()
    {
    	newuserbutton.click();
 	   return this;
    }
    public ManageUsersPage enterusername()
    {
    	usernamefield.sendKeys("rj"+gu.generateCurrentDateAndTime());
    	return this;
    }
    public ManageUsersPage enterPassword() 
    {
    	passwordfiled.sendKeys("123");
    	return this;
    }
    public ManageUsersPage selectUsertype()
    {
 	   gu.selectDropdownWithIndex(usertypeselect, 1);
 	   return this;
 	   
 	   }
    public ManageUsersPage clickOnSaveButton()
    {
    	savebutton.click();
    	return this;
    	
    }
    public boolean alertMessage() 
	   {
		   return alertmessage.isDisplayed();
	   }
    public ManageUsersPage searchUser()
    {
    	searchUserbutton.click();
    	return this;
    }
    public ManageUsersPage entersearchusername()
    {
    	searchusername.sendKeys("rjl");
    	return this;
    }
    
    public ManageUsersPage searchselectUsertype()
    {
 	   gu.selectDropdownWithIndex(searchusertype, 1);
 	   return this;
 	   
 	   }
    public ManageUsersPage clickOnSearchButton()
    {
    	searchbutton.click();
    	return this;
    }
    public boolean manageUserslist() 
    {
 	   return searchresult.isDisplayed();
    }
    public ManageUsersPage enterUserName()
    {
    	searchusername.sendKeys("rj");
    	return this;
    }
    public ManageUsersPage selectusertype()
    {
 	   gu.selectDropdownWithIndex(searchusertype, 2);
 	   return this;
 	   
 	   }
    public ManageUsersPage deleteUser()
    {
    	deleteuser.click();
    	gu.acceptAlert();
    	return this;
    }
    public boolean deleteUserlist() 
    {
 	   return deletealert.isDisplayed();
    }
}
