@swag-labs
Feature: Swag Demo

  @swag-add-cart
  Scenario: Add to cart
    Given User login with user 'standard_user' and password 'secret_sauce'
    When User add "backpack" to shopping cart
    Then User validates item was added to shopping cart