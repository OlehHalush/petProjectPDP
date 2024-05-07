import Steps.HomePageSteps;
import config.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests5 {

    @BeforeMethod
    public void beforeMethod() {
        Driver.openHomePage();
    }

    @Test
    public void openSignUpPage() {
        new HomePageSteps(Driver.getDriver())
                .verifyHomePageIsDisplayed()
                .clickGetStartedButton()
                .verifySignUpPageIsDisplayed();
    }

    @Test
    public void openDownloadPage() {
        new HomePageSteps(Driver.getDriver())
                .verifyHomePageIsDisplayed()
                .clickDownloadButton()
                .verifyDownloadPageIsDisplayed();
    }

    @Test
    public void openFeaturesPage() {
        new HomePageSteps(Driver.getDriver())
                .verifyHomePageIsDisplayed()
                .clickFeaturesButton()
                .verifyFeaturesPageIsDisplayed();
    }

    @AfterMethod
    public void afterMethod() {
        Driver.quitDriver();
    }

}
