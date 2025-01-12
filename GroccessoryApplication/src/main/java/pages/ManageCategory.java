package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtility;

public class ManageCategory {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public ManageCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//input[@class='form-control']")WebElement categorySelect;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectGroups;
	@FindBy(xpath="//input[@id='main_img']")WebElement imageFile;
	@FindBy(xpath="//button[@name='create']")WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	@FindBy(xpath=" //input[@value='yes' and @name='top_menu']")WebElement topmenuradionbutton;
	@FindBy(xpath=" //input[@value='yes' and @name='show_home']")WebElement leftmenuradiobutton;
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
		 categorySelect.sendKeys("jewellery");
		 return this;
	   }
	 public ManageCategory selectgroups() 
	 {
		 selectGroups.click();
		 return this;
		 
	 }
	 public ManageCategory uploadFile()
	   {
		   imageFile.sendKeys("C:\\Users\\nkrej\\OneDrive\\Desktop\\Screenshot 2024-12-25 082555.png");
		   gu.scrollbottompage();
	    return this;
	   }
	 public ManageCategory clickShowOnTopMenu()
	 {
		 gu.selectRadioButton(topmenuradionbutton);
		 return this;
		 
	 }
	 public ManageCategory clickOnLeftMenuButton()
	 {
		 gu.selectRadioButton(leftmenuradiobutton); 
		 return this;
	 }
	   public ManageCategory clickOnSaveButton()
	   {
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
