package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.cartPage;
import Pages.checkoutOverviewPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.productDetailsPage;
import Pages.productsPage;
import utils.ReadData;

public class Tests extends baseTest{
	
	@Test
	public void shopping() throws IOException
	{
		loginPage lp = new loginPage(driver);
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		cartPage cp = new cartPage(driver);
		infoPage ip = new infoPage(driver);
		checkoutOverviewPage op = new checkoutOverviewPage(driver);
		completePage comp = new completePage(driver);
		
		lp.enterUsername(new ReadData().getUsername());
		lp.enterPassword(new ReadData().getPassword());
		lp.clickLogin();
		
		pp.clickBagPack();
		String price = pp.getPrice();
		System.out.println(price);
		
		pdp.clickAddtoCart();
		pdp.clickCart();
		
		cp.clickCheckout();
		
		ReadData rd = new ReadData();
		ip.enterDetail(rd.getfirstName(), rd.getlastName(), rd.getzipCode());
		
		op.clickFinish();
		
		String s = comp.getHeader();
		System.out.println(s);
		
		Assert.assertEquals(s, "Thank you for your order!");
		
	}
	
}
