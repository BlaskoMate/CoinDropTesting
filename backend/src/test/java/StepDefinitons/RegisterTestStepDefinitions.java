package StepDefinitons;

import Pages.LoginAndRegisterPage;
import Pages.ProfilePage;
import Util.DriverUtil;
import Util.Urls;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class RegisterTestStepDefinitions {
    protected static DriverUtil driverUtil;
    private final LoginAndRegisterPage loginAndRegisterPage = new LoginAndRegisterPage(driverUtil.getDriver());
    private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());

    @Given("The user is on the registration page")
    public void theUserIsOnTheRegistrationPage() {
        driverUtil.getDriver().get(Urls.REGISTRATION_PAGE.url);
    }

    @And("Enter the password fill with {string}")
    public void enterThePasswordFillWith(String password) {
        loginAndRegisterPage.inputPassword(password);
    }

    @Then("See on top-right Profile")
    public void seeOnTopRightProfile() {
        Assertions.assertTrue(loginAndRegisterPage.hasProfileButton());
    }

    @And("Click to Profile")
    public void clickToProfile() {
        loginAndRegisterPage.clickProfileButton();
    }

    @Then("Validate user email, expected: {string}")
    public void validateUserEmailExpected(String email) {
        Assertions.assertEquals(profilePage.getEmailFromProfile(), email);
    }

    @Then("The user sees top-right login button")
    public void theUserSeesTopRightLoginButton() {
        Assertions.assertTrue(loginAndRegisterPage.hasLoginButton());
    }
}
