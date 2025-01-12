package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageUsersPage;

public class ManageUsersTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageUsersPage mup;
  @Test
  public void createNewAdminUserWithValidDetails() throws IOException
  {lp=new LoginPage(driver);
	hp= lp.loginByUsingExceldata();
	 
	mup= hp.clickOnAdminUserButton().clickOnNewButton().enterusername().enterPassword().selectUsertype().clickOnSaveButton();
	
	 boolean actualresult=mup.alertMessage();
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.mup_createAdminUser);
	  
  }
  @Test
  public void searchAdminUserWithInvalidUsernameAndUsertype() throws IOException
  {lp=new LoginPage(driver);
	hp= lp.loginByUsingExceldata();
	 
	mup= hp.clickOnAdminUserButton().searchUser().entersearchusername().searchselectUsertype().clickOnSearchButton();
	 boolean actualresult=mup.manageUserslist();
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.mup_searchAdminUser);
	
	  
  }
  @Test
  public void deleteAdminUserBySearch() throws IOException
  {
	  lp=new LoginPage(driver);
		hp= lp.loginByUsingExceldata();
		mup= hp.clickOnAdminUserButton().searchUser().enterUserName().selectusertype().clickOnSearchButton().deleteUser();
		boolean actualresult=mup.deleteUserlist();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.mup_deleteAdminUser);
	  
  }
}
