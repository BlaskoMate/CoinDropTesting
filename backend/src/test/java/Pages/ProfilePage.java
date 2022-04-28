package Pages;

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

    @FindBy(xpath = "//p[contains(@class,'font-medium text-lg md:text-2xl text-indigo-900 pl-1')]")
    WebElement emailOnProfile;

    public String getEmailFromProfile() {
        return emailOnProfile.getText();
    }
}
