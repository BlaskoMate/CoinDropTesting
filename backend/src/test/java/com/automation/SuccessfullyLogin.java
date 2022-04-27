package com.automation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfullyLogin {

    private WebDriver driver;
    private String email = "automationTest404@gmail.com";
    private String password = "pizza";

    @Given("the user is logged out")
    public void the_user_is_logged_out() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
    }
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver.get("http://localhost:3000/login");
    }
    @When("I enter valid credentials and click to Submit button")
    public void i_enter_valid_credentials_and_click_to_submit_button() {
        driver.findElement(new By.ByXPath("//input[@name='email']")).sendKeys(email);
        driver.findElement(new By.ByXPath("//input[@name='password']")).sendKeys(password);
        driver.findElement(new By.ByXPath("//button[contains(text(),'Submit')]")).click();
    }
    @When("click to profile page")
    public void click_to_profile_page()  {
        driver.get("http://localhost:3000/profile");
    }
    @Then("The e-mail matches the login e-mail")
    public void the_e_mail_matches_the_login_e_mail() {
        String result = driver.findElement(new By.ByXPath("//p[1]")).getText();
        Assert.assertEquals("The email is not matching",email,result);
        driver.quit();
    }
}
