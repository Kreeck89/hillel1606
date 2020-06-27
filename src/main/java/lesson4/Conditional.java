package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Conditional {

    /**
     * @param first Первый входящий параметр
     * @param second Второй входящий параметр
     *
     * Пример использования цикла while - пока первое число будет больше второго, будет выпонляться логика цикла
     */
    public void whileExample1(int first, int second) {
        while (first > second) {
            System.out.println("first + second: " + (first + second));
            first--;
        }
        System.out.println("Exited");
        //......
    }

    /**
     * Пример использования цикла while
     * Пока пользователь не напишет 'x' программа будет просить его ввести это значение для выхода
     */
    public static void whileExample2() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (!exit.equals("x")) {
            System.out.println("Enter 'x' for exit.");
            exit = scanner.next();
        }
    }

    /**
     * @param text Первый входящий параметр для печати в ходе выполнения цикла
     * @param counter Переменная для указания количества раз печати текста
     *
     *                Пример использования цикла do-while.
     *                Один раз код выполнится в любом случае, даже если условие не проходит валидацию
     */
    public void doWhileExample11(String text, int counter) {
        do {
            System.out.println(text);
            counter--;
        } while (counter > 0);
        System.out.println("Exited");
    }

    /**
     * @param counter Входящий параметр, который показывает кокй предел цикла будет при прохождении
     *                Пример использования цикла for.
     */
    public static void forExample1(int counter) {
        for (int i = 0; i < counter; i++){
            System.out.println("counter: " + counter);
            //some logic....
        }
    }

    /**
     * @param counter Входящий параметр, который показывает кокй предел цикла будет при прохождении
     *                Пример использования while цикла вместо for
     *                Это аналог примера метода forExample1(int counter);
     */
    public static void forChangeWithWhile(int counter) {
        int i = 0;
        while (i < counter) {
            System.out.println("counter: " + counter);
            //some logic....
            i++;
        }
    }

    /**
     * @param array Входящий параметр - массив любого размера
     *              В данном методе мы рассмотрели пример использования цикла for на массиве
     */
    public void forExample2(int[] array) {
        System.out.println("Received array is: " + Arrays.toString(array));
        System.out.println("Array length is: " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] *= 5; // array[i] = array[i] * 5;
            System.out.println("Index of Array is: " + i);
            System.out.println("Changed array is(in process): " + Arrays.toString(array));
        }
        System.out.println("Changed array is: " + Arrays.toString(array));
        //array.length.fori + Enter
    }
}
