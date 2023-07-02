package steps;

public class Wording {

    private static final String NESTED_SUFFIX = " on {string}";

    public static class Actions {

        public static class Alert {
            public static final String ACCEPT_ALERT = "I accept the alert";
        }

        public static class Check {
            public static final String CHECK = "I check the {string} checkbox";
            public static final String UNCHECK = "I uncheck the {string} checkbox";
            public static final String NESTED_CHECK = CHECK + NESTED_SUFFIX;
            public static final String NESTED_UNCHECK = UNCHECK + NESTED_SUFFIX;
        }

        public static class Click {
            public static final String CLICK = "I click the {string}";
            public static final String NESTED_CLICK = CLICK + NESTED_SUFFIX;
        }

        public static class Input {
            public static final String TYPE = "I type {string} in the {string} input";
            public static final String TYPE_RANDOM_NAME = "I type a random name in the {string} input";
            public static final String TYPE_RANDOM_EMAIL = "I type a random email in the {string} input";
            public static final String TYPE_RANDOM_PASSWORD = "I type a random password in the {string} input";
        }

        public static class Select {
            public static final String SELECT = "I select the {string} from the {string} dropdown";
            public static final String NESTED_SELECT = SELECT + NESTED_SUFFIX;
        }
    }

    public static class Assertions {
        public static class ElementChecked {
            public static final String IS_CHECKED = "the {string} checkbox is checked";
            public static final String IS_UNCHECKED = "the {string} checkbox is unchecked";
            public static final String NESTED_IS_CHECKED = IS_CHECKED + NESTED_SUFFIX;
            public static final String NESTED_IS_UNCHECKED = IS_UNCHECKED + NESTED_SUFFIX;
        }

        public static class ElementText {
            public static final String TEXT_CONTAINS = "the {string} should contain the text {string}";
            public static final String TEXT_DOES_NOT_CONTAIN = "the {string} should not contain the text {string}";
            public static final String TEXT_EQUALS = "the {string} text should equal {string}";
            public static final String TEXT_DOES_NOT_EQUAL = "the {string} should not equal the text {string}";
            public static final String NESTED_TEXT_CONTAINS = TEXT_CONTAINS + NESTED_SUFFIX;
            public static final String NESTED_TEXT_DOES_NOT_CONTAIN = TEXT_DOES_NOT_CONTAIN + NESTED_SUFFIX;
            public static final String NESTED_TEXT_EQUALS = TEXT_EQUALS + NESTED_SUFFIX;
            public static final String NESTED_TEXT_DOES_NOT_EQUAL = TEXT_DOES_NOT_EQUAL + NESTED_SUFFIX;
        }

        public static class ElementVisibility {
            public static final String IS_VISIBLE = "the {string} should be visible";
            public static final String IS_NOT_VISIBLE = "the {string} should not be displayed";
            public static final String EXACT_NUMBER_VISIBLE = "^\"(\\d+)\" \"(.+?)\"s? should be displayed$";
            public static final String NESTED_IS_VISIBLE = IS_VISIBLE + NESTED_SUFFIX;
            public static final String NESTED_IS_NOT_VISIBLE = IS_NOT_VISIBLE + NESTED_SUFFIX;
            public static final String NESTED_EXACT_NUMBER_VISIBLE = EXACT_NUMBER_VISIBLE + NESTED_SUFFIX;
        }
    }

    public static class Parent {
        public static final String SET_VARIABLE = "a {string} with the {string} {string} should be displayed - henceforth referred to as {string}";
    }


}
