package StepDefinitons;

import DriverUtil.DriverUtil;
import Pages.LoginPage;
import Pages.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTestStepDefinitions {
    protected static DriverUtil driverUtil;
    private final LoginPage loginPage = new LoginPage(driverUtil.getDriver());
    private final ProfilePage profilePage = new ProfilePage(driverUtil.getDriver());


    @Before
    public static void getDriver(){
        driverUtil = DriverUtil.getDriverUtil();
    }

    @After("@last")
    public static void closeDriver(){
        driverUtil.closeDriver();
        driverUtil = null;
    }

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driverUtil.getDriver().get("http://localhost:3000/login");
    }


    @Then("the user sees top-right login button")
    public void theUserSeesTopRightLoginButton() {
        Assertions.assertTrue(loginPage.hasLoginButton());
    }

    @When("Enter the e-mail field with {string}")
    public void enterTheEMailFieldWith(String email) {
        loginPage.inputEmail(email);
    }


    @And("Click to Submit button")
    public void andClickToSubmitButton() throws InterruptedException {
        loginPage.clickSubmit();
    }


    @And("the user is logged out")
    public void theUserIsLoggedOut() {
        Assertions.assertTrue(loginPage.hasLoginButton());
    }

    @And("click to profile page")
    public void clickToProfilePage() {
        loginPage.clickProfileButton();
    }

    @When("I enter valid credentials\\(email:{string} pass: {string}) and click to Submit button")
    public void iEnterValidCredentialsEmailPassAndClickToSubmitButton(String email, String password) {
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickSubmit();
    }

    @Then("The e-mail matches the login e-mail\\({string})")
    public void theEmailMatchesTheLoginEMail(String email) {
        Assertions.assertEquals(email, profilePage.getEmailFromProfile());
    }
}
