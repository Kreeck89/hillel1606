package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.name = "Vasya";
//        cat1.age = 5;
//
//        Cat cat2 = new Cat();
//        cat2.name = "Vasya";
//        cat2.age = 5;
//
//        System.out.println(cat1.equals(cat2));
//        System.out.println(cat1 == cat2);

//        int[] array = {222222, 54, 34, 86, 234, 45, 67, 34, 65, 45, 76, 9999};
//        final int minResult = forExample3(array);
//        System.out.println(minResult);
//        forExample2(array);
//        forExample(array);
//        doWhileExample(array);

//        SwitchCase switchCase = new SwitchCase();
//        switchCase.rootExample(2);

//        conditionalExample();

//        int[] array = new int[20];
//        System.out.println(Arrays.toString(array));
//
//        initArray(array, 10);
//        System.out.println(Arrays.toString(array));

        int[] arrayByIndex = new int[100];
        initArrayByIndex(arrayByIndex);
        System.out.println(Arrays.toString(arrayByIndex));
    }

    private static void doWhileExample(int[] array) {
        int count = 0;
        do {
            if (array[count] % 2 == 0) {
                System.out.println("Четное число: " + array[count]);
            } else  {
                System.out.println("Не четное число: " + array[count]);
            }
            count++;
        } while (count < array.length);
    }

    private static void forExample(int[] array) {
        for (int count = 0; count < array.length; count++) {
            if (array[count] % 2 == 0) {
                System.out.println("Четное число: " + array[count]);
            } else  {
                System.out.println("Не четное число: " + array[count]);
            }
        }
    }

    private static void forExample2(int[] array) {
        for (int count = array.length - 1; count >= 0; count--) {
            if (array[count] % 2 == 0) {
                System.out.println("Четное число: " + array[count]);
            } else  {
                System.out.println("Не четное число: " + array[count]);
            }
        }
    }

    private static int forExample3(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static void conditionalExample() {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter yor name:");
            String name = scanner.next();
            if (name.length() > 3) {
                break;
            }
        }
        System.out.println("Exited");
    }

    private static void initArray(int[] array, int bound) {
        final Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
    }

    private static void initArrayByIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
