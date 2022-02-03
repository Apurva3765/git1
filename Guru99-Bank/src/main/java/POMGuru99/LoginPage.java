package POMGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ReadConfig;

public class LoginPage 
{  WebDriver driver;

	@FindBy (xpath ="//input[@type='text']")
	private WebElement userID;
	
	@FindBy (xpath ="//input[@type='password']")
	private WebElement passWord;
	
	@FindBy (xpath ="//input[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath ="//input[@type='reset']")
	private WebElement resetButton;
	
	@FindBy (xpath ="//label[@id='message23']")
	private WebElement errormsg1;
	
	@FindBy (xpath ="//label[@id='message18']")
	private WebElement errormsg2;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void enterID() 
	{
		userID.sendKeys("mngr384102");
	}
	
	public void enterPassword()
	{
		passWord.sendKeys("egAhuvu");
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public void clickResetButton()
	{
		if(resetButton.isDisplayed())
			{
			System.out.println("reset button displayed");
			resetButton.click();
			}
		else
		    {
			System.out.println("reset button not found");
			
			}
			
	}
	
	
	
	
	

}
