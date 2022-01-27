package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Data members or properties
	@FindBy(id="Email")
	private WebElement EmaiIDTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	
	//getters methods
	public WebElement getEmailID() {
		return EmaiIDTextField;
	}

	public WebElement getPassword() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//action methods or business logics or page action
	public void LoginToApp( String EmailID, String Password ) {
		EmaiIDTextField.sendKeys(EmailID);
		PasswordTextField.sendKeys(Password);
		LoginButton.click();
	}
}
