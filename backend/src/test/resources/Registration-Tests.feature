Feature: Registration Tests

    Scenario: Empty credentials Registration
        
        Given The user is on the registration page
        When Click to Submit button
        Then the user sees top-right login button

    Scenario: Successful registration

        Given The user is on the registration page
        When Enter the e-mail field with "DummyEmail"
        And Enter the password fill with "DummyPassword"
        And Click to Submit button
        Then See on top-right Profile
        And Click to Profile
        Then Validate user email, expected: "DummyEmail"

    @last
    Scenario: Empty password Registration

        Given The user is on the registration page
        When Enter the e-mail field with "DummyEmail2"
        And Click to Submit button
        Then The user sees top-right login button