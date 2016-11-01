package pagePackage;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class AllUpdates {
	
	WebDriver browser;
	String title= "Dashboard - Junifer Knowledge Base";

	public AllUpdates(WebDriver browser) {
		Assert.assertEquals(title, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}

}
