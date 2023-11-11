package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage extends basePage{
	// 1. Page Elements 2. Page Action or Element Action
	
	
	public productsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="item_4_title_link")
	private WebElement bagpack;
	
	@FindBy(xpath="//div[text()='29.99']")
	WebElement bagpackPrice;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtoCart;
	
	public void clickBagPack()
	{
		click(bagpack, 5);
	}
	
	public void clickAddtoCart()
	{
		click(addtoCart, 3);
	}
	
	public String getPrice()
	{
		return getVisibleText(bagpackPrice);
	}
}
