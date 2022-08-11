package Main.Test;

import WebPage_Identifier.Identifier;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.sql.ResultSet;

import WebPage_Element.Element;

public class Main_Test {
	private Identifier ID = null;
	private Element EL = null;
	private Properties Props = null;
	public WebDriver driver;
	
	//@BeforeTest(alwaysRun = true)
	public void launchbrowser() throws Exception{
		System.getProperty("Webdriver.chrome.driver", "C:\\Users\\812163\\workspace\\NybulaAssessment\\src\\test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = Driver.setDriver(Props.getProperty("browser"))
		 driver.get(Props.getProperty("https://nbl.one/listings"));
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html

	}

}
