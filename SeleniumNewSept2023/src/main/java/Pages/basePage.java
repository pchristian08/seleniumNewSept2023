package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver;
	public basePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementVisibility(WebElement e, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));  //Explicit wait
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void enterText(String text, WebElement e)
	{
		waitForElementVisibility(e, 5);
		e.sendKeys(text);
	}
	
	public void click(WebElement e, int time)
	{
		waitForElementVisibility(e, time);
		e.click();
	}
	
	public void selectByVisibleText(String text, WebElement e)
	{
		Select sel = new Select(e);
		sel.selectByVisibleText(text);
	}
	
	public String getVisibleText(WebElement e)
	{
		waitForElementVisibility(e, 5);
		return e.getText();
	}

}
