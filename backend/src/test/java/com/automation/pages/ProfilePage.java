package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[1]")
    WebElement emailField;

    @FindBy(xpath = "//li[contains(text(),'Logout')]" )
    WebElement logoutButton;

    @FindBy(xpath = "//li[contains(text(),'Login')]" )
    WebElement loginButton;


    public String getTextEmailField(){
        return emailField.getText();
    }

    public void clickToLogOutButton(){
        logoutButton.click();
    }

    public boolean isDisplayedLogInButton(){
        return loginButton.isDisplayed();
    }



}
