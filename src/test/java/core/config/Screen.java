package core.config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.records.CurrentTabInfo;
import pages.HomePage;
import pages.abstractions.CucumberPage;

import java.util.HashMap;
import java.util.Map;

public class Screen {

    private final Browser browser;
    private final BrowserContext context;
    private CurrentTabInfo currentTabInfo;
    private final Map<String, Locator> locatorHistory;

    public Screen(Browser browser, BrowserContext context, Page currentTab) {
        this.browser = browser;
        this.context = context;
        this.currentTabInfo = new CurrentTabInfo(currentTab, new HomePage());
        this.locatorHistory = new HashMap<>();
    }

    public Browser getBrowser() {
        return browser;
    }

    public BrowserContext getContext() {
        return context;
    }

    public CurrentTabInfo getCurrentTabInfo() {
        return this.currentTabInfo;
    }

    public Map<String, Locator> getLocatorHistory() {
        return this.locatorHistory;
    }

    public void setCurrentTabInfo(Page currentTab, CucumberPage currentTabClass) {
        this.currentTabInfo = new CurrentTabInfo(currentTab, currentTabClass);
    }

}
