Feature: Login functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Clever ecommerce
    When click sign in
    When Enter username and password and click login button
    Then User should Create an account successfully
    When Enter username and password and click Register button


