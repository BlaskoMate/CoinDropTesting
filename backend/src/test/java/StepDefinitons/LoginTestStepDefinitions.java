package StepDefinitons;

import DriverUtil.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginTestStepDefinitions {
    protected static DriverUtil driverUtil;

    @Before
    public static void getDriver(){
        driverUtil = DriverUtil.getDriverUtil();
    }

    @After
    public static void closeDriver(){
        driverUtil.closeDriver();
        driverUtil = null;
    }

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driverUtil.getDriver().get("https://www.microsoft.com/hu-hu/");
    }

    @When("do not write to email and password field")
    public void doNotWriteToEmailAndPasswordField() {

    }

    @And("click to {string} button")
    public void clickToSubmitButton() {

    }

    @Then("the user sees top-right {string} button")
    public void theUserSeesTopRightLoginButton() {

    }

    @When("Enter the e-mail field with {string}")
    public void enterTheEMailFieldWith(String arg0) {

    }

    @And("Do not write to password field!")
    public void doNotWriteToPasswordField() {

    }

    @And("And Click to {string} button")
    public void andClickToSubmitButton() {

    }

    @Given("the user is logged out")
    public void theUserIsLoggedOut() {

    }

    @When("I enter valid credentials and click to {string} button")
    public void iEnterValidCredentialsAndClickToSubmitButton() {

    }

    @And("click to profile page")
    public void clickToProfilePage() {

    }

    @Then("The e-mail matches the login e-mail")
    public void theEMailMatchesTheLoginEMail() {

    }
}
