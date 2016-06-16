package testPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagePackage.RatesetterLoginPage;
import pagePackage.RatesetterSummaryPage;

public class RatesetterTestClass {
	
	WebDriver browser;
	String URL = "https://members.ratesetter.com/login.aspx";
	RatesetterLoginPage login;
	RatesetterSummaryPage summary;
	
	
	@Before
	public void openBrowser() {
	browser = new FirefoxDriver();
	
	}
	
	@Given("^Ratesetter login page open$")
	public void ratesetter_login_page_open() throws Throwable {
		browser.get(URL);
	
	}

	@When("^I type my login username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void i_type_my_login_username_password(String userName, String password) throws Throwable {
	   login = new RatesetterLoginPage(browser);
	   login.typeUserName (userName);
	   login.typePassword (password);
	   summary = login.clickLoginButton ();
	   
	}

	@Then("^Then my balance will be \"([^\"]*)\"$")
	public void then_my_balance_will_be(String expectedBalance) throws Throwable {
		Assert.assertEquals(expectedBalance, summary.getBalance());
		login = summary.clickSignOut();
		
	    
	}
	
	@After
	public void closeBrowser(){
	browser.quit();
	
	}



}
