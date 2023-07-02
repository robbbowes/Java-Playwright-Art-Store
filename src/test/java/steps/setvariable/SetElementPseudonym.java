package steps.setvariable;

import com.aventstack.extentreports.Status;
import com.microsoft.playwright.Locator;
import core.config.TestContext;
import core.reports.ExtentListeners;
import core.utils.PageElementLocator;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import steps.Wording;

public class SetElementPseudonym {

    private final TestContext testContext;

    public SetElementPseudonym(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then(Wording.SetVariable.SET_ELEMENT_PSEUDONYM)
    public void setVariable(String parentLocatorKey, String elementPseudonym, String childLocatorKey, String text) {
        Locator parentLocator = PageElementLocator.getLocator(this.testContext, parentLocatorKey);
        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);

        Locator matchingLocator = parentLocator.filter(
                new Locator.FilterOptions().setHas(childLocator).setHasText(text)
        );
        Assert.assertNotEquals(matchingLocator.count(), 0);

        this.testContext.getScreen().getLocatorHistory().put(elementPseudonym, matchingLocator);
    }

}
