package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pages.abstractions.CucumberPage;

import java.util.Map;

public class CheckoutPage implements CucumberPage {

    @Override
    public Map<String, Locator> getLocators(Page page) {
        return Map.ofEntries(
                Map.entry("basket card", page.locator("[data-qa='basket-card']")),
                Map.entry("card title", page.locator("div.font-bold.w-full:not(.basket-item-price)")),
                Map.entry("card price", page.locator(".basket-item-price"))
        );
    }

}
