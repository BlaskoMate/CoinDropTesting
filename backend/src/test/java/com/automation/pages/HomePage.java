package com.automation.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginUrlPage(){
        driver.get("http://localhost:3000/login");
        return new LoginPage(driver);
    }

    public ProfilePage profilePage(){
        driver.get("http://localhost:3000/profile");
        return new ProfilePage(driver);
    }
}
