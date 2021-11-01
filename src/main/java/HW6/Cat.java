package HW6;

public class Cat extends Animal {
    private static int catCounter = 0;
    private static final int MAXRUNLENGTH = 200;
    private static final int MAXSWIMLENGTH = 0;

    public Cat(String name) {
        super(name, MAXRUNLENGTH, MAXSWIMLENGTH);
        catCounter++;
    }

    public static int getCatCount(){
        return catCounter;
    }
}
