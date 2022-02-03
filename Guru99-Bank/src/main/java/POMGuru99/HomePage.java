package POMGuru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{@SuppressWarnings("unused")
private WebDriver driver;
   @FindBy (xpath ="//a[@href='Logout.php']")
   private WebElement logoutButton;
   
   public HomePage(WebDriver driver)
   { 
	   PageFactory.initElements(driver,this);
	   
   }
   public void clickLogoutButton()
   {
	   logoutButton.click();
   }
}
