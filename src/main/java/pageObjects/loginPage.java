package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage 
{
	public WebDriver driver;
	
	By email = By.id("user_email");
	By pwd = By.id("user_password");
	By lgnInBtn = By.xpath("//input[@value='Log In']");
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement lgnIn()
	{
		return driver.findElement(lgnInBtn);
	}
	

}
