Feature: Moving a mail out of spam

Scenario: Moving a mail out of spam
Given I am on main application page 1
When I login as correct user 1
When I click spam
When I click check-box spam mail
When I click button Not spam
Then I see message Mail successfully moved to the inbox