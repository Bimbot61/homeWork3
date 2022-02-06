package lesson3;

import java.util.Arrays;
import java.util.Random;

public class TestRandoms {
    public static void main(String[] args) {
        testRandom();
    }

    private static void testRandom() {
        int[] data = new int[40];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(); // -2147kk - +2147kk
            data[i] = random.nextInt(10); // 0 - 9
            data[i] = random.nextInt(8) + 3; // 3 - 10

            data[i] = (int)(Math.random() * 10);
        }

        System.out.println(Arrays.toString(data));
    }

}
