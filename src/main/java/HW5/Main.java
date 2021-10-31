package HW5;/* HW5 Geekbrains
__________________________________________________________________________________________
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
______________________________________________________________________
2. Конструктор класса должен заполнять эти поля при создании объекта.
_____________________________________________________________________________________________
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
____________________________________
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
"892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
__________________________________________________________________________
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
_________________________________________________________________________
 */

public class Main {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Jhon Smith", "Engineer", "smith123@mailbox.com", "89238882", 50000, 46);
        empCorp[1] = new Employee("Pedro Ross", "Creator", "ross123@mailbox.com", "89999914", 50000, 25);
        empCorp[2] = new Employee("Ally Di", "HR", "allydiii@mailbox.com", "89235555", 10000, 45);
        empCorp[3] = new Employee("Mary Glen", "PR-manager", "marymary@mailbox.com", "8999888556", 5000, 19);
        empCorp[4] = new Employee("Luck Skywoker", "Java-developer", "lucke123@mailbox.com", "894545545417", 3000, 36);
        for (Employee employee : empCorp)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}
