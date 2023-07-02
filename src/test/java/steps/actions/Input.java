package steps.actions;

import com.microsoft.playwright.Locator;
import core.config.TestContext;
import core.utils.PageElementLocator;
import core.utils.RandomDataGenerator;
import io.cucumber.java.en.When;
import steps.Wording;

public class Input {

    private final TestContext testContext;

    public Input(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Actions.Input.TYPE)
    public void type(String text, String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.fill(text);
    }

    @When(Wording.Actions.Input.TYPE_RANDOM_NAME)
    public void typeRandomName(String locatorKey) {
        String uniqueName = RandomDataGenerator.createUniqueStringWithoutDigits(12);
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.fill(uniqueName);
    }

    @When(Wording.Actions.Input.TYPE_RANDOM_EMAIL)
    public void typeRandomEmail(String locatorKey) {
        String uniqueEmail = RandomDataGenerator.createUniqueEmail();
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.fill(uniqueEmail);
    }

    @When(Wording.Actions.Input.TYPE_RANDOM_PASSWORD)
    public void typeRandomPassword(String locatorKey) {
        String uniquePassword = RandomDataGenerator.createUniquePassword();
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.fill(uniquePassword);
    }

}
