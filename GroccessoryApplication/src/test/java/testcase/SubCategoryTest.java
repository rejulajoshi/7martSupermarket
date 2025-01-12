package testcase;

import org.testng.annotations.Test;
import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;
import java.io.IOException;
import org.testng.Assert;


public class SubCategoryTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	SubCategoryPage scp;
  @Test(groups="smoke")
  public void createNewSubCategoryWithValidDetails() throws IOException 
  {
	  lp=new LoginPage(driver);
		hp= lp.loginByUsingExceldata(); 
		scp= hp.clickOnSubCategoryButton().clickOnNewButton().selectCategory().subCategory().uploadFile().clickOnSaveButton();
		 boolean actualresult=scp.alertMessage();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.sc_verifySubCategoryCreated);
		 
  }
  @Test(retryAnalyzer=retry.Retry.class,groups="smoke")
  public void searchSubCategoryWithInValidDetails() throws IOException 
  {
	  lp=new LoginPage(driver);
	hp=lp.loginByUsingExceldata();
		 scp= hp.clickOnSubCategoryButton().searchCategoryClick().searchCategorySelect().searchSubCategorySelect().clickOnSearchButton();
		 boolean actualresult=scp.listSubCategories();
		 boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.sc_searchSubCategory);
  }
 
}
