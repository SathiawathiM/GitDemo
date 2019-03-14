package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage 
{
	public WebDriver driver;
	
	By loginBtn = By.xpath("//span[text()='Login']");
	By FeaCrsTxt = By.xpath("//h2[text()='Featured Courses']");
	By Cntct = By.xpath("//a[text()='Contact']");
	public homePage(WebDriver driver) 
	{
		this.driver=driver;
	}


	public WebElement clkLogin()
	{
		return driver.findElement(loginBtn);
	}
	
	public WebElement FCTxt()
	{
		return driver.findElement(FeaCrsTxt);
	}
	
	public WebElement getCntct()
	{
		return driver.findElement(Cntct);
	}
		
}
