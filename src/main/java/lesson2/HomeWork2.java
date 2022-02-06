package lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        test1(2, 5);
        test2(5);
        test3(0);
        test4("Hi", 3);
        test5(2021);
    }

    private static boolean test1(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void test2(int a) {
        if (a >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    private static boolean test3(int b) {
        if (b <= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void test4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    private static boolean test5(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        return false;
    }
}
