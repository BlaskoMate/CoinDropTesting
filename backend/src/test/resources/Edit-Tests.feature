Feature: Edit Tests

    Scenario Outline: Edit Cause Description
        
        Given the user logged in 
        And the user on <link> page
        When click on description 'Edit' button
        And fill input field with {400 character text}
        And click on 'Update' button
        Then description is {400 character text}

        Examples:
            |   link   |
            |profile-page-link|

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

    Scenario Outline: Edit Cause Name

        Given the user logged in
        And the user on <link> page
        When click on cause title 'Edit' button
        And fill input field with "test is edited"
        And click on 'Update' button
        Then cause title is "test is edited"
        
        Examples:
        |   link   |
        |profile-page-link|