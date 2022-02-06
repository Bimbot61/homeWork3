package lesson2;

public class claccNamberTwo {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        int c = 0;
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);
    }
    private static void test2(){
        int a = 5;
        int b = 5;

        int rezultOne = 2 * ++a;
        int rezultTwo = 2 * b++;

        System.out.println(rezultOne);
        System.out.println(rezultTwo);
        System.out.println(a + " " + b);
    }

    public static void test3(){
        int c = 1;
        System.out.println(c++ + c); //1 + 2 = 3, c=2
        System.out.println(++c + c); //3 + 3 = 6, c=3
        System.out.println(c + c++); //3 + 3 = 6, c=4
        c += ++c + c; //4 += 5 + 5 => 14
        System.out.println(c);
    }
}

