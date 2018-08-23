Feature: Delete a message

Scenario: Delete a message
Given I am on main application page 5
When I login as correct user 5
When I click check-box message
When I click button delete
Then I see message Mail successfully deleted