import Steps.HomePageSteps;
import config.Driver;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

    @BeforeClass
    public static void setupDriver(){
        Driver.getDriver();
    }

    @Before
    public void openHomePage() {
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
    public void openFeaturesPage() {
        new HomePageSteps(Driver.getDriver())
                .verifyHomePageIsDisplayed()
                .clickFeaturesButton()
                .verifyFeaturesPageIsDisplayed();
    }

    @Test
    public void openDownloadPage() {
        new HomePageSteps(Driver.getDriver())
                .verifyHomePageIsDisplayed()
                .clickDownloadButton()
                .verifyDownloadPageIsDisplayed();
    }

    @AfterClass
    public static void quitDriver() {
        Driver.quitDriver();
    }
}
