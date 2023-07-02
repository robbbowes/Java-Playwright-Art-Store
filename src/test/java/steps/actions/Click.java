package steps.actions;

import com.microsoft.playwright.Locator;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.Wording;

public class Click {

    private final TestContext testContext;

    public Click(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Actions.Click.CLICK)
    public void clickThe(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.click();
    }

    @Then(Wording.Actions.Click.NESTED_CLICK)
    public void valueWithTextIsVisible(String childLocatorKey, String locatorLookupKey) {
        Locator parentLocator = this.testContext.getScreen().getLocatorHistory().get(locatorLookupKey);
        Assert.assertNotNull(String.format("No locator found for '%s'", locatorLookupKey));

        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);

        parentLocator.locator(childLocator).click();
    }

}
