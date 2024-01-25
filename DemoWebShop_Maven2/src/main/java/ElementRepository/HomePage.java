package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterLink;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement LoginLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}
	
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")
	private WebElement DigitalDownload;
	
	public WebElement getDigitalDownload() {
		return DigitalDownload;
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCart;

	public WebElement getShoppingCart() {
		return ShoppingCart;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}