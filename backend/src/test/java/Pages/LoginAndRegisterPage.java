package Pages;

import Util.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginAndRegisterPage {
    WebDriver driver;

    public LoginAndRegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='example@myemail.com']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInputField;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement submitButton;

    @FindBy(xpath = "//li[contains(@class,'pl-7')]//a[normalize-space()='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//li[contains(@class,'pl-6')]")
    WebElement logoutButton;

    @FindBy(xpath = "//li[@class='pl-7 ']//a[normalize-space()='Profile']")
    WebElement profileButton;


    public void inputEmail(String email){
        emailInputField.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordInputField.sendKeys(password);
    }

    public void clickSubmit(){
        submitButton.click();
    }

    public void clickProfileButton(){
        WebDriverManager.waitUntilVisible(driver, profileButton);
        profileButton.click();
    }

    public void clickLogoutButton(){
        WebDriverManager.waitUntilVisible(driver, logoutButton);
        logoutButton.click();
    }

    public boolean hasLogoutButton(){
        WebDriverManager.waitUntilVisible(driver, logoutButton);
        return logoutButton.isDisplayed();
    }

    public boolean hasProfileButton(){
        WebDriverManager.waitUntilVisible(driver, profileButton);
        return profileButton.isDisplayed();
    }

    public boolean hasLoginButton() {
        WebDriverManager.waitUntilVisible(driver, loginButton);
        return loginButton.isDisplayed();
    }
}
