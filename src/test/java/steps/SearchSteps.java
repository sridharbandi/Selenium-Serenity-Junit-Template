package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageobjects.GoogleSearchPage;
import pageobjects.SearchResultsPage;

public class SearchSteps extends ScenarioSteps {

    GoogleSearchPage googleSearchPage;
    SearchResultsPage searchResultsPage;

    @Step
    public void openURL(){
        googleSearchPage.open();
    }

    @Step
    public void searchFor(String searchterm){
        googleSearchPage.searchFor(searchterm);
    }

    @Step
    public void assertSeleniumLinkPresent(){
        searchResultsPage.assertSeleniumPresent();
    }
}
