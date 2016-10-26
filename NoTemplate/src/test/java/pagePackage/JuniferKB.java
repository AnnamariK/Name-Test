package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class JuniferKB {
	
	WebDriver browser;
	String title= "Log In - Junifer Knowledge Base";
	
	@FindBy (id= "os_username") private WebElement usernameField;
	@FindBy (id= "os_password") private WebElement passwordField;
	@FindBy (id= "loginButton") private WebElement loginButton;

	public JuniferKB(WebDriver browser) {
		Assert.assertEquals(title, browser.getTitle());
		this.browser = browser;
		PageFactory.initElements(browser, this);
		
		
	}

	public void enterUsename(String userName) {
		usernameField.sendKeys(userName);		
				
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
		
		
	}

	public AllUpdates clickLogin() {
		loginButton.click();		
		return new AllUpdates(browser);
	}

}
