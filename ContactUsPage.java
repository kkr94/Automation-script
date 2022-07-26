package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	WebDriver driver;
	 public ContactUsPage(WebDriver driver)
	 {
		 this.driver=driver;
		    PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
     WebElement ddSupport;
	 
	 @FindBy(xpath="//a[@onclick=\"openPopup()\"]")
     WebElement btnContactUs;
	 
	 @FindBy(xpath="//input[@placeholder=\"Username\"]")
	 WebElement tbUserName;
	 
	 @FindBy(xpath="//input[@placeholder=\"Email\"]")
	 WebElement tbEmail;
	 
	 @FindBy(xpath="//input[@placeholder=\"Phone\"]")
	 WebElement tbPhone;
	 
	 @FindBy(xpath="//textarea[@name=\"message\"]")
	 WebElement tbMessage;
	 
	 @FindBy(xpath="//input[@value=\"Send\"]")
	 WebElement btnSend;
	 
	 
	 
	 public WebElement clickSupport()
		{
			return ddSupport ;	
		}
	 public WebElement clickContactUs()
		{
			return btnContactUs ;	
		}
	 public WebElement GetUserName()
	    {
	        return tbUserName ;
	    }
	 public WebElement GetEmail()
	    {
	        return tbEmail ;
	    }
	 public WebElement GetPhone() 
	    {
	        return tbPhone;
	    }
	 public WebElement GetMessage()
	    {
	        return tbMessage ;
	    }
	 public WebElement ClickSend() 
	    {
	        return btnSend;
	    }
	  
}
