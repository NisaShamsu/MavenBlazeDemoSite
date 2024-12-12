package testCases;
import org.testng.annotations.Test;

import PageObjects.BlazeLoginPage;
import testBase.BaseBlazePage;

public class BlazeLoginTest extends BaseBlazePage
{
	
	@Test
	public void testLogin() 
	{
		BlazeLoginPage login= new BlazeLoginPage(driver);
		login.linkLogin();
		login.emailLogin("nisa@gmail.com");
		login.paswdLogin("nisa123#");
		login.checkRemember();
		login.clickLogin();
	}	
}
