package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RatesetterSummaryPage {
	
	WebDriver browser;
	String titleSummary = "RateSetter";

	@FindBy (id = "ctl00_divMainContent") private WebElement balance;
	@FindBy (id = "ctl00_hlLogout") private WebElement signOut;
	
	
	public RatesetterSummaryPage(WebDriver browser) {
		Assert.assertEquals(titleSummary, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}

	public String getBalance() {
		return balance.getText();
	}
	
	public Boolean getSignOutLink(){
		return signOut.isDisplayed(); //method to check if a webelement is present
	}

	public RatesetterLoginPage clickSignOut() {
		signOut.click();
		return new RatesetterLoginPage(browser);
	}

}
