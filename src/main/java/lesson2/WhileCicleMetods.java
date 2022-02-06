package lesson2;

public class WhileCicleMetods {

    static int orangeCaunt = 8;
    public static void main(String[] args) {
        int appleCount = 10;

        while (appleCount > 0){
            appleCount--;
            System.out.println(appleCount);

        }

        while (isOrangeCountPositive()){
            eatOrange();
            printOrangeCaunt();


        }
    }
    private static boolean isOrangeCountPositive(){
        return orangeCaunt > 0;
    }

    private static void eatOrange(){
        orangeCaunt--;
    }
    private static void printOrangeCaunt(){
        System.out.println("Количество апельсинов: " + orangeCaunt);
    }
}
