Feature: Payment function at cause page

    Scenario: Payment function at cause page
        
        Given I am on a cause page
        When I select a donation amount
        And I fill name input field with a name
        And I click Pay
        Then I am redirected to the Payment page