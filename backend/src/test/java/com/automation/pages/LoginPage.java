package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    private String email = "automationTest404@gmail.com";
    private String password = "pizza";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']" )
    WebElement emailField;

    @FindBy(xpath = "//input[@name='password']" )
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Submit')]" )
    WebElement submitButton;


    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public void sendKeysToEmailField(String text){
        emailField.sendKeys(text);
    }

    public void sendKeysToPasswordField(String text){
        passwordField.sendKeys(text);
    }

    public void clickToSubmitButton(){
        submitButton.click();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
