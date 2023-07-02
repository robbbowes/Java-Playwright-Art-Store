package core.config;

import core.records.PageRouteInfo;
import core.utils.PropertiesReader;
import pages.HomePage;
import pages.abstractions.CucumberPage;

import java.util.Map;
import java.util.regex.Pattern;

public class PageMappings {

    private static final String BASE_URL = PropertiesReader
            .read("config/environment.properties")
            .getProperty("url");

    private static final Map<CucumberPage, PageRouteInfo> MAP = Map.ofEntries(
            Map.entry(new HomePage(), new PageRouteInfo("", regex("/")))
    );

    public static Map<CucumberPage, PageRouteInfo> getMappings() {
        return MAP;
    }

    private static Pattern regex(String urlEnd) {
        return Pattern.compile("^" + BASE_URL + urlEnd + "$");
    }

}
