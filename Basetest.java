package generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basetest {

	public static final String chromeKey="webdriver.chrome.driver";
	public static final String chromeValue="./drivers/chromedriver.exe";
	
	public static webActionUtil actionUtil;
	public WebDriver driver;
	
	@BeforeClass
	public void setPath()
	{
		System.setProperty(chromeKey, chromeValue);
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
	  driver=new ChromeDriver();
	  actionUtil=new webActionUtil(driver);
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://mobileworld.azurewebsites.net/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
