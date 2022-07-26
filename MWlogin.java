package scripts;

import org.testng.annotations.Test;

import generics.Basetest;
import pages.LoginPage;

public class MWlogin extends Basetest{
	
	@Test
	public void login() throws InterruptedException
	{
		LoginPage ln = new LoginPage(driver);
		ln.clickSignIn().click();
		ln.getUserName().sendKeys("kiran kumar");
		ln.getPassword().sendKeys("kiran@1");
		ln.clickRememberMe().click();
		ln.clickLogIn().click();
		Thread.sleep(5000);
		Basetest.actionUtil.validateTitle("Mobile");
	}

}
