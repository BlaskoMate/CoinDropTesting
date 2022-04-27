package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    private static String email = "automationTest404@gmail.com";
    private static  String password = "pizza";

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;


    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
    }

    public static void Login(){

    }
}
