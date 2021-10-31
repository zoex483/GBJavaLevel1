package HW1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная!");
        }
        if ((a + b) <= -1) {
            System.out.println("Сумма отрицательная!");
        }
    }

    public static void printColor() {
        int value = -1;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    private static void compareNumbers() {
        int a = 8;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}