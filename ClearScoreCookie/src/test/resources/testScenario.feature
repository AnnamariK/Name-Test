Feature: Cookies on ClearScore.com 
	
	@cookies
	Scenario: The cookies notification is present
	   Given ClearScore page open 
		Then The cookies notification is present
		When Customer click the "No problem" button
		Then The cookies notification is dismissed
		When Customer reloads the page
		Then The cookies notification does not reappear
		And  The appropriate cookies were set