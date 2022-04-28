package StepDefinitons;

import Util.DriverUtil;
import Pages.LoginAndRegisterPage;
import Pages.ProfilePage;
import Util.Urls;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginTestStepDefinitions {
    protected static DriverUtil driverUtil;
    private final LoginAndRegisterPage loginAndRegisterPage = new LoginAndRegisterPage(driverUtil.getDriver());
    private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driverUtil.getDriver().get(Urls.LOGIN_PAGE.url);
    }


    @Then("the user sees top-right login button")
    public void theUserSeesTopRightLoginButton() {
        Assertions.assertTrue(loginAndRegisterPage.hasLoginButton());
    }

    @When("Enter the e-mail field with {string}")
    public void enterTheEMailFieldWith(String email) {
        loginAndRegisterPage.inputEmail(email);
    }


    @And("Click to Submit button")
    public void andClickToSubmitButton() throws InterruptedException {
        loginAndRegisterPage.clickSubmit();
    }


    @And("the user is logged out")
    public void theUserIsLoggedOut() {
        Assertions.assertTrue(loginAndRegisterPage.hasLoginButton());
    }

    @And("click to profile page")
    public void clickToProfilePage() {
        loginAndRegisterPage.clickProfileButton();
    }

    @When("I enter valid credentials\\(email:{string} pass: {string}) and click to Submit button")
    public void iEnterValidCredentialsEmailPassAndClickToSubmitButton(String email, String password) {
        loginAndRegisterPage.inputEmail(email);
        loginAndRegisterPage.inputPassword(password);
        loginAndRegisterPage.clickSubmit();
    }

    @Then("The e-mail matches the login e-mail\\({string})")
    public void theEmailMatchesTheLoginEMail(String email) {
        Assertions.assertEquals(email, profilePage.getEmailFromProfile());
    }
}
