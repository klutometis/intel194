package intel194;

import static jedi.functional.FunctionalPrimitives.listTabulate;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static jedi.functional.Comparables.sort;

import java.util.Random;
import jedi.functors.DynamicFunctor;

public class Sort {
    static Random random = new Random();
    static int MIN_LENGTH = 5;
    static int MAX_LENGTH = 10;
    static int STRINGS = 100;

    static int random(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static String randomString() {
        return randomAlphanumeric(random(MIN_LENGTH, MAX_LENGTH));
    }

    public static void main(String[] args) {
        System.out.println(sort(listTabulate(100, new DynamicFunctor(Sort.class, "randomString"))));
    }
}
