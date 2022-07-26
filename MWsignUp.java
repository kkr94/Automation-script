package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generics.Basetest;
import pages.signUppage;

public class MWsignUp extends Basetest {
	
	@Test(dataProvider="getData")
	public void signUp(String fn,String ln,String el,String pw, String db,String num,String sb ) throws InterruptedException
	{
		signUppage su = new signUppage(driver);
		su.clickSignIn().click();
		su.clickSignUp().click();
		su.getFirstName().sendKeys(fn);
		su.getLastName().sendKeys(ln);
		su.getEmail().sendKeys(el);
		su.getPassword().sendKeys(pw);
		su.getDOB().sendKeys(db);
		su.getGender().click();
		su.getNumber().sendKeys(num);
		su.getShortBio().sendKeys(sb);
		su.clickRegister().click();
		Thread.sleep(3000);
		String msg=driver.switchTo().alert().getText();
		Assert.assertEquals(msg, "Hai,"+fn+"! Go To SingIn");
		driver.switchTo().alert().accept();
		
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][7];
		
		data[0][0]="kiran";
		data[0][1]="kumar";
		data[0][2]="kirangmysuru@gmail.com";
		data[0][3]="kiran@1";
		data[0][4]="20/11/1994";
		data[0][5]="8892926361";
		data[0][6]="hi this is kiran";
		return data;
		
	}
	
	}

