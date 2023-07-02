package core.utils;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;

public class RandomDataGenerator {

    private static <T> List<T> pickNRandomElements(List<T> list, int n, SecureRandom r) {
        int length = list.size();
        if (length < n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = length - 1; i >= length - n; --i) {
            Collections.swap(list, i, r.nextInt(i + 1));
        }
        return list.subList(length - n, length);
    }

    public <T> List<T> pickNRandomElements(List<T> list, int n) {
        return pickNRandomElements(list, n, new SecureRandom());
    }

    public static String createUniqueStringWithoutDigits(final int length) {
        int leftLimit = 65; // letter 'A'
        int rightLimit = 90; // letter 'Z'
        return new SecureRandom().ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String createUniqueStringWithoutDigits() {
        return createUniqueStringWithoutDigits(12);
    }

    public static String createUniqueEmail() {
        String name = createUniqueStringWithoutDigits(6);
        String domain = createUniqueStringWithoutDigits(6);
        return String.format("%s@%s.com", name, domain);
    }

    public static String createUniquePassword() {
        return createUniqueStringWithoutDigits(10) + "1!";
    }

    public static int randomInt(int min, int max) {
        return (int) (new SecureRandom().nextDouble() * (max - min)) + min;
    }

    public static int generateDifferentInt(final int i, final int max) {
        int j = randomInt(1, max);
        int count = 0;
        while (i == j && count < 100) {
            count++;
            j = randomInt(1, max);
        }
        return j;
    }

}
