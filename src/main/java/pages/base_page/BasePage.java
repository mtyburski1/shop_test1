package pages.base_page;

import models.UserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BasePage extends UserFactory {
    public WebDriver driver;
    public WebDriverWait wait;
    public SoftAssert softAssert;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        softAssert = new SoftAssert();
    }

    public void click(WebElement element){
        element.click();
    }
    public void sendKeys(WebElement element, String text){
        wait.until((ExpectedConditions.visibilityOf(element)));
        element.sendKeys(text);
    }

}
