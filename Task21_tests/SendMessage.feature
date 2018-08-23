Feature: Sending letters to a group of users

Scenario: Sending letters to a group of users
Given I am on main application page 2
When I login as correct user 2
When I click button write a letter
When I enter recipient addresses
When I enter the text of the letter
When I click send button 
Then I see message mail successfully sent