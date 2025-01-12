package testcase;

import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.DataProvider;
import java.io.IOException;
import org.testng.Assert;


public class LoginTest extends BaseClass {
	LoginPage login;
	HomePage home;
  @Test
  public void verifyUserLoginWithValidCredentials() throws IOException 
  {
	   login=new LoginPage(driver);
	   home=login.loginByUsingExceldata();
	boolean actualresult=login.isHomepageIsloaded();
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.lp_verifyLoginWithVaildCredenials);
  }
  @Test(dataProvider="data provider")
  public void verifyUserLoginWithInValidUserNameValidPassword( String username,String password) 
  {
	   login=new LoginPage(driver);
	   login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickonSubmit();
	boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.lp_verifyLoginWithInvalidCredentials);
  }
  @DataProvider(name="data provider")
  public Object[][] dppmethod()
  {
	  return new Object[][] {{"abc","admin"},{"ad2","admin"},{"adm3","admin"}};
  }
  @Test
  public void verifyUserLoginWithValidUsernameAndInvalidPassword() 
  {
	   login=new LoginPage(driver);
	  String username="admin";
	  String password="xyz";
	  login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickonSubmit();
	boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.lp_verifyLoginWithInvalidCredentials);
  }
  @Test
  public void verifyUserLoginWithInValidUsernameAndInvalidPassword() 
  {
	   login=new LoginPage(driver);
	  String username="adc";
	  String password="xyz";
	  login.enterUsername(username);
	  login.enterPassword(password);
	  login.clickonSubmit();
	boolean actualresult=login.getAlert().contains("Invalid Username/Password");
	boolean expectedresult=true;
	Assert.assertEquals(expectedresult, actualresult,Constant.lp_verifyLoginWithInvalidCredentials);
  }
  
}
