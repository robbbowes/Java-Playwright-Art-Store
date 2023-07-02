Feature: As a user I expect to be able to add items to my basket

  @smoke
  @regression
  Scenario: As a user I expect to be able to add items to and remove items from my basket
    Given I am on the "Art Page"
    Then the "basket counter" text should equal "0"
    And a "product card" with the "product title" "Astronaut dabbing" should be displayed - henceforth referred to as "Product Card 1"
    And the "add/remove button" text should equal "Add to Basket" on "Product Card 1"
    And the "product price" text should equal "499$" on "Product Card 1"
    When I click the "add/remove button" on "Product Card 1"
    Then the "add/remove button" text should equal "Remove from Basket" on "Product Card 1"
    And the "basket counter" text should equal "1"