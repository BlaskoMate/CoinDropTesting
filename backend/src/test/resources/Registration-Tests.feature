Feature: Registration Tests

    Scenario: Empty credentials Registration
        
        Given the user is on the registration page
        When do not write to email and password field
        And click to 'Submit' button
        Then the user sees top-right 'login' button

    Scenario: Successful registration

        Given The user is on the registration page
        When Enter the e-mail field with "automationTest1@gmail.com"
        And Enter the password fill with "abc123"
        And Click to 'Submit' button
        Then See on top-right "Profile"
        And Click to 'Profile'
        Then Validate user email, expected: "automationTest1@gmail.com"

    Scenario: Empty password Registration

        Given The user is on the registration page
        When Enter the e-mail field with "automationTest1@gmail.com"
        And Do not write to password field!
        And And Click to 'Submit' button
        Then The user sees top-right 'login' button