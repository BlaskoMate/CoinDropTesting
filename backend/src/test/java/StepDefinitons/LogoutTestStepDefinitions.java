package StepDefinitons;

import Pages.LoginPage;
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
    private final LoginPage loginPage = new LoginPage(driverUtil.getDriver());
    private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());

    @Before
    public static void getDriver(){
        driverUtil = DriverUtil.getDriverUtil();
    }

    @After()
    public static void closeDriver(){
        driverUtil.closeDriver();
        driverUtil = null;
    }

    @Given("As valid user I am logged-in to CoinDrop\\(email:{string} pass:{string})")
    public void asValidUserIAmLoggedInToCoinDropEmailPass(String email, String password) {
        driverUtil.getDriver().get(Urls.LOGIN_PAGE.url);
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickSubmit();
    }

    @When("Click to Logout button")
    public void clickToLogoutButton() {
        loginPage.clickLogoutButton();
    }

    @Then("See the Login button")
    public void seeTheLoginButton() {
        Assertions.assertTrue(loginPage.hasLoginButton());
    }
}
