package testPackage;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagePackage.SSELoginClass;
import pagePackage.SummaryPageClass;

public class SSETestClass {
	
	WebDriver browser;
	String URL = "https://my.sse.co.uk/your-account/login";
	SSELoginClass login;
	SummaryPageClass summary;
	
	@Before
	public void openBrowser(){
		browser = new FirefoxDriver();	
		
	}
	
	@Given("^SSE login page open$")
	public void sse_login_page_open() throws Throwable {
		browser.getCurrentUrl();	    
	}

	@When("^I login username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void i_login_username_password(String userName, String password) throws Throwable {
		login = new SSELoginClass (browser);
		login.typeUserName(userName);
		login.typePassword(password);
		summary = login.clickLoginButton();
	   
	}

	@Then("^My balance will be \"([^\"]*)\"$")
	public void my_balance_will_be(String balance) throws Throwable {
		Assert.assertEquals(balance, summary.getBalance());
		login = summary.clickSignOut(); 
	}


	@After
	public void closeBrowser(){
		browser.quit();
		
	}
}
