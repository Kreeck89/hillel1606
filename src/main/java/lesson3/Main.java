package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MethodCreateExample.calcSum(10, 20); // Пример вызова статического метода другого класса с параметрами

        int first = 5;
        MethodCreateExample methodCreateExample = new MethodCreateExample();
        double result = methodCreateExample.calcDiff(14.2, 2.67); // Пример вызова не статического метода другого класса с параметрами
        System.out.println("calcDiff result: " + result);

        methodCreateExample.printText(); // Пример вызова не статического метода другого класса без параметров
        methodCreateExample.printText();
        methodCreateExample.printText();
        methodCreateExample.printText();

        printFromMain("Call from main method!"); // Вызов метода текущего класса

        methodCreateExample.exampleMethod("sd", 23, "str", 'c'); // Вызов метода с параметрами разных типов

        //Перегрузка методов
        Calculate calculate = new Calculate();
        calculate.sum(2, 5); //Пример возможности перегрузки методов


        //Scanner example
        Scanner scanner = new Scanner(System.in); //Создаем экземпляр класса для использования методов класса
        System.out.println("Enter some text:");
        String next = scanner.next();
        System.out.println("Inner text: " + next);

        String line = scanner.nextLine();
        System.out.println("Full inner text: " + line);

        double doubleVal = scanner.nextDouble();
        System.out.println("doubleVal: " + doubleVal);


        //Math класс
        int min = Math.min(10, 5); //У данного класса все методы статические, потому вызываеются без создания экземпляра класса
        System.out.println(min);

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);

        double ran = Math.random();
        System.out.println((int) (ran * 100));


        //Random класс
        Random random = new Random(); //Создаем экземпляр класса для вызова методов данного класса
        int users = 20; // = scanner.nextInt(); //Подсказка к ДЗ
        int intRandom = random.nextInt(users) + 1;
        System.out.println(intRandom);


        //Разница между == и equals()
        User user1 = new User();
        user1.name = "Alex";
        user1.surname = "Bobov";

        User user2 = new User();
        user2.name = "Ira";

        User user22 = user2;

        User user3 = new User();
        user3.name = "Alex";
        user3.surname = "Bobov";

        System.out.println(10 == 10); //Пример сравнения примитивов. Как правило == применяется только для примитивов
        System.out.println(user1 == user2);// Тут идет сравнение двух ссылок объектов, а не их параметров
        System.out.println(user2 == user22);

        System.out.println(user1.equals(user3)); //Тут выполняется именно сравнение объектов по их характеристикам.
    }

    /**
     * @param text Входящий параметр типа String
     *             Данный метод ничего не возвращает
     */
    private static void printFromMain(String text) {
        System.out.println(text);
    }
}
