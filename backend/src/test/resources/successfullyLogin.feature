Feature: Successfully login

  Scenario: Successfully login
    Given the user is logged out
    And the user is on the login page
    When I enter valid credentials and click to Submit button
    And click to profile page
    Then The e-mail matches the login e-mail