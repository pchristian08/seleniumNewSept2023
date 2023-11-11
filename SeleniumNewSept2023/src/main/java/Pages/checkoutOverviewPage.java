package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutOverviewPage extends basePage{
	
	
	public checkoutOverviewPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id = "finish")
	private WebElement finish;
	
	public void clickFinish()
	{
		click(finish,5);
	}

}
