package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import pages.abstractions.CucumberPage;

import java.util.Map;

public class MyAccountPage implements CucumberPage {

    @Override
    public Map<String, Locator> getLocators(Page page) {
        return null;
    }

}
