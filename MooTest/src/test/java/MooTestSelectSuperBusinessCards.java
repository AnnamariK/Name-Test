import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MooTestSelectSuperBusinessCards {
	
	WebDriver browser;
	
	@Before
	public void openBrowser() {
		browser = new ChromeDriver();
				
	}

	@Test
	public void superBusinessCard() {
		browser.get("https://www.moo.com/uk/");
		
		
	}
		
}
