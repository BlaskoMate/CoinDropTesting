Feature: Login Tests

    Scenario: Empty credentials Login
        
        Given The user is on the login page
        When Click to Submit button
        Then the user sees top-right login button

    Scenario: Empty password Login

        Given The user is on the login page
        When Enter the e-mail field with "dummyEmail"
        And Click to Submit button
        Then the user sees top-right login button

    @last
    Scenario: Successfully login

        Given The user is on the login page
        And the user is logged out
        When I enter valid credentials(email:"dummyEmail" pass: "dummyPass") and click to Submit button
        And click to profile page
        Then The e-mail matches the login e-mail("dummyEmail")