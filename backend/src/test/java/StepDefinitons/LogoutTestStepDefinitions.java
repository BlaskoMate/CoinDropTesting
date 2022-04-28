package StepDefinitons;

import Pages.LoginAndRegisterPage;
import Pages.ProfilePage;
import Util.DriverUtil;
import Util.Urls;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LogoutTestStepDefinitions {
    protected static DriverUtil driverUtil;
    private final LoginAndRegisterPage loginAndRegisterPage = new LoginAndRegisterPage(driverUtil.getDriver());
    private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());

    @Given("As valid user I am logged-in to CoinDrop\\(email:{string} pass:{string})")
    public void asValidUserIAmLoggedInToCoinDropEmailPass(String email, String password) {
        driverUtil.getDriver().get(Urls.LOGIN_PAGE.url);
        loginAndRegisterPage.inputEmail(email);
        loginAndRegisterPage.inputPassword(password);
        loginAndRegisterPage.clickSubmit();
    }

    @When("Click to Logout button")
    public void clickToLogoutButton() {
        loginAndRegisterPage.clickLogoutButton();
    }

    @Then("See the Login button")
    public void seeTheLoginButton() {
        Assertions.assertTrue(loginAndRegisterPage.hasLoginButton());
    }
}
