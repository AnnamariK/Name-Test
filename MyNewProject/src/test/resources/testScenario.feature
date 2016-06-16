
Feature: This is the feature description

	Scenario: Logging into my SSE account
		Given SSE login page open
		When I login username "myemailaddress@gmail.com" password "mypassword"
		Then My balance will be "0"