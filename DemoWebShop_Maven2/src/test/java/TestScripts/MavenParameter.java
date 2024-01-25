package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameter {
	@Test
	public void testCase() {
		
		String url = System.getProperty("URL");
		String email = System.getProperty("EMAIL");
		String password = System.getProperty("PASSWORD");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}

}
