package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Basetest;


public class LoginPage {

	WebDriver driver;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		    PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//button[text()='SIGN IN']")
	 WebElement btnLoginButton;
	 
	 @FindBy(xpath="//input[@id='username']")
	 WebElement tbUserName;
	 
	 @FindBy(xpath="//input[@name='password']")
	 WebElement tbPassword;
	 
	 @FindBy(xpath="//label[text()='Remember me?']")
	 WebElement cbRememberme;
	 
	 @FindBy(xpath="//a[@type='submit']")
	 WebElement btnLogIn;
	 
	 public WebElement clickSignIn()
		{
			return btnLoginButton;	
		}
	 
	 public WebElement getUserName()
		{
			return tbUserName ;	
		}
	 
	 public WebElement getPassword()
		{
			return tbPassword ;	
		}
	 
	 public WebElement clickRememberMe()
		{
			return cbRememberme ;	
		}
	 
	 public WebElement clickLogIn()
		{
			return btnLogIn ;	
		}
	  
}
