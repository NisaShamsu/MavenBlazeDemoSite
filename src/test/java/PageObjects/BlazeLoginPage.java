package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseBlazePage;

public class BlazeLoginPage extends BaseBlazePage
{
	WebDriver driver;
	
	public BlazeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	@FindBy(xpath ="/a[normalize-space()='Login']")
	WebElement lnk_Login;
	//*[@id="app-navbar-collapse"]/ul[2]/li[1]/a
	*/
	@FindBy(xpath ="//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")
	WebElement lnk_Login;
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement txt_Password;
	
	@FindBy(xpath ="//input[@name='remember']")
	WebElement chk_Remember;
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	WebElement btn_Login;
	
	public void linkLogin()
	{
		lnk_Login.click();     
	}
	public void emailLogin(String email)
	{
		txt_Email.sendKeys(email);   
	}
	public void paswdLogin(String pswd)
	{
		txt_Password.sendKeys(pswd);	     
	}
		
	public void checkRemember()
	{
		chk_Remember.click();    
	}
	public void clickLogin()
	{
		btn_Login.click();    
	}
	     //input[@id='email']
		//input[@id='password']
		//input[@name='remember']
		//button[normalize-space()='Login']   button
		//a[normalize-space()='Login']    link

}
