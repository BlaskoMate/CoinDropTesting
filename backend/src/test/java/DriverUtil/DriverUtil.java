package DriverUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {
    private static DriverUtil driverUtil;
    private final WebDriver driver;

    private DriverUtil(){
        if (System.getProperty("os.name").equals("Linux")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static DriverUtil getDriverUtil() {
        if(driverUtil == null){
            driverUtil = new DriverUtil();
        }
        return driverUtil;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeDriver(){
        driver.close();
        driver.quit();
    }

    protected void refreshPage(){
        driver.navigate().refresh();
    }

}
