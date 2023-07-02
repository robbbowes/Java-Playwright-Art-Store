package steps.assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.Then;
import steps.Wording;

public class ElementChecked {

    private final TestContext testContext;

    public ElementChecked(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then(Wording.Assertions.ElementChecked.IS_CHECKED)
    public void isChecked(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).isChecked();
    }

    @Then(Wording.Assertions.ElementChecked.IS_UNCHECKED)
    public void isUnchecked(String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).not().isChecked();
    }
}
