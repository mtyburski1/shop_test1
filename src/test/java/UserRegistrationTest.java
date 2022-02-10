import models.User;
import models.UserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user_pages.*;

import java.time.Duration;

public class UserRegistrationTest extends TestBase{

    @Test
    public void shouldRegister() {

        MenuPage menuPage = new MenuPage(driver);
        menuPage.GoToRegister();

        User user =  UserFactory.getRandomUser();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage
                .fillGender(user.getGender())
                .fillFirstName(user.getFirstName())
                .fillLastName(user.getLastName())
                .fillEmail(user.getEmail())
                .fillPassword(user.getPassword())
                .offersEmailCheck(true)
                .fillPrivacyCheck(true)
                .newsletterCheck(true)
                .fillPsgdpr(true)
                .registerClick();

        YourAccountPage accountPage = new YourAccountPage(driver);
        accountPage.accountInformations();

        menuPage.logOut();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser(user.getEmail(), user.getPassword());


    }
}

