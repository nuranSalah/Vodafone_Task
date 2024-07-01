@smoke
Feature: F01_addCart | users could add items to Cart from home
  Scenario: user could add items to cart
    Given  User navigate to home screen
    When   User choose product and add it to cart successfully
    Then   Cart items count increased