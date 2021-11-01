package HW6;

public abstract class Animal {
    private static int animalCount = 0;
    private String name;
    private int maxRunLength;
    private int maxSwimLength;

    public Animal(String name, int maxRunLength, int maxSwimLength) {
        animalCount++;
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }
    public void run(int runLength) {
        if (runLength <= maxRunLength) {
            System.out.println(name + " пробежал " + runLength + " метров.");
        } else {
            System.out.println(name + " пробежал только " + maxRunLength + " метров и больше не может.");
        }
    }
    public void swim(int swimLength) {
        if (this instanceof Cat) {
            System.out.println("Коты не плавают !");
        } else {
            if (swimLength <= maxSwimLength) {
                System.out.println(name + " проплыл " + swimLength + " метров.");
            } else {
                System.out.println(name + " проплыл только " + maxSwimLength + " метров и больше не может.");
            }
        }
    }
    public static int getAnimalCount(){
        return animalCount;
    }
}
