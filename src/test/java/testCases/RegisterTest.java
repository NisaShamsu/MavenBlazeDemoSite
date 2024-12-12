package testCases;

import org.testng.annotations.Test;

import PageObjects.RegisterPage;
import testBase.BaseBlazePage;

public class RegisterTest  extends BaseBlazePage 
{

	@Test
	public void testRegister()
	{
		RegisterPage registr=new RegisterPage(driver);
		registr.setName("nisa");
		registr.setCompanyName("Luminar");	
		registr.setEmail("nisa@gmail.com");
		registr.setPassword("nisa123#");
		registr.setConfPassword("nisa123#");
		registr.register();		
	}	
}
