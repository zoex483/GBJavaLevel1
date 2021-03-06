/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом
выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */
package HW6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Фараон");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Граф");
        Dog dog1 = new Dog("Хамер");
        Dog dog2 = new Dog("Альф");
        Dog dog3 = new Dog("Барон");

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

