package ElementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	@FindBy(xpath="//input[@name='removefromcart']")
	private List<WebElement> removefromCart;

	public List<WebElement> getRemovefromCart() {
		return removefromCart;
	}
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement updateCart;
	
	public WebElement getUpdateCart() {
		return updateCart;
	}
	@FindBy(xpath = "//div[contains(text(),'Your Shopping Cart is empty!')]")
	private WebElement message;
	
	public WebElement getMessage() {
		return message;
	}
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
