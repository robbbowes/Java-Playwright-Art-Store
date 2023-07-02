package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import pages.abstractions.CucumberPage;

import java.util.Map;

public class CheckoutPage implements CucumberPage {

    @Override
    public Map<String, Locator> getLocators(Page page) {
        return Map.ofEntries(
                Map.entry("basket card", page.locator("[data-qa='basket-card']")),
                Map.entry("card title", page.locator("div.font-bold.w-full:not(.basket-item-price)")),
                Map.entry("card price", page.locator(".basket-item-price")),
                Map.entry("remove button", page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Remove from basket"))),
                Map.entry("total cost", page.locator("div.flex-none > p > span"))
        );
    }

}
