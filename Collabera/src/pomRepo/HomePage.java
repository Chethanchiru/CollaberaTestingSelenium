package pomRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 
	//constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Data members or attributes
	@FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	private WebElement JewelryLink;
	
	@FindBy(xpath="(//input[@value='Add to cart'])[2]")
	private WebElement AddTOCartButton;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement ShoppingCartLink;
	
	@FindBy(xpath="//input[@name='removefromcart']")
	private WebElement RemoveFromCartCheckBox;

	//getters methods
	public WebElement getJewelryLink() {
		return JewelryLink;
	}

	public WebElement getAddTOCartButton() {
		return AddTOCartButton;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	public WebElement getRemoveFromCartCheckBox() {
		return RemoveFromCartCheckBox;
	}
	
	//action methods or business logics or page action
	public void homePageApp() {
		JewelryLink.click();
		AddTOCartButton.click();
		ShoppingCartLink.click();
		RemoveFromCartCheckBox.click();
	}
	

}
