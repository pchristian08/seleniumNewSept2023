package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage extends basePage{

	
	public productDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtoCart;
	
	@FindBy(className="shopping_cart_link")
	private WebElement cart;
	
	public void clickAddtoCart()
	{
		click(addtoCart,5);
	}
	
	public void clickCart() {
		click(cart,4);
	}
}
