Feature: loginFeature
#@Regression

Background:
Given I open browser
And I navigate to FreeCrm

Scenario: Valid Login
When I enter valid username and Pasword
And I click login button
Then I successfully logged in
@Smoke
Scenario: Invalid Login
Given I open browser
And I navigate to FreeCrm
When I enter invalid username and password
And I click login button
Then I see sign up link

Scenario: valid username invalid password
Given I open browser
And I navigate to FreeCrm
When I enter valid username and password
And I click login button
Then I see sign up link
