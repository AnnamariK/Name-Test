package templateTestPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;

public class MooInterview {
	
	@FindBy (id= "33") private WebElement whatever;
	
	WebDriver browser;
	
	@Before
	public void openBrowser(){
		browser = new FirefoxDriver();
	}
	
	@Test
	public void mooWhatever() {
		browser.get("www.Moo.com");//open the page
		new Select(browser.findElement(By.id("WebelementDropdown"))).selectByValue("1");//do the select
		
		
		
		
		
	}

}
