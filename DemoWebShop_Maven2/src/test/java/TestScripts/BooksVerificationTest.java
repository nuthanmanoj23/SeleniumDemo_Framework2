package TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import GenericLibrary.DataUtility;



public class BooksVerificationTest extends BaseTest {
	@Test(groups = "Integration")
	public void BooksVerify() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		//launching browser 
		DataUtility data = new DataUtility();
		String url = data.getDataFromProperty("url");
		//navigating to URL
		driver.get(url);
		if(driver.getTitle().equals("Demo Web Shop")) {
			System.out.println("sucessfull navigated to demo workshop");
			driver.findElement(By.xpath("//ul[@class=\"top-menu\"]/li//a[contains(text(),'Books')]")).click();
			WebElement prod = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
			prod.click();
			driver.findElement(By.xpath("//input[@value=\"Add to wishlist\"]")).click();
			Thread.sleep(2000);
			
		}
		else {
			System.out.println("failed to navigate to demoworkshop");
		}
		//navigating to Wishlist
		driver.findElement(By.xpath("//span[text()=\"Wishlist\"]")).click();
		if(driver.getTitle().equals("Demo Web Shop. Wishlist")) {
			System.out.println("navigated to wishlist");
		}
		else
		{
			System.out.println("failed to navigate to wishlist");
		}
		//verifying if the product is visible in wishlist 
		
        WebElement productInWishlist = driver.findElement(By.xpath("//td[@class=\"product\"]/a[text()='Fiction EX']"));

        if (productInWishlist.isDisplayed()) {
           
        	driver.findElement(By.xpath("//td[@class=\"remove-from-cart\"]/input[@name=\"removefromcart\"]")).click();
            driver.findElement(By.xpath("//input[@value=\"Update wishlist\"]")).click();
            cu.screenShot(driver, "BooksVerify");
            
        }		
        Thread.sleep(1000);

		
	}

}
