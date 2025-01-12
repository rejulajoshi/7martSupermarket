package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.GeneralUtility;

public class SubCategoryPage {
	public WebDriver driver;
	GeneralUtility gu=new GeneralUtility();
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Sub Category']")WebElement subCategoryButton;
	@FindBy(xpath="//h1[text()='List Sub Categories']")WebElement subCategoryText;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newButton;
	@FindBy(xpath="//h1[text()='Add Sub Category']")WebElement addSubCategoryText;
	@FindBy(xpath="//select[@id='cat_id']")WebElement categorySelect;
	@FindBy(xpath="//input[@id='subcategory']")WebElement subCategoryName;
	@FindBy(xpath="//input[@id='main_img']")WebElement imageFile;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertDisplayed;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchButton;
	@FindBy(xpath="//select[@id='un']")WebElement searchCategory;
	@FindBy(xpath="//input[@name='ut']")WebElement searchSubCategory;
	@FindBy(xpath="//button[@type='submit']")WebElement searchSubmitButton;
	@FindBy(xpath="//center[contains(text(), 'RESULT NOT FOUND')]")WebElement searchresult;
	public String getAlert()
	{
		return subCategoryText.getText();
	}
   public SubCategoryPage clickOnNewButton()
   {
	   newButton.click();
	   return this;
   }
   public SubCategoryPage selectCategory()
   {
	   gu.selectDropdownWithIndex(categorySelect, 8);
	   return this;
	   
	   }
   public SubCategoryPage subCategory()
   {
	   subCategoryName.sendKeys("nosepin"+gu.generateCurrentDateAndTime());
	   return this;
   }
   public SubCategoryPage uploadFile()
   {
	   imageFile.sendKeys("C:\\Users\\nkrej\\OneDrive\\Desktop\\Screenshot 2024-12-25 082555.png");
	   return this;
   }
   public SubCategoryPage clickOnSaveButton()
   {
	   saveButton.click();
	   return this;
	   
   }
   public boolean alertMessage() 
   {
	   return alertDisplayed.isDisplayed();
   }
   public SubCategoryPage searchCategoryClick()
   {
	   searchButton.click();
	   return this;
	   
   }
   public SubCategoryPage searchCategorySelect() 
   {
	   gu.selectDropdownWithIndex(searchresult,5);
	   return this;
   }
   public SubCategoryPage searchSubCategorySelect()
   {
	   searchSubCategory.sendKeys("asdf");
	   return this;
   }
   public SubCategoryPage clickOnSearchButton()
   {
	   searchSubmitButton.click();
	   return this;
	   
   }
   public boolean listSubCategories() 
   {
	   return searchresult.isDisplayed();
   }
}
