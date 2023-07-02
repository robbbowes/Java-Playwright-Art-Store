package steps.assertions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import steps.Wording;

public class ElementText {

    private final TestContext testContext;

    public ElementText(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then(Wording.Assertions.ElementText.TEXT_CONTAINS)
    public void shouldContainText(String locatorKey, String expectedText) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).containsText(expectedText);
    }

    @Then(Wording.Assertions.ElementText.TEXT_DOES_NOT_CONTAIN)
    public void shouldNotContainText(String locatorKey, String expectedText) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).not().containsText(expectedText);
    }

    @Then(Wording.Assertions.ElementText.TEXT_EQUALS)
    public void shouldEqualText(String locatorKey, String expectedText) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).hasText(expectedText);
    }

    @Then(Wording.Assertions.ElementText.TEXT_DOES_NOT_EQUAL)
    public void shouldNotEqualText(String locatorKey, String unexpectedText) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        PlaywrightAssertions.assertThat(locator).not().hasText(unexpectedText);
    }

    @Then(Wording.Assertions.ElementText.NESTED_TEXT_EQUALS)
    public void nestedTextEquals(String childLocatorKey, String text, String locatorLookupKey) {
        Locator parentLocator = this.testContext.getScreen().getLocatorHistory().get(locatorLookupKey);
        Assert.assertNotNull(String.format("No locator found for '%s'", locatorLookupKey));
        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);

        PlaywrightAssertions.assertThat(parentLocator.locator(childLocator)).hasText(text);
    }

    @Then(Wording.Assertions.ElementText.NESTED_TEXT_DOES_NOT_EQUAL)
    public void textOnItemNotEqual(String childLocatorKey, String text, String locatorLookupKey) {
        Locator parentLocator = this.testContext.getScreen().getLocatorHistory().get(locatorLookupKey);
        Assert.assertNotNull(String.format("No locator found for '%s'", locatorLookupKey));
        Locator childLocator = PageElementLocator.getLocator(this.testContext, childLocatorKey);

        PlaywrightAssertions.assertThat(parentLocator.locator(childLocator)).not().hasText(text);
    }

}
