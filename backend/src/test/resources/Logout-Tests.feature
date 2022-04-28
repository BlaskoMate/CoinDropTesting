Feature: Successful logout

    Scenario: Successful logout

        Given As valid user I am logged-in to CoinDrop(email:"gagi@gagi.com" pass:"gagigagi")
        When Click to Logout button
        Then See the Login button