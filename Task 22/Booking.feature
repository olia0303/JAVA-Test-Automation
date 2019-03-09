Feature: Test booking page
  @tag @tag1
Scenario: Check hotels on entered date
    Given I am on main application page
    When I enter the city in the search box
    And I enter date in search box
    And I click button check price
   Then I see hotels on the dates entered

  @tag @tag1
Scenario: Test find the best hotel
   Given I am on main application page
    When I enter the city in the search box
    And I enter date in search box
    And I click button check price
    When I sort hotels by the maximum rating
    When I find the best hotel
    Then I see the best hotel 