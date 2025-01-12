package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtility;

public class ManageNewsPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Manage News']")WebElement manageNewsButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newNewsButton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchNewsButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement newsTitle;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")WebElement searchButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	@FindBy(xpath="//center[contains(text(), 'RESULT NOT FOUND')]")WebElement searchresult;
	 
	 public ManageNewsPage clickOnNewNewsButton()
	 {
		 newNewsButton.click();
		 return this;
	 }
	 public ManageNewsPage enterNews()
	 {
		 enternews.sendKeys("vote"+gu.generateCurrentDateAndTime()); 
		 return this;
	 }
	 public ManageNewsPage saveNews() 
	 {
		 savebutton.click();
		 return this;
		 
	 }
	 public boolean alertMessage() 
	   {
		   return alertmessage.isDisplayed();
	   }
	 public ManageNewsPage searchNews()
	 {
		 searchNewsButton.click(); 
		 return this;
	 }
	 public ManageNewsPage enterTitle()
	 {
		 newsTitle.sendKeys("voksdote");
		 return this;
		 
	 }
	 public ManageNewsPage clickOnSearchButton()
	 {
		 searchButton.click();
		 return this;
	 }
	 public boolean listNews() 
	   {
		   return searchresult.isDisplayed();
	   }

}
