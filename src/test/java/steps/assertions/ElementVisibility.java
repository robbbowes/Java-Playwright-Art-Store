package steps.assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.Then;
import steps.Wording;

public class ElementVisibility {

    private final TestContext testContext;

    public ElementVisibility(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then(Wording.Assertions.ElementVisibility.IS_VISIBLE)
    public void theShouldBeDisplayed(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).isVisible();
    }

    @Then(Wording.Assertions.ElementVisibility.IS_NOT_VISIBLE)
    public void shouldNotBeDisplayed(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).not().isVisible();
    }

    @Then(Wording.Assertions.ElementVisibility.EXACT_NUMBER_VISIBLE)
    public void numberShouldBeDisplayed(String count, String locatorKey) {
        int i = Integer.parseInt(count);
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).hasCount(i);
    }

}
