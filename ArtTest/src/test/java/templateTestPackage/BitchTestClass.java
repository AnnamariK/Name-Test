package templateTestPackage;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BitchTestClass {
	
	String name;
	String actualAnswer;
	
	@Given("^My name is \"([^\"]*)\"$")
	public void my_name_is(String name) throws Throwable {
	   this.name = name;
	}

	@When("^I ask if i am a bitch$")
	public void i_ask_if_i_am_a_bitch() throws Throwable {
		if(name.equals("Ana")){
			actualAnswer = "Yes you are";
		}
		else {
			actualAnswer = "No you are not";
		}
	}

	@Then("^Then the answer should be \"([^\"]*)\"$")
	public void then_the_answer_should_be(String expectedAnswer) throws Throwable {
	    Assert.assertEquals(expectedAnswer, actualAnswer);
	}


}
