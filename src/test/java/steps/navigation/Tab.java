package steps.navigation;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import core.config.Screen;
import core.config.TestContext;
import core.utils.NavigationBehaviour;
import core.utils.PageElementLocator;
import core.utils.RegexPatterns;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.abstractions.CucumberPage;
import steps.Wording;

public class Tab {

    private final TestContext testContext;

    public Tab(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Navigate.Tab.SWITCH_TAB)
    public void onPage(String tabNumber) {
        final String numberString = tabNumber.replaceAll(RegexPatterns.ONLY_NUMBERS.pattern(), "");
        final int tabIndex = Integer.parseInt(numberString) - 1;

        final Page currentTab = this.testContext.getScreen().getContext().pages().get(tabIndex);

        currentTab.bringToFront();

        final CucumberPage currentTabClass = NavigationBehaviour.getCurrentTabClass(this.testContext.getMappings(), currentTab);
        this.testContext.getScreen().setCurrentTabInfo(currentTab, currentTabClass);
    }

    @Then(Wording.Navigate.Tab.PAGE_OPENED_IN_NEW_TAB)
    public void newTab(String locatorKey, String pageId) {
        final Screen screen = this.testContext.getScreen();
        final Page newTab = screen.getCurrentTabInfo().currentTab().waitForPopup(()
                -> PageElementLocator.getLocator(this.testContext, locatorKey).click());

        screen.getContext().pages().add(newTab);

        newTab.waitForLoadState(LoadState.DOMCONTENTLOADED);
        newTab.bringToFront();

        final CucumberPage currentTabClass = NavigationBehaviour.getCurrentTabClass(this.testContext.getMappings(), newTab);
        this.testContext.getScreen().setCurrentTabInfo(newTab, currentTabClass);

        NavigationBehaviour.waitForCorrectPage(testContext, pageId);
    }

}
