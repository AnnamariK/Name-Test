package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagePackage.ClearScoreSavingsPage;

public class ClearScoreSavingsTests {
	
	WebDriver browser;
	String URL = "";
	
	ClearScoreSavingsPage savingsPage;
	
	@Before
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
		browser = new FirefoxDriver();
	}
	
	@Given("^ClearScoreSavingsCalculator page open$")
	public void clearscoresavingscalculator_page_open() throws Throwable {
	   browser.get(URL);
	}

	@When("^Customer sets the current score to (\\d+) and the score goal to (\\d+)$")
	public void customer_sets_the_current_score_to_and_the_score_goal_to(int currentScore, int goal) throws Throwable {
		savingsPage = new ClearScoreSavingsPage(browser);
	
	
	}

	@Then("^The Current Average interest rate is (\\d+)\\.(\\d+)%, Annual cost is (\\d+), Credit cards available (\\d+)$")
	public void the_Current_Average_interest_rate_is_Annual_cost_is_Credit_cards_available(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	   
	}

	@Then("^The Score Goal Average interest rate is (\\d+)%, Annual cost is (\\d+), Credit cards available (\\d+)$")
	public void the_Score_Goal_Average_interest_rate_is_Annual_cost_is_Credit_cards_available(int arg1, int arg2, int arg3) throws Throwable {
	    
	}

	@Then("^The Potential Savings are (\\d+)$")
	public void the_Potential_Savings_are(int arg1) throws Throwable {
	    
	}


}
