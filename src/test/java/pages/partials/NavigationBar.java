package pages.partials;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.util.Map;

public class NavigationBar  {

    public static Map<String, Locator> getLocators(Page page) {
        return Map.ofEntries(
                Map.entry("My Account", page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Account"))),
                Map.entry("Art", page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Account"))),
                Map.entry("Checkout", page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Account")))
        );
    }

}
