package scripts;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generics.Basetest;
import pages.ContactUsPage;

public class MWcontactUs extends Basetest{
	
	@Test(dataProvider="get")
	public void contactUs(String un, String el, String ph, String msg) 
	{
		ContactUsPage cu=new ContactUsPage(driver);
		cu.clickSupport().click();
		cu.clickContactUs().click();
		
		Set<String> window= driver.getWindowHandles();
        Iterator<String>it = window.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        cu.GetUserName().sendKeys(un);
        cu.GetEmail().sendKeys(el);
        cu.GetPhone().sendKeys(ph);
        cu.GetMessage().sendKeys(msg);
        cu.ClickSend().click();
	}
	
	@DataProvider(name="get")
    public Object[][] getData()
	{
        Object[][] data=new Object[3][4];

        data[0][0]="Kiran";
        data[0][1]="Kirangmysuru@gmail.com";
        data[0][2]="8892926361";
        data[0][3]="hi this is kiran";
        
        data[1][0]="preetham";
        data[1][1]="Preethammysuru@gmail.com";
        data[1][2]="9036191191";
        data[1][3]="hi this is preetham";

        data[2][0]="chandan";
        data[2][1]="chandanhamse@gmail.com";
        data[2][2]="8088335169";
        data[2][3]="hi this is chandan";

        return data;
    }

}
