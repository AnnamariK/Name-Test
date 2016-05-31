package templateTestPackage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import templatePagePackage.MyTemplateLoginClass;
import templatePagePackage.MyTemplateSummaryPage;

public class MyTestClassTemplate {

	String URL = "https//example URL";
	WebDriver browser;
	MyTemplateSummaryPage summary;
	
	
	
	@Before	
	public void testMethod() {  //first thing to instantiate the class to open the browser
		browser = new FirefoxDriver();	
		
	}
	
	@Given("^This is the given method$") 
	public void this_is_the_given_method() throws Throwable {
		browser.get(URL); // open the website	    
	}

	@When("^This is the when method login username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void this_is_the_when_method_login_username_password(String username, String password) throws Throwable {
		MyTemplateLoginClass   login = new MyTemplateLoginClass(browser);
		login.typeUserName(username);
		login.typePassword(password);
		summary = login.clickLoginButton();	    
	}

	@Then("^This is the then method my balance will be \"([^\"]*)\"$")
	public void this_is_the_then_method_my_balance_will_be(String expectedBalance) throws Throwable {		
	   Assert.assertEquals(expectedBalance, summary.getBalance());
	   
	   MyTemplateLoginClass mtp = new MyTemplateLoginClass(browser);
	   mtp = summary.clickSignOut();
	   
	}
	
	@After
	public void closeBrowser(){
		browser.quit();
	}

}
