package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.FileUploadUtility;
import Utilities.GeneralUtility;
import Utilities.WaitUtilities;

public class ManageCategory {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	WaitUtilities wu=new WaitUtilities();
	FileUploadUtility fu=new FileUploadUtility();
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement categorySelect;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectGroups;
	@FindBy(xpath="//input[@id='main_img']")WebElement imageFile;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	@FindBy(xpath="//label[text()='Show On Top Menu']")WebElement topmenuradiobutton;
	@FindBy(xpath="//label[text()='Show On Left Menu']")WebElement leftmenuradiobutton;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement saveButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchcategorybutton;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']")WebElement searchbutton;
	@FindBy(xpath="//center[contains(text(), 'RESULT NOT FOUND')]")WebElement searchresult;
	
	public ManageCategory clickOnNewButton()
	   {
		   newButton.click();
		   return this;
	   }
	 public ManageCategory category()
	   {
		 categorySelect.sendKeys("jewellery"+gu.generateCurrentDateAndTime());
		 return this;
	   }
	 public ManageCategory selectgroups() 
	 {
		 selectGroups.click();
		 
		 return this;
		 
	 }
	 public ManageCategory uploadFile()
	   {
		 fu.fileuploadSendkeys(imageFile);
		 
	    return this;
	   }
	 public ManageCategory clickShowOnTopMenu()
	 {
		gu.scrollToElement(driver, topmenuradiobutton);
		gu.hoverOverElement(driver,topmenuradiobutton);
		 return this;
		 
	 }
	 public ManageCategory clickOnLeftMenuButton()
	 {
		 gu.scrollToElement(driver, leftmenuradiobutton);
		 gu.hoverOverElement(driver,leftmenuradiobutton);
		
		 return this;
	 }
	   public ManageCategory clickOnSaveButton()
	   {
		 //  wu.waitUntilElementIsVisible(driver, saveButton);
		   saveButton.click();
		   return this;
		   
	   }
	   public boolean alertMessage() 
	   {
		   return alertmessage.isDisplayed();
	   }
	   public ManageCategory clickOnSearchCategory()
	   {
		   searchcategorybutton.click();
		   return this;
	   }
	   public ManageCategory searchCategory()
	   {
		 categorySelect.sendKeys("asd");
		 return this;
	   }
	   public ManageCategory clickOnSearch()
	   {
		   searchbutton.click();
		   return this;
	   }
	   public boolean searchalertMessage() 
	   {
		   return searchresult.isDisplayed();
	   }
}
