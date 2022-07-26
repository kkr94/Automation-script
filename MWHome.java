package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generics.Basetest;
import pages.HomePage;

public class MWHome extends Basetest{

	@Test
	public void home() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		hp.clickHome().click();
		js.executeScript("window.history.go(-1)");
		List<WebElement> a=driver.findElements(By.xpath("//a[text()=\"More Details\"]"));
        for(int i=0;i<=8;) {
            a.get(i).click();
            Thread.sleep(2000);
            js.executeScript("window.history.go(-1)");
            Thread.sleep(2000);
            i++;
            Basetest.actionUtil.validateTitle("Mobile");
	}
}
}
