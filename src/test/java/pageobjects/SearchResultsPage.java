package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends PageObject {

    private WebDriver _driver = null;

    @FindBy(linkText = "Selenium - Web Browser Automation")
    WebElementFacade lnkSelenium;

    public void assertSeleniumPresent(){
        Assert.assertTrue(lnkSelenium.isDisplayed());
    }
}
