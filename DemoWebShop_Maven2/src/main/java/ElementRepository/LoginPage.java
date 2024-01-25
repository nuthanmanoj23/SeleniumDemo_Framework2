package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="Email")
	private WebElement LoginTextField;
	@FindBy(name="Password")
	private WebElement PasswordTextField;
	@FindBy(css="[value='Log in']")
	private WebElement LoginButton;
	public WebElement getLoginTextField() {
		return LoginTextField;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
