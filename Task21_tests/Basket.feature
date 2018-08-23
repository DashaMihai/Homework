Feature: Test cleaning the basket

  Scenario: Test cleaning basket page
    Given I am on main application page1
    When I login as correct user1
    When I click basket
    When I click to clear the folder
     When I click yes button
    Then I see empty page

 