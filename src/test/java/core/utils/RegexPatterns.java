package core.utils;

import java.util.regex.Pattern;

public final class RegexPatterns {

    public static final Pattern ONLY_NUMBERS = Pattern.compile("[^0-9]");
    public static final Pattern ONLY_SPACES = Pattern.compile("\\s+");
}
