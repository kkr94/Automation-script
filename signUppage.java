package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUppage{
    WebDriver driver;
	public signUppage(WebDriver driver) 
	{
		this.driver=driver;
	    PageFactory.initElements(driver, this);	
	}
	
		@FindBy(xpath="//button[text()='SIGN IN']")
        WebElement btnLoginButton;
		
		@FindBy(xpath="//a[text()='Sign up']")
		WebElement btnSignup;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		WebElement tbFirstname;
	
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement tbLastname;
		
		@FindBy(xpath="//input[@type='Email']")
		WebElement tbEmail;
		
		@FindBy(xpath="//input[@type='Password']")
		WebElement tbPassword;
		
		@FindBy(xpath="//input[@type='date']")
		WebElement tbDOB;
		
		@FindBy(xpath="(//input[@name='gender'])[1]")
		WebElement rbGender;
		
		@FindBy(xpath="//input[@type='number']")
		WebElement tbMobileNumber;
		
		@FindBy(xpath="//textarea[@placeholder='Short Bio']")
		WebElement tbShortBio;
		
		@FindBy(xpath="//button[text()='Register']")
		WebElement btnRegister;
		
		public WebElement clickSignIn()
		{
			return btnLoginButton;	
		}
		
		public WebElement clickSignUp()
		{
			return btnSignup;	
		}
		
		public WebElement getFirstName()
		{
			return tbFirstname ;	
		}
		
		public WebElement getLastName()
		{
			return tbLastname ;	
		}
		
		public WebElement getEmail()
		{
			return tbEmail ;	
		}
		
		public WebElement getPassword()
		{
			return tbPassword ;	
		}
		
		public WebElement getDOB()
		{
			return tbDOB ;	
		}
		
		public WebElement getGender()
		{
			return rbGender ;	
		}
		
		public WebElement getNumber()
		{
			return tbMobileNumber ;	
		}
		
		public WebElement getShortBio()
		{
			return tbShortBio  ;	
		}
		
		public WebElement clickRegister()
		{
			return btnRegister ;	
		}
}
