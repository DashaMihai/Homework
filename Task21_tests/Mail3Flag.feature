Feature: Mark 3 letters with a flag

Scenario: Mark 3 letters with a flag
Given I am on main application page 3
When I login as correct user 3
When I click flag 1 letter
When I click flag 2 letter
When I click flag 3 letter
When I click flag button 
Then I see mails marked with a flag