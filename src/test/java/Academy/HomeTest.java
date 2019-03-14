package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.homePage;
import resources.base;


public class HomeTest extends base
{
	@BeforeTest
	public void initiate() throws IOException
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();		
	}
	
	@Test
	public void homePageNavigation() throws IOException 
	{
		
		
		homePage hp = new homePage(driver);
		//System.out.println(hp.FCTxt().getText());
		
		Assert.assertEquals(hp.FCTxt().getText(),"FEATURED COURSES");
		
		
		Assert.assertTrue(hp.getCntct().isDisplayed());
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
	
	

}
