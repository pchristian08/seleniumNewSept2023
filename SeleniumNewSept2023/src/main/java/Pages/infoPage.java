package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage extends basePage{
	
	WebDriver driver;
	public infoPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="first-name")
	private WebElement fname;
	
	@FindBy(id="last-name")
	private WebElement lname;
	
	@FindBy(id="postal-code")
	private WebElement pcode;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public void enterDetail(String firstName, String lastName, String postalCode)
	{
		enterText(firstName,fname);
		enterText(lastName,lname);
		enterText(postalCode,pcode);
		click(cont,2);
	}
	
	
}
