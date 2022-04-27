Feature: Successful reggistration

    Scenario: Successful registration
        
        Given The user is on the registration page
        When Enter the e-mail field with "automationTest1@gmail.com" 
        And Enter the password fiel with "abc123" 
        And Click to 'Submit' button
        Then See on top-right "Profile"
        And Click to 'Profile'
        Then Validate user email, expected: "automationTest1@gmail.com"