package steps.navigation;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.config.TestContext;
import core.utils.NavigationBehaviour;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.partials.NavigationBar;
import steps.Wording;

public class Navigate {

    private final TestContext testContext;

    public Navigate(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given(Wording.Navigate.Navigation.ON_PAGE)
    public void onPage(String pageId) {
        NavigationBehaviour.navigateToPage(this.testContext, pageId);
    }

    @Then(Wording.Navigate.Navigation.REDIRECTED_TO_PAGE)
    public void redirected(String pageId) {
        NavigationBehaviour.waitForCorrectPage(this.testContext, pageId);
    }

    @Then(Wording.Navigate.Navigation.CLICK_NAVIGATION_BAR)
    public void navbar(String locatorKey) {
        final Page page = this.testContext.getScreen().getCurrentTabInfo().currentTab();
        Locator locator = NavigationBar.getLocators(page).getOrDefault(locatorKey, null);
        Assert.assertNotNull(locator);
        locator.click();
    }

}
