package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategory;

public class ManageCategoryTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageCategory mc;
  @Test(retryAnalyzer=retry.Retry.class)
	public void newManageCategoryWithValidDetails() throws IOException 
	  {
		  lp=new LoginPage(driver);
			hp= lp.loginByUsingExceldata();
			mc=hp.ClickOnManageCategoryButton().clickOnNewButton().category().selectgroups().uploadFile()
					 .clickShowOnTopMenu().clickOnLeftMenuButton().clickOnSaveButton();
			 boolean actualresult=mc.alertMessage();
			boolean expectedresult=true;
			Assert.assertEquals(expectedresult, actualresult,Constant.mc_manageCategory);
			 
}
  @Test
  public void searchManageCategoryWithInValidDetails() throws IOException 
  {
	  lp=new LoginPage(driver);
		hp= lp.loginByUsingExceldata();
		mc=hp.ClickOnManageCategoryButton().clickOnSearchCategory().searchCategory().clickOnSearch();
		boolean actualresult=mc.searchalertMessage();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.mc_searchCategory);
  }
  
}