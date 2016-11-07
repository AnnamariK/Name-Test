package testPackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagePackage.ClearScorePage;

public class ClearScoreCookiesTest {
	
	WebDriver browser;
	String URL = "https://www.clearscore.com/";
	
	ClearScorePage clearscore;
	
	@Before
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
		browser = new FirefoxDriver();
	}
	
	@Given("^ClearScore page open$")
	public void clearscore_page_open() throws Throwable {
		browser.get(URL);  
	}

	@Then("^The cookies notification is present$")
	public void the_cookies_notification_is_present() throws Throwable {
		clearscore = new ClearScorePage(browser);
		Assert.assertTrue("Webelement is not dsiplayed", clearscore.cookieNotification()); //this method verifies that the notification is displayed
	}

	@When("^Customer click the \"([^\"]*)\" button$")
	public void customer_click_the_button() throws Throwable {
		clearscore.clickNoProblem();  
	}

	@Then("^The cookies notification is dismissed$")
	public void the_cookies_notification_is_dismissed() throws Throwable {
		Assert.assertFalse("Webelement is still displayed", clearscore.cookieNotification());   //this method verifies that the notification is dismissed
	}

	@When("^Customer reloads the page$")
	public void customer_reloads_the_page() throws Throwable {
		browser.navigate().refresh();  
	}

	@Then("^The cookies notification does not reappear$")
	public void the_cookies_notification_does_not_reappear() throws Throwable {
		Assert.assertFalse("Webelement is still displayed", clearscore.cookieNotification());  //this method verifies that the notification doesn't reappear after reloading the page 
	}
	
	@Then("^The appropriate cookies were set$")
	public void the_appropriate_cookies_were_set() throws Throwable {    
	Assert.assertTrue("Cookies are not accepted", 
			browser.manage().getCookies().toString().contains("ACCEPT_COOKIES=true"));  //this method verifies that the cookies are accepted
	}
	
	@After
	public void closeBrowser(){
		browser.quit();;
	}

}
