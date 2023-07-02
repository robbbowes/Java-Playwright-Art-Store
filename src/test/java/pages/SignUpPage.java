package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import pages.abstractions.CucumberPage;

import java.util.Map;

public class SignUpPage implements CucumberPage {

    @Override
    public Map<String, Locator> getLocators(Page page) {
        return Map.ofEntries(
                Map.entry("email", page.getByPlaceholder("E-Mail")),
                Map.entry("password", page.getByPlaceholder("Password")),
                Map.entry("register button", page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Register")))
        );
    }

}
