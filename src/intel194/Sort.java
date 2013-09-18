package intel194;

import static jedi.functional.FunctionalPrimitives.listTabulate;
import static jedi.functional.Comparables.sort;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import jedi.functors.DynamicFunctor;

public class Sort {
    static int LENGTH = 5;
    static int STRINGS = 100;

    public static String randomString() {
        return randomAlphabetic(LENGTH);
    }

    public static void main(String[] args) {
        System.out.println(sort(listTabulate(STRINGS, new DynamicFunctor(Sort.class, "randomString"))));
    }
}
