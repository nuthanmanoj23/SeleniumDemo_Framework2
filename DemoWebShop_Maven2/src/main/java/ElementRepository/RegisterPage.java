package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	@FindBy(name = "FirstName")
	private WebElement firstNameTextField;
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastNameTextField;
	@FindBy(css="[id='Email']")
	private WebElement emailTextField;
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Password")
	private WebElement passwordTextField;
	@FindBy(name="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	@FindBy(name="register-button")
	private WebElement registerButton;
	
	
}
