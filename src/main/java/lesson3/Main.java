package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MethodCreateExample.calcSum(10, 20);
//
//        int first = 5;
//        MethodCreateExample methodCreateExample = new MethodCreateExample();
//        double result = methodCreateExample.calcDiff(14.2, 2.67);
//        System.out.println("calcDiff result: " + result);
//
//        methodCreateExample.printText();
//        methodCreateExample.printText();
//        methodCreateExample.printText();
//        methodCreateExample.printText();
//
//        printFromMain("Call from main method!");
//
//        methodCreateExample.exampleMethod("sd", 23, "str", 'c');
//
//        //Перегрузка методов
//        Calculate calculate = new Calculate();
//        calculate.sum(2, 5);




        //Scanner example
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter some text:");
//        String next = scanner.next();
//        System.out.println("Inner text: " + next);

//        String line = scanner.nextLine();
//        System.out.println("Full inner text: " + line);

//        double doubleVal = scanner.nextDouble();
//        System.out.println("doubleVal: " + doubleVal);

        int min = Math.min(10, 5);
        System.out.println(min);

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);

        double ran = Math.random();
        System.out.println((int) (ran * 100));


        Random random = new Random();
        int users = 20; // = scanner.nextInt();
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

        System.out.println(10 == 10);
        System.out.println(user1 == user2);
        System.out.println(user2 == user22);

        System.out.println(user1.equals(user3));
    }

    private static void printFromMain(String text) {
        System.out.println(text);
    }
}
