package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.google.com/")
public class GoogleSearchPage extends PageObject {

    private WebDriver _driver = null;

    @FindBy(id = "lst-ib")
    WebElementFacade searchbox;

    public void searchFor(String _searchTerm) {
        searchbox.waitUntilVisible().sendKeys(_searchTerm + Keys.RETURN);
    }

}
