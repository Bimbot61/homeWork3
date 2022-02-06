package lesson2;

public class TestMetods {
    public static void main(String[] args) {
        sumVarsAndPrint(4,6);
        primtNutsAndResult(4,9);
    }

    private static void sumVarsAndPrint(int a, int b) {
        /* int a = 5;
        int b = 7;*/
        int rezult = a + b;
        System.out.println("Сумма чисел " + rezult);
    }

    static void primtNutsAndResult(int a, int b){
        int result = sumVarsAndReturn(a, b);
        System.out.printf("%d + %d = %d%n", a, b, result);
    }

    private static int sumVarsAndReturn(int a, int b) {
        int result = a + b;
        return result;
    }

}

