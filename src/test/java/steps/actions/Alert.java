package steps.actions;

import com.microsoft.playwright.Dialog;
import core.config.TestContext;
import io.cucumber.java.en.When;
import steps.Wording;

public class Alert {

    private final TestContext testContext;

    public Alert(TestContext testContext) {
        this.testContext = testContext;
    }

    @When(Wording.Actions.Alert.ACCEPT_ALERT)
    public void acceptAlert() {
        this.testContext.getScreen().getCurrentTabInfo().currentTab().onDialog(Dialog::accept);
    }

}
