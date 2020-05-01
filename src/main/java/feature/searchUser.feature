Feature: Search users

Scenario Outline: To search a user # if we are using Example : then it should be scenario outline

Given user is on home page
Then user clicks on Admin menue
Then user selects Users under user management
When user provides <username> and <empoyeename> on the form
Then user clicks on search button
Then user gets search result

Examples:
	| username      | empoyeename   |
	| Hannah Flores | Hannah Flores |
	| robert craig  | Robert Craig  |
	
	
	#above is another way data driven testing. for every set of data, 
	# -a new tab will be opened and entire test case will be executed again.
	#i.e. for every set of data entire test case will be executed