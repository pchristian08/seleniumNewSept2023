package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends basePage{
	// 1. Page Elements 2. Page Action or Element Action 3. Page Factory
	
	
	public loginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="user-name")
	private WebElement Uname;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(name="login-button")
	private WebElement loginBtn;
	
	public void enterUsername(String username)
	{
		enterText(username, Uname);
	}
	
	public void enterPassword(String password)
	{
		enterText(password, pwd);
	}
	
	public void clickLogin()
	{
		click(loginBtn, 3);
	}

}
