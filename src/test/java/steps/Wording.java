package steps;

public class Wording {

    private static final String ON_PSEUDONYM_SUFFIX = " on {string}";

    public static class Actions {

        public static class Alert {
            public static final String ACCEPT_ALERT = "I accept the alert";
        }

        public static class Check {
            public static final String CHECK = "I check the {string} checkbox";
            public static final String UNCHECK = "I uncheck the {string} checkbox";
            public static final String NESTED_CHECK = CHECK + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_UNCHECK = UNCHECK + ON_PSEUDONYM_SUFFIX;
        }

        public static class Click {
            public static final String CLICK = "I click the {string}";
            public static final String NESTED_CLICK = CLICK + ON_PSEUDONYM_SUFFIX;
        }

        public static class Input {
            public static final String TYPE = "I type {string} in the {string} input";
            public static final String TYPE_RANDOM_NAME = "I type a random name in the {string} input";
            public static final String TYPE_RANDOM_EMAIL = "I type a random email in the {string} input";
            public static final String TYPE_RANDOM_PASSWORD = "I type a random password in the {string} input";
        }

        public static class Select {
            public static final String SELECT = "I select the {string} from the {string} dropdown";
            public static final String NESTED_SELECT = SELECT + ON_PSEUDONYM_SUFFIX;
        }
    }

    public static class Assertions {
        public static class ElementChecked {
            public static final String IS_CHECKED = "the {string} checkbox is checked";
            public static final String IS_UNCHECKED = "the {string} checkbox is unchecked";
            public static final String NESTED_IS_CHECKED = IS_CHECKED + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_IS_UNCHECKED = IS_UNCHECKED + ON_PSEUDONYM_SUFFIX;
        }

        public static class ElementText {
            public static final String TEXT_CONTAINS = "the {string} should contain the text {string}";
            public static final String TEXT_DOES_NOT_CONTAIN = "the {string} should not contain the text {string}";
            public static final String TEXT_EQUALS = "the {string} text should equal {string}";
            public static final String TEXT_DOES_NOT_EQUAL = "the {string} should not equal the text {string}";
            public static final String NESTED_TEXT_CONTAINS = TEXT_CONTAINS + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_TEXT_DOES_NOT_CONTAIN = TEXT_DOES_NOT_CONTAIN + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_TEXT_EQUALS = TEXT_EQUALS + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_TEXT_DOES_NOT_EQUAL = TEXT_DOES_NOT_EQUAL + ON_PSEUDONYM_SUFFIX;
        }

        public static class ElementVisibility {
            public static final String IS_VISIBLE = "the {string} should be visible";
            public static final String IS_NOT_VISIBLE = "the {string} should not be visible";
            public static final String EXACT_NUMBER_VISIBLE = "^\"(\\d+)\" \"(.+?)\"s? should be visible";
            public static final String NESTED_IS_VISIBLE = IS_VISIBLE + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_IS_NOT_VISIBLE = IS_NOT_VISIBLE + ON_PSEUDONYM_SUFFIX;
            public static final String NESTED_EXACT_NUMBER_VISIBLE = EXACT_NUMBER_VISIBLE + ON_PSEUDONYM_SUFFIX;
        }
    }

    public static class Navigate {
        public static class Navigation {
            public static final String ON_PAGE = "I am on the {string}";
            public static final String REDIRECTED_TO_PAGE = "I am redirected to the {string}";
            public static final String CLICK_NAVIGATION_BAR = "I click {string} in the navigation bar";
        }

        public static class Tab {
            public static final String SWITCH_TAB = "^I switch to the \"([0-9]+st|[0-9]+nd|[0-9]+rd|[0-9]+th)\" tab$";
            public static final String PAGE_OPENED_IN_NEW_TAB = "I click the {string} the {string} page is opened in a new tab";
        }
    }

    public static class SetVariable {
        public static final String SET_ELEMENT_PSEUDONYM = "a {string} [{string}] with the {string} {string} should be displayed";
    }



}
