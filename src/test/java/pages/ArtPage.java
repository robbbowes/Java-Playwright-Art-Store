package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import pages.abstractions.CucumberPage;

import java.util.Map;

public class ArtPage implements CucumberPage {

    @Override
    public Map<String, Locator> getLocators(Page page) {
        return Map.ofEntries(
                Map.entry("product card", page.locator("[data-qa='product-card']")),
                Map.entry("product title", page.locator("[data-qa='product-title']")),
                Map.entry("product price", page.locator("[datatype='product-price']")),
                Map.entry("add/remove button", page.locator("[data-qa='product-button']")),
                Map.entry("basket counter", page.locator("[data-qa='header-basket-count']"))
        );
    }

}
