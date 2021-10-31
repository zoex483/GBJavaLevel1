package HW2;
public class Main {
    public static boolean methodA (int a, float b) {
        if (a + b < 10 || a + b > 20) {
            return false;
        }
        return true;
    }
    public static void methodB (int a){
        if ( a < 0) {
            System.out.println("Число отрицательное!");
        }
        else {
            System.out.println("Число положительное!");
        }
    }
    public static boolean methodC(int a){
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static void methodD (int year){
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }
    }
}



