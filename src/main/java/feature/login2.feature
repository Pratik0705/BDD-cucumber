Feature: login with data tables method

Scenario: To login to application with the help of data tables

Given the user lands on home page
Then the user clicks on Admin menue
Then the user selects Users under user management
When the user provides username and employeename on the form
| Hannah Flores | Hannah Flores |
Then the user clicks on search button
Then the user gets search result
