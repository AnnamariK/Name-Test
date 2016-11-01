package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPageClass {
	WebDriver browser;
	String summaryTitle = "Your products";
	
	@FindBy (css = "span [class = 'currentBalance']") private WebElement balance;
	@FindBy (css = "class [title = 'Logout - Your account']") private WebElement signOut;

	public SummaryPageClass(WebDriver browser) {
		Assert.assertEquals(summaryTitle, browser.getTitle());
		this.browser = browser;		
		PageFactory.initElements(browser, this);
		
	}
	
	public String getBalance(){
		return balance.getText();
	}
	
	public SSELoginClass clickSignOut(){
		signOut.click();
		return new SSELoginClass(browser);
		
	}

}
