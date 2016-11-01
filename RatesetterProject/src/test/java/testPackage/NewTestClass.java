package testPackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pagePackage.RatesetterLoginPage;
import pagePackage.RatesetterSummaryPage;

public class NewTestClass {
	
	WebDriver browser;
	String URL = "https://members.ratesetter.com/login.aspx";
	RatesetterLoginPage login;
	RatesetterSummaryPage summary;
	
	@Before
	public void openBrowser(){
		browser = new FirefoxDriver();	
		browser.get(URL);	
	}
	
	@Test
	public void typeUserNameAndPassword (){
		login = new RatesetterLoginPage(browser);
		login.typeUserName("annamari.keskeny@gmail.com");
		login.typePassword("JtE8tRLS");
		summary = login.clickLoginButton();	
		Assert.assertTrue("Sign out link is not displayed", summary.getSignOutLink());
		//that's how i can check if a webelement is present
	}
	
	@After
	public void closeBrowser(){
		browser.quit();
	}
	

}
