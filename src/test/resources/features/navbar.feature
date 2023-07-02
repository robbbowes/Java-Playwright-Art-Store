Feature: As a user I expect to be able to navigate to different pages using the nav bar

  @smoke
  @regression
  Scenario: As a not logged in user I expect to be able to navigate to different pages using the nav bar
    Given I am on the "Art Page"
    When I click "My Account" in the navigation bar
    Then I am redirected to the "My Account Page"
    When I click "Checkout" in the navigation bar
    Then I am redirected to the "Checkout Page"
    When I click "Art" in the navigation bar
    Then I am redirected to the "Art Page"