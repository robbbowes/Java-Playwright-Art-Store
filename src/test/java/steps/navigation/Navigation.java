package steps.navigation;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.config.TestContext;
import core.utils.NavigationBehaviour;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.partials.NavigationBar;

public class Navigation {

    private final TestContext testContext;

    public Navigation(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("I am on the {string}")
    public void onPage(String pageId) {
        NavigationBehaviour.navigateToPage(this.testContext, pageId);
    }

    @Then("I am redirected to the {string}")
    public void redirected(String pageId) {
        NavigationBehaviour.waitForCorrectPage(this.testContext, pageId);
    }

    @Then("I click {string} in the navigation bar")
    public void navbar(String locatorKey) {
        final Page page = this.testContext.getScreen().getCurrentTabInfo().currentTab();
        Locator locator = NavigationBar.getLocators(page).getOrDefault(locatorKey, null);
        Assert.assertNotNull(locator);
        locator.click();
    }

}
