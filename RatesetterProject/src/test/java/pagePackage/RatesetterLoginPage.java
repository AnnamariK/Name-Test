package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RatesetterLoginPage {
	
	WebDriver browser;
	String title = "RateSetter Login";
	
	@FindBy (id = "ctl00_cphContentArea_cphForm_txtEmail") private WebElement userNameField;
	@FindBy (id = "ctl00_cphContentArea_cphForm_txtPassword") private WebElement passwordField;
	@FindBy (id = "ctl00_cphContentArea_cphForm_btnLogin") private WebElement loginButton;

	public RatesetterLoginPage(WebDriver browser) {
		Assert.assertEquals(title, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
	}

	public void typeUserName(String userName) {
		userNameField.sendKeys(userName);
		
	}

	public void typePassword(String password) {
		passwordField.sendKeys(password);
		
	}

	public RatesetterSummaryPage clickLoginButton() {
		loginButton.click();
		return new RatesetterSummaryPage(browser);
		
	}

}
