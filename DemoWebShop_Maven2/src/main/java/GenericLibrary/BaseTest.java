package GenericLibrary;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	public static WebDriver listernersDriver;
	public CommonUtility cu = new CommonUtility();
	public WebDriver driver;
	@Parameters("Browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("Chrome")String browserName) {
		if(browserName.equals("Chrome")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		}
		else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("wrong browser selected");
		}
		listernersDriver = driver;   // initializing the driver 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass(alwaysRun = true)
	public void CloseBrowser() {
		driver.close();
		
	}
}
