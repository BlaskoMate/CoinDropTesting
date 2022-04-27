Feature: Successful logout

  Scenario: Successful logout
    Given as valid user I am logged-in to CoinDrop
    When click to Logout button
    Then see the Login button