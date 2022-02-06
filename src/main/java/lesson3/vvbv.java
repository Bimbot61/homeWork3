package lesson3;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class vvbv {
    public static void main(String[] args) {
        testRandom();
    }

    private static void testRandom() {
        int[] arr = new int[25];
        Random ronda = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr [i] = ronda.nextInt();
            arr [i] = ronda.nextInt(5);
            arr [i] = ronda.nextInt(5) + 6;
            arr [i] = ronda.nextInt(10);

            arr [i] = (int)(Math.random() * 11);
           arr [i] += 2;
           if (arr[i] >= 10){
               arr[i] = 0;
           }

        }
        System.out.println(Arrays.toString(arr));
    }
}


