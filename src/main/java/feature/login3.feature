Feature: login with maps method

Scenario: To login to application with the help of Maps

Given user goes to home page
Then user clicks on Admin menue option
Then user selects Users under user management option
When the user provides username and employeename on form
| username      | employeename  |
| Hannah Flores | Hannah Flores |
| robert craig  | Robert Craig  |
Then user clicks on the search button
Then user can see search result

#this map method will login once and will run all test data entries. 
#It will not execute all steps for every test data entry
