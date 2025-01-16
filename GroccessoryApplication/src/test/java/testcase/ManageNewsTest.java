package testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;


public class ManageNewsTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageNewsPage mnp;
  @Test
  public void verifyIfUserIsAbleToCreateNewValidNews() throws IOException
  {
	  lp=new LoginPage(driver);
		hp= lp.loginByUsingExceldata();
		mnp= hp.clickOnManageNewsButton().clickOnNewNewsButton().enterNews().saveNews();
		 boolean actualresult=mnp.alertMessage();
			boolean expectedresult=true;
			Assert.assertEquals(expectedresult, actualresult,Constant.mnp_managenews);
  }
  
  @Test
  public void verifyIfUserIsAbleToSearchInvalidNews() throws IOException
  {
	  lp=new LoginPage(driver);
	   hp=lp.loginByUsingExceldata();
	   mnp=hp.clickOnManageNewsButton().searchNews().enterTitle().clickOnSearchButton();
		 boolean actualresult=mnp.listNews();
			boolean expectedresult=true;
			Assert.assertEquals(expectedresult, actualresult,Constant.mnp_searchnews);
 }
  
  
}
