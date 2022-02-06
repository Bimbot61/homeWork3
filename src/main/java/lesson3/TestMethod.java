package lesson3;

public class TestMethod {
    public static void main(String[] args) {
        multuply(3, 4);
        multuply(3.7, 4.3);
        multuply(3);
        //multuply(new int[]{1, 2, 3, 4, 5, 6, 7});
        multuply(1,2,3,4);
    }

    private static void multuply(int a, int b) {
        int multuply = a * b;
        System.out.printf("Произведение %d и %d равно %d(целые)%n", a, b, multuply);
    }

    private static void multuply(double a, double b) {
        double multuply = a * b;
        System.out.printf("Произведение %.2f и %.2f равно %.2f(дробные)%n", a, b, multuply);
    }

    private static void multuply(int a) {
        int multuply = a * a;
        System.out.printf("Квадрат числа %d равен %d%n", a, multuply);
    }
    //private static void multuply(int[] arr){
    private static void multuply(int... a) {
        int multuply = 1;
        for (int num : a) {
            multuply *= num;
        }
        System.out.printf("Произведение всех чисел равно %d%n", multuply);
    }


}