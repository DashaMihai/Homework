Feature: Uncheck all emails

Scenario: Uncheck all emails
Given I am on main application page 4
When I login as correct user 4
When I click flag button
When I click check-box all mails
When I click button more
When I click uncheck button
Then I see empty message