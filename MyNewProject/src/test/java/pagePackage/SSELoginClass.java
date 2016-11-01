package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SSELoginClass {
	WebDriver browser;
	String title = "Login - Your account";
	
	@FindBy (id = "Email") private WebElement userNameField;
	@FindBy (id = "Password") private WebElement passwordField;
	@FindBy (css = "input [type = 'submit']") private WebElement loginButton;
	
	public SSELoginClass(WebDriver browser) {
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
	
	public SummaryPageClass clickLoginButton() {
		loginButton.click();
		return new SummaryPageClass(browser);
		
	}
}
