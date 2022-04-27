package com.automation;

import com.automation.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    private static String email = "automationTest404@gmail.com";
    private static  String password = "pizza";
    private static WebDriver driver;
    protected static HomePage homePage;

    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


    public static void tearDown(){
        driver.quit();
    }

    public static void Login(){

    }
}
