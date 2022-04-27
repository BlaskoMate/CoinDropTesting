package com.automation.pages;


import org.openqa.selenium.By;

public class LoginPage {

    By emailField =  new By.ByXPath("//input[@name='email']");
    By passwordField =  new By.ByXPath("//input[@name='password']");
    By submitButton =  new By.ByXPath("//button[contains(text(),'Submit')]");

    public By getEmailField() {
        return emailField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getSubmitButton() {
        return submitButton;
    }

}
