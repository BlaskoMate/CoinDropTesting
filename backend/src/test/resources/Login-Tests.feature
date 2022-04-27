Feature: Login Tests

    Scenario: Empty credentials Login
        
        Given the user is on the login page
        When do not write to email and password field
        And click to 'Submit' button
        Then the user sees top-right 'login' button

    Scenario: Empty password Login

        Given The user is on the login page
        When Enter the e-mail field with "automationTest1@gmail.com"
        And Do not write to password field!
        And And Click to 'Submit' button
        Then The user sees top-right 'login' button

    Scenario: Successfully login

        Given the user is logged out
        And the user is on the login page
        When I enter valid credentials and click to 'Submit' button
        And click to profile page
        Then The e-mail matches the login e-mail