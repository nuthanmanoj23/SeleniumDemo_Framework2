package ElementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitialDownloadPage {
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private List<WebElement> addtoCart;

	public List<WebElement> getAddtoCart() {
		return addtoCart;
	}
	
	public DigitialDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}
