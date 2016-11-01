How to execute tests:

Prerequisite: JAVA_HOME and maven are set as Environment variables
Execute the ExecuteTests.bat, after the tests are executed, generated reports are available in target/report folder

Test 1 

I've created one single test to check the all the steps based on the scenarios below, combining them, as I found it more sensible.

Feature: Cookies on ClearScore.com 
	
	Scenario: The “We use cookies” notification is present
	   	Given Clear Score page open 
		Then The “We use cookies” notification is present
		
	Scenario: The “We use cookies” notification can be dismissed 
	   	Given Clear Score page open, and “We use cookies” notification is present
		When Customer click the "No problem" button
		Then The “We use cookies” notification is dismissed
		
        Scenario: The “We use cookies” notification does not reappear after being dismissed 
	   	Given Clear Score page open, and “We use cookies” notification is dismissed
		When Customer reloads the page
	        Then The “We use cookies” notification does not reappear
		And The appropriate cookie(s)are set

Test 2

I've used Firebug to find the endpoint and request method, then I used Postman to perform the API call, and check the functionality, and then I exported it to Java.

Test 3 

Unfortunately I've found the savings calculator tests too advanced for my knowledge.

Test 4

1. How would you integrate the tests you have written into a continuous integration environment? 

	- I don't have any hands on experience with Continuous Integration yet. I'm looking forward to work in an environment where I have the chance to learn and work with CI.

2. How would you make your API test simulate being as realistic a user as possible? 

	- I would use Selenium to simulate the user.

3. How would you approach running the same tests across mobile devices and different browsers? 
	
	- I would use a third party application, like Appium.



