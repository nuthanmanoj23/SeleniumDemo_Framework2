package TestScripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ElementRepository.DigitialDownloadPage;
import ElementRepository.HomePage;
import ElementRepository.ShoppingCartPage;
import GenericLibrary.BaseTest;
import GenericLibrary.DataUtility;

public class DigitialDownlaodsPOMTest extends BaseTest {
	
	@Test
	public void DigitalDown() throws IOException, InterruptedException {
		
		HomePage hp = new HomePage(driver);
		DigitialDownloadPage dd = new DigitialDownloadPage(driver);
		DataUtility du = new DataUtility();
		String url = du.getDataFromProperty("url");
		driver.get(url);
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		Reporter.log("successfully navigated to DemoWebShop");
		hp.getDigitalDownload().click();
		assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads");
		Reporter.log("sucessfully navigated to digital Downlaod");
		Thread.sleep(2000);
		List<WebElement> carts = dd.getAddtoCart();
		for(WebElement cart : carts) {
			Thread.sleep(2000);
			cart.click();
		}
		hp.getShoppingCart().click();
		List<WebElement> checkboxes = sp.getRemovefromCart();
		for(WebElement checkbox:checkboxes) {
			Thread.sleep(2000);
			checkbox.click();
		}
		sp.getUpdateCart().click();
		assertEquals(sp.getMessage().getText(),"Your Shopping Cart is empty!");
		Reporter.log("sucessfully removed all the products from cart");
	}
}
