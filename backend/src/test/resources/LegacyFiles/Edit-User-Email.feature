Feature: Edit user email

    Scenario Outline: Edit user email
        
        Given the user logged in 
        And the user on <link> page
        When click on e-mail 'Edit' button
        And fill input field with "test_new_5@gmail.com"
        And click on 'Update' button
        Then email is "test_new_5@gmail.com"
        
        
        Examples:
        |   link   |
        |profile-page-link|