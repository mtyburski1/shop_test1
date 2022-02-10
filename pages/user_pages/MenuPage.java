package pages.user_pages;

import pages.base_page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    private WebElement goToSingIn;

    @FindBy(xpath = "//a[@data-link-action='display-register-form']")
    private WebElement goToRegister;

    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement goToSingIntAcc;

    @FindBy(css = ".logout")
    private WebElement logOut;

    public void goToSingIn(){
        goToSingIn.click();
    }
    public void GoToRegister(){
        goToSingIn.click();
        goToRegister.click();
    }
    public void GoToSingInAcc(){
        wait.until(ExpectedConditions.elementToBeClickable(goToSingIntAcc));
        goToSingIntAcc.click();
    }

    public void logOut(){
        logOut.click();
    }
}
