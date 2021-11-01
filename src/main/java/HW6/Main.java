/*
____________________________________________________________________________________________________________________
1. Создать классы Собака и Кот с наследованием от класса Животное.
____________________________________________________________________________________________________________________
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом
выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
____________________________________________________________________________________________________________________
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
собака 10 м.).
_____________________________________________________________________________________________________________________
4. * Добавить подсчет созданных котов, собак и животных.
______________________________________________________________________________________________________________________
 */

package HW6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Печенька");
        Cat cat3 = new Cat("Фараон");
        Dog dog1 = new Dog("Хамер");
        Dog dog2 = new Dog("Альф");
        Dog dog3 = new Dog("Арон");

        System.out.println("Создано " + Animal.getAnimalCount() + " животных,");
        System.out.println("Среди них " + Cat.getCatCount() + " котов и " + Dog.getDogCount() + " собак.\n");
        System.out.println("На старте котики");
        cat1.run(151);
        cat1.swim(5);
        cat2.run(200);
        cat2.swim(10);
        cat3.run(210);
        cat3.swim(2);
        System.out.println("На старте собачки");
        dog1.run(300);
        dog1.swim(5);
        dog2.run(500);
        dog2.swim(10);
        dog3.run(600);
        dog3.swim(15);
    }
}
