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
  public void verifyIfUserIsAbleToCreateNewAdminUserWithValidDetails() throws IOException
  {lp=new LoginPage(driver);
	hp= lp.loginByUsingExceldata();
	 
	mup= hp.clickOnAdminUserButton().clickOnNewButton().enterusername().enterPassword().selectUsertype().clickOnSaveButton();
	
	 boolean actualresult=mup.alertMessage();
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.mup_createAdminUser);
	  
  }
  @Test
  public void verifyIfUserIsAbleToSearchAdminUserWithInvalidUsernameAndUsertype() throws IOException
  {lp=new LoginPage(driver);
	hp= lp.loginByUsingExceldata();
	 
	mup= hp.clickOnAdminUserButton().searchUser().entersearchusername().searchselectUsertype().clickOnSearchButton();
	 boolean actualresult=mup.manageUserslist();
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.mup_searchAdminUser);
	
	  
  }
 
}
