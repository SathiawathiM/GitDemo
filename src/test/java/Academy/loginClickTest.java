package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.loginPage;
import resources.base;

public class loginClickTest extends base
{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initiate() throws IOException
	{
		driver = initializeDriver();
		
		log.info("Driver is initialized");
	}
	
	@Test(dataProvider="getData")
	public void lgnClk(String user, String pwd) throws IOException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		homePage hp = new homePage(driver);
		hp.clkLogin().click();
		log.info("Successfully clicked on login button");
		
		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys(user);
		lp.getpassword().sendKeys(pwd);
		lp.lgnIn().click();
		
		log.info("Successfully sent the login credentials");
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="hello@abc.com";
		data[0][1]="123";
		
		data[1][0]="hi@xyz.com";
		data[1][1]="789";
		
		return data;
	}
	
	

}
