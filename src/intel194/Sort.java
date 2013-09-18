package intel194;

import static jedi.functional.Comparables.sort;
import static jedi.functional.FunctionalPrimitives.listTabulate;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.util.Random;
import jedi.functors.DynamicFunctor;

public class Sort {
    static Random random = new Random();

    static int STRING_LENGTH = 5;
    static int ELEMENTS = 100;

    public static String randomString() {
        return randomAlphabetic(STRING_LENGTH);
    }

    public static double randomDouble() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        System.out.println(sort(listTabulate(ELEMENTS, new DynamicFunctor(Sort.class, "randomString"))));
        System.out.println(sort(listTabulate(ELEMENTS, new DynamicFunctor(Sort.class, "randomDouble"))));
    }
}
