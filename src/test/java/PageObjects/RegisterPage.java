package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.BaseBlazePage;

public class RegisterPage extends BaseBlazePage
{
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath ="//input[@id='name']")
	WebElement txt_Name;
		
	@FindBy(xpath ="//input[@id='company']")
	WebElement txt_Company;
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement txt_Password;
	
	@FindBy(xpath ="//input[@id='password-confirm']")
	WebElement txt_ConfirmPassword;
			
	@FindBy(xpath ="//button[normalize-space()='Register']")
	WebElement btnRegister;
		
	public void setName(String fname)
	{
		txt_Name.sendKeys(fname);
	}
	
	public void setCompanyName(String lname)
	{
		txt_Company.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_Email.sendKeys(email);
	}
	
	public void setPassword(String paswd)
	{
		txt_Password.sendKeys(paswd);
	}
	
	public void setConfPassword(String confpaswd)
	{
		txt_ConfirmPassword.sendKeys(confpaswd);
	}	
	public void register()
	{
		btnRegister.click();			
	}

}
