package com.automation;

import com.automation.pages.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SuccessFulLogout extends Base {
    ProfilePage profilePage = homePage.profilePage();


    @Given("as valid user I am logged-in to CoinDrop")
    public void as_valid_user_i_am_logged_in_to_coin_drop(){
        homePage.profilePage();
    }

    @When("click to Logout button")
    public void clickToLogoutButton() {
        profilePage.clickToLogOutButton();
    }

    @Then("see the Login button")
    public void seeTheLoginButton() {
        Assert.assertTrue(profilePage.isDisplayedLogInButton());
    }



}
