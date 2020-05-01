Feature: to learn hooks.

@SmokTest @RegressionTest
Scenario: tag practice 1
Given user lands on login window
Then user sees compony logo

@SmokTest
@first 
Scenario: tag practice 2
Given user gets logged
Then user can view the logo

#it is tagged hooks i.e. local hook : for this scenario ONLY.. it is not applicable to other scenarios