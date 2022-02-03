package Guru99_BankTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BasePack.Base;
import POMGuru99.HomePage;
import POMGuru99.LoginPage;
public class LoginPageTest extends Base
{   private static WebDriver driver;
	private LoginPage loginpage;
	private HomePage homePage;
	/*ReadConfig readConfig = new ReadConfig();
	public String urL = readConfig.getURL();
	public String username = readConfig.getuserID();
	public String passWord = readConfig.getPassword();*/
	@BeforeTest
	@Parameters("browser")
	
	
	public void launchBrowser(String browser) 
	
	
	{
		if(browser.equals("chrome"))
		driver = launchChrome();
		
	if(browser.equals("firefox"))
		driver= launchMozila();
	}
	
	
	
	
	
	
	@BeforeClass
	public void initializePOMclasses() 
	{loginpage = new LoginPage(driver);
		 homePage = new HomePage(driver);}
	@BeforeMethod
	public void lauchURL() throws InterruptedException 
	{   Thread.sleep(3000);
		driver.get("https://demo.guru99.com/v4/index.php");
	}
	@Test
	public void loginWithCorrectCredentials()
	{   loginpage.clickResetButton();
		loginpage.enterID();
		loginpage.enterPassword();
		loginpage.clickLoginButton();
		if(driver.getCurrentUrl().equals
				("https://demo.guru99.com/v4/manager/Managerhomepage.php"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);		
	}
	@AfterMethod
	public void logOut() throws InterruptedException
	{    homePage.clickLogoutButton();
		Thread.sleep(3000);
	}
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}

}
