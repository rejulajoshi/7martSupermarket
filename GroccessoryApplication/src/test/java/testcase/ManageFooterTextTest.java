package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;

public class ManageFooterTextTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageFooterTextPage mfp;
  @Test
  public void verifyIfUserIsAbleToEditFooterTextWithNewValidText() throws IOException 
  {
	  lp=new LoginPage(driver);
		hp= lp.loginByUsingExceldata();
		mfp=hp.clickOnManageFooterTextButton().clickOnEditButton().editAddress().clickOnUpdateButton();
		boolean actualresult=mfp.alertMessage();
		boolean expectedresult=true;
		Assert.assertEquals(expectedresult, actualresult,Constant.mfp_editFooterText);
		
		
  }
}
