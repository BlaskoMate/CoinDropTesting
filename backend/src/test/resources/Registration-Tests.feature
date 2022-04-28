Feature: Registration Tests

    Scenario: Empty credentials Registration
        
        Given The user is on the registration page
        When Click to Submit button
        Then the user sees top-right login button

    Scenario: Successful registration

        Given The user is on the registration page
        When Enter the e-mail field with "automationTest12734589@gmail.com"
        And Enter the password fill with "abc1323"
        And Click to Submit button
        Then See on top-right Profile
        And Click to Profile
        Then Validate user email, expected: "automationTest12734589@gmail.com"

    @last
    Scenario: Empty password Registration

        Given The user is on the registration page
        When Enter the e-mail field with "automationTest23447589@gmail.com"
        And Click to Submit button
        Then The user sees top-right login button