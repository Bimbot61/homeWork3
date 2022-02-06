package lesson3;

import java.util.Arrays;

public class TestArrays {

    static final int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        /*testOneArray();*/
        testTwoArray();
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
        Arrays.fill(data,-1);

        data[0] = 2;
        data[1] = 1;
        data[2] = 5;
        data[5] = 3;
        data[data.length - 1] = 3;

/*        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        System.out.println(data[5]);
        System.out.println(data[6]);
        */
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    private static void testTwoArray(){
        /*int[][] deepDate = {{1,2,3},{1,2,3}};*/
        int[][] deepDate = new int[ARRAY_SIZE][ARRAY_SIZE];

        int n = 1;
        for (int i = 0; i < deepDate.length; i++) {
            for (int j = 0; j < deepDate[i].length; j++) {
                deepDate[i][j] = n++;
            }
        }

        for (int i = 0; i < deepDate.length; i++) {
            for (int j = 0; j < deepDate[i].length; j++) {
                System.out.print(deepDate[i][j] + " ");
            }
            System.out.println();
        }

    }
}


