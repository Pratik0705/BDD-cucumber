Feature: feature for tag practice

@SmokTest @RegressionTest
Scenario: tag practice 1
Given user is on login window
Then user can see compony logo

@SmokTest
Scenario: tag practice 2
Given user is logged
Then user can see the logo

@RegressionTest
Scenario: tag practice 3
Given user is on home page
Then user can see add button

@RegressionTest
Scenario: tag practice 4
Given user is on users screen
Then user can see remove button

@SmokTest
Scenario: tag practice 5
Given user is on add admin screen
Then user can see admin button

@SmokTest @RegressionTest
Scenario: tag practice 6
Given user is on remove user screen
Then user can see delete button

@SmokTest @RegressionTest
Scenario: tag practice 7
Given user is on jobs page
Then user can see job listings
