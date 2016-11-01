Feature: Logging in to Junifer Knowledgebase
	
	Scenario: Entering login details
		Given Junifer Knowledgebase page open 
		When  Enter username "annamaria.keskeny" and password "Welcome01"
		Then  Will be redirected to All Updates page