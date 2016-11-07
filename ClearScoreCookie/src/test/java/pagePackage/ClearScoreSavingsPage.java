package pagePackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearScoreSavingsPage {
	
	WebDriver browser;
	String title = "";
	
	@FindBy (css="input[class = 'cs-scalc__range-slider__input mdl-slider js-range-current']") private WebElement currentRangeSlider;
	@FindBy () private WebElement goalRangeSlider;
	
	public ClearScoreSavingsPage(WebDriver browser){
		Assert.assertEquals(title, browser.getTitle());
		PageFactory.initElements(browser, this);	
	}
	public void setCurrentValues() {
		Actions action = new Actions(browser); 
		action.dragAndDropBy(currentRangeSlider, 0, 10);
	}
	
	

}
