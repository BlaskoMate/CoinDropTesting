Feature: Edut Cause Name

    Scenario Outline: Edut Cause Name
        
        Given the user logged in 
        And the user on <link> page
        When click on cause title 'Edit' button
        And fill input field with "test is edited"
        And click on 'Update' button
        Then cause title is "test is edited"
        
        Examples:
        |   link   |
        |profile-page-link|