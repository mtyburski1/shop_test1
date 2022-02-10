package pages.user_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends MenuPage{

    public YourAccountPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "identity-link")
    private WebElement accountInformations;

    public YourAccountPage accountInformations(){
        GoToSingInAcc();
        accountInformations.click();
        return this;
    }
}