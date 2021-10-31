package HW6;/*
____________________________________________________________________
1. Создать классы Собака и Кот с наследованием от класса Животное.
__________________________________________________________________
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
______________________________________________________________________________________________________________
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака
0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
________________________________________________________________________________________________________________
4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например,
dog1.run(150); -> результат: run: true)
______________________________________________________________________________________________________________
5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м.,
у другой 600 м.
_____________________________________________________________________________________________________________
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = Math.random() * 500;
        double distanceJump = Math.random() * 3;
        double distanceSwim = Math.random() * 0;
        Cat cat = new Cat(distanceRun, distanceJump, distanceSwim);

        distanceRun = Math.random()*2000;
        distanceJump = Math.random()*2;
        distanceSwim = Math.random()*100;
        Animal dog = new Dog(distanceRun, distanceJump, distanceSwim);


        System.out.println("Кот Тимофей может пробежать: " + cat.getAnimalDistanceRun() +
                " м. \nСобака Бобик может пробежать: " + dog.getAnimalDistanceRun() + " м.");

        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кот Тимофей пытается пробежать(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака Бобик пытается пробежать(" + distance + "). Результат: " + dog.run(distance));
        System.out.println("\n****************\n");

        System.out.println("Кот Тимофей может прыгнуть: " + cat.getAnimalDistanceJump() +
                " м. \nСобака Бобик может прыгнуть: " + dog.getAnimalDistanceJump() + " м.");

        System.out.println("Введите высоту препятствия:");
        distance = scanner.nextDouble();

        System.out.println("Кот Тимофей пытается прыгнуть(" + distance + "). Результат: " + cat.jump(distance));
        System.out.println("Собака Бобик пытается прыгнуть(" + distance + "). Результат: " + dog.jump(distance));
        System.out.println("\n****************\n");

        System.out.println("Кот Тимофей может проплыть: " + cat.getAnimalDistanceSwim() +
                " м. \nСобака Бобик может проплыть: " + dog.getAnimalDistanceSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кот Тимофей пытается проплыть(" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака Бобик пытается проплыть(" + distance + "). Результат: " + dog.swim(distance));

    }


}
