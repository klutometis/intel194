package intel194;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

class Sort {
    static Random random = new Random();

    static int random(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomAlphanumeric(random(5, 10)));
    }
}
