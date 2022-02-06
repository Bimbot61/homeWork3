package lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        massivOneArray();
        massivTwoArray();
        System.out.println();
        massivThreeArray();
        massivFourArray();
        testMetod1(4, 3);
        testMetod2();


    }

    private static void massivOneArray() {
        int[] byi = {1, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < byi.length; i++) {
            if (byi[i] == 1) {
                byi[i] = 0;
            } else byi[i] = 1;
        }
        System.out.println(Arrays.toString(byi));
    }

    private static void massivTwoArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }

    private static void massivThreeArray() {
        int[] test = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < test.length; i++) {
            if (test[i] < 6) {
                test[i] *= 2;
            }
            System.out.print(test[i] + " ");
        }
        System.out.println();
    }

    private static void massivFourArray() {
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void testMetod1(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void testMetod2() {
        int[] array = {2, 4, 3, 8, 5, 1, 3};
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            } else if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println(indexMax + " " + indexMin);
    }
}
