package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
public static WebDriver launchChrome()
{
	System.setProperty("webdriver.chrome.driver",
			"D:\\apurv\\selenium db\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
					 return driver;
}
public static WebDriver launchMozila()
{
	System.setProperty("webdriver.gecko.driver",
			"\"D:\\apurv\\selenium db\\geckodriver.exe\"");
					 WebDriver driver = new FirefoxDriver();
					 return driver;
}
}
