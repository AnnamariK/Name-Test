package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearScorePage {
	
	
	private String title = "Free Credit Scores | Credit Reports | Free Credit Check UK";
	
	@FindBy (css = "div[class = 'grid-12 grid-m-7']") private WebElement cookiesNotification;
	@FindBy (css = "span[class = 'accept-cookies btn-primary accept-btn']") private WebElement noProblemButton;
	
	public ClearScorePage(WebDriver browser){
		Assert.assertEquals(title, browser.getTitle());
		PageFactory.initElements(browser, this);	
	}
		
	public boolean cookieNotification(){
		return cookiesNotification.isDisplayed();
	}
	
	public void clickNoProblem(){
		noProblemButton.click();			
	}
}
