package templatePagePackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTemplateSummaryPage {
	WebDriver browser;
	String title = "TitleSummaryPage";
	
	@FindBy (id= "valueToReturn") private WebElement balance;
	@FindBy (id= "signOutButton") private WebElement signOut;
	
	public MyTemplateSummaryPage(WebDriver browser){
		Assert.assertEquals(title, browser.getTitle());//Assert page first, so it wont make any extra actions
		this.browser = browser;		
		PageFactory .initElements(browser, this);
		
	}
	
	public String getBalance() {
		return balance.getText();
		
	}
	public void typeFirstName(String firstname){
		browser.findElement(By.id("webelementValueByID")).sendKeys(firstname); 
		//can find the webelement straight in the method and add method 
		
	}
	
	public MyTemplateLoginClass clickSignOut() {
		signOut.click();
		return new MyTemplateLoginClass(browser);
	}
			

}
