@smoke
Feature: F02_Search | users could search product and add it to cart
  Scenario: user could search for a product with name
    Given User navigate to home screen
    When  User write name "game" of product in search bar
    And   User clicks on desired searched product
    And   User choose product and add it to cart successfully
    Then  Success message appears