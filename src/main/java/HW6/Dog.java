package HW6;

public class Dog extends Animal {
    private static final int MAXRUNLENGTH = 500;
    private static final int MAXSWIMLENGTH = 10;
    private static int dogCount = 0;
    public Dog(String name) {
        super(name, MAXRUNLENGTH, MAXSWIMLENGTH);
        dogCount++;
    }
    public static int getDogCount(){
        return dogCount;
    }
}
