package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SearchSteps;

@RunWith(SerenityRunner.class)
public class RunTest {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void testExample(){
        searchSteps.openURL();
        searchSteps.searchFor("Selenium");
        searchSteps.assertSeleniumLinkPresent();
    }
}
