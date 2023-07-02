package steps.actions;

import com.microsoft.playwright.Locator;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Wording;

public class Check {

    private final TestContext testContext;

    public Check(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Actions.Check.CHECK)
    public void check(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.check();
    }

    @When(Wording.Actions.Check.UNCHECK)
    public void uncheck(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.uncheck();
    }

    @When(Wording.Actions.Check.NESTED_CHECK)
    public void checkOnItem(String childLocatorKey, String locatorLookupKey) {
        Locator parentLocator = this.testContext.getScreen().getLocatorHistory().get(locatorLookupKey);
        Assert.assertNotNull(String.format("No locator found for '%s'", locatorLookupKey));

        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);
        parentLocator.locator(childLocator).check();
    }

    @When(Wording.Actions.Check.NESTED_UNCHECK)
    public void uncheckOnItem(String childLocatorKey, String locatorLookupKey) {
        Locator parentLocator = this.testContext.getScreen().getLocatorHistory().get(locatorLookupKey);
        Assert.assertNotNull(String.format("No locator found for '%s'", locatorLookupKey));

        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);
        parentLocator.locator(childLocator).check();
    }

}
