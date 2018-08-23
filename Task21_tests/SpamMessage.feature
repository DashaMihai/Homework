Feature: Moving a mail to spam

Scenario: Moving a mail to spam
Given I am on main application page 10
When I login as correct user 10
When I click check-box mail
When I click button Spam
Then I see message Mail successfully moved to spam