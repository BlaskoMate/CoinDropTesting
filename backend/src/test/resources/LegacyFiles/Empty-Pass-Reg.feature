Feature: Empty password Registration

    Scenario: Empty password Registration
        
        Given The user is on the registration page
        When Enter the e-mail field with "automationTest1@gmail.com"
        And Do not write to password field!
        And And Click to 'Submit' button
        Then The user sees top-right 'login' button