import models.UserFactory;
import org.openqa.selenium.WebDriver;
import models.managers.factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import models.propety_load.PropertyLoad;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new DriverFactory().getDriver(PropertyLoad.loadAPropetyFile("chromeDriver"));

        driver.get(PropertyLoad.loadAPropetyFile("mainPage"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
