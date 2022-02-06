package lesson2;

public class ForciklMetod {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        final int LIMIT_OF_CYCLE = 10; // константа. Пишется большими буквами с разделением нижних подчеркиваний.

        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            for (int j = 0; j < 10; j++) {
                /*    System.out.printf("$ i: %d, j: %d%n", i, j);*/ // форматированный вывод где %d - означает целое число,
                // а %n - перенос строки.
                System.out.print("# ");
            }
            System.out.println();
        }

        String str = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                str += "$ ";
            } else {
                str += "@ ";
            }
            System.out.print(str);

            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
                System.out.print("№ ");
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                break;
            }
            if (i % 2 == 0 && i != 0) {
                continue; // используется для прерывания цикла с учетом условия цикла и после чего цикл продолжается.
            }
            System.out.println("Число " + i);

        }
    }


}
