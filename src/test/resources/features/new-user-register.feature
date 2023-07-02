Feature: As a user I expect to be able to register successfully

  @smoke
  @regression
  Scenario: As an anonymous user I expect to be able to register using valid credentials
    Given I am on the "Art Page"
    When I click "My Account" in the navigation bar
    Then I am redirected to the "Login Page"
    When I click the "register button"
    Then I am redirected to the "Sign Up Page"
    When I type a random email in the "email" input
    And I type a random password in the "password" input
    And I click the "register button"
    Then I am redirected to the "My Account Page"
