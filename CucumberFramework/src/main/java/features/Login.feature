Feature: login and logout of FB Application
 
Scenario: Verification of Login functionality

Given Open the Chrome and launch the application
When Enter the Username and Password
Then Login should be sucessfull

Scenario: Verification of Logout

Given Scroll down the page
When Click on User navigation pane link
And Click on Logout link 
Then User should be logged out
