package steps.actions;

import com.microsoft.playwright.Locator;
import core.config.TestContext;
import core.utils.PageElementLocator;
import io.cucumber.java.en.When;
import steps.Wording;

public class Select {

    private final TestContext testContext;

    public Select(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Actions.Select.SELECT)
    public void select(String text, String locatorKey) {
        Locator locator = PageElementLocator.getLocator(this.testContext, locatorKey);
        locator.selectOption(text);
    }

}
