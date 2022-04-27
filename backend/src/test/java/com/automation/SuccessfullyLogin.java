package com.automation;

import com.automation.pages.LoginPage;
import com.automation.pages.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfullyLogin extends Base {


    LoginPage loginPage = homePage.loginUrlPage();
    ProfilePage profilePage = homePage.profilePage();

    @Before()
    public static void setUp(){
        Base.setUp();
    }

    @Given("the user is logged out")
    public void the_user_is_logged_out() {

    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        homePage.loginUrlPage();

    }
    @When("I enter valid credentials and click to Submit button")
    public void i_enter_valid_credentials_and_click_to_submit_button() {
        loginPage.sendKeysToEmailField(loginPage.getEmail());
        loginPage.sendKeysToPasswordField(loginPage.getPassword());
        loginPage.clickToSubmitButton();
    }
    @When("click to profile page")
    public void click_to_profile_page()  {
        homePage.profilePage();
    }

    @Then("The e-mail matches the login e-mail")
    public void the_e_mail_matches_the_login_e_mail() {
        String result = profilePage.getTextEmailField();
        Assert.assertEquals("The email is not matching",loginPage.getEmail(),result);
    }

    @After()
    public void quit(){
        tearDown();
    }
}
