package core.config;

import core.records.PageRouteInfo;
import core.utils.PropertiesReader;
import pages.*;
import pages.abstractions.CucumberPage;

import java.util.Map;
import java.util.regex.Pattern;

public class PageMappings {

    private static final String BASE_URL = PropertiesReader
            .read("config/environment.properties")
            .getProperty("url");

    private static final Map<CucumberPage, PageRouteInfo> MAP = Map.ofEntries(

            Map.entry(new ArtPage(), new PageRouteInfo("", regex("/"))),

            Map.entry(new MyAccountPage(), new PageRouteInfo("/my-account", regex("/my-account"))),

            Map.entry(new CheckoutPage(), new PageRouteInfo("/basket", regex("/basket"))),

            Map.entry(new LoginPage(), new PageRouteInfo("/login", regex("/login"))),

            Map.entry(new SignUpPage(), new PageRouteInfo("/signup", regex("/signup")))

    );

    public static Map<CucumberPage, PageRouteInfo> getMappings() {
        return MAP;
    }

    private static Pattern regex(String route) {
        return Pattern.compile("^" + BASE_URL + route);
    }

}
