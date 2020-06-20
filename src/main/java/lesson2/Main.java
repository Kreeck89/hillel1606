package lesson2;

import java.util.Arrays;

public class Main {
    /**
     * @param args alt + enter и выбрать 'add javadoc'
     */
    public static void main(String[] args) {
        //линейный комментарий int i = 1; control + /
        /*блочный комментариы*/
        int i = 1;
        int a = 1/*, b = 2, c = 3*/;      //control + shift + /
        //TODO: необходимо провести урок

        //Дукремент и Инкремент
        int var = 10;
        //var++ и ++var -  это var = var + 1; или var +=1
        System.out.println(++var);
        // дальше переменная var = 11
        System.out.println(var++);
        // после принта переменная var = 12
        System.out.println(var);

        System.out.println(--var);
        // переменная var = 11
        System.out.println(var--);
        // после принат переменная var = 10
        System.out.println(var);
        System.out.println(var + 10);

        //определенная логика после которой идет инкремент/декремент
        //var++;

        //Преобразование типов / Приведение типов
//        byte b = 5;
//        short s = b;
//        int in1 = s;
//        int in2 = b;
//        long l = in1;
//        double d = s;
//        System.out.println(s);
//        System.out.println(in1);
//        System.out.println(l);
//        System.out.println(d);
//
//        int first = 1000;
//        double result = first / 7;
//        System.out.println(result);
//
//        double doubleVar = 12.456;
//        int in3 = (int) doubleVar;
//        System.out.println(in3);
//
//        byte byteVar = (byte) doubleVar;
//        System.out.println(byteVar);
//
//        byteVar = (byte) in3;
//        System.out.println(byteVar);
//
//        int in4 = 2000; // при преобразовании от -128 до 127
//        byteVar = (byte) in4;
//        System.out.println(byteVar);
//
//        long longVar = 10000000000L;
//        int intVar = (int) longVar;
//        System.out.println(intVar);

        //Одномерный массивы

//        int[] ints = new int[]; // Невозможно создать пустой массив, так как нельзя потом изменить размер.........
        // ................................................

        int[] ints = new int[50];
        String[] strings = new String[10];
        double[] doubles = new double[3];
        Object[] objects = new Object[10]; //используется крайне редко

        System.out.println("ints length: " + ints.length);
        ints[0] = 13;
        System.out.println(ints[49]);

        System.out.println(strings[6]);
        strings[6] = "Lesson 2";
        System.out.println(strings[6]);

        System.out.println(objects[6]);
        System.out.println(doubles[1]);

        long[] longs = new long[]{1, 2, 3, 4, 5};
//        long[] longs = {1, 2, 3, 4, 5};
        System.out.println("longs length: " + longs.length);
        System.out.println("longs[2]: " + longs[2]);

        System.out.println(longs[0]);
        System.out.println(longs[1]);
        System.out.println(longs[2]);
        System.out.println(longs[3]);
        System.out.println(longs[4]);
        System.out.println(Arrays.toString(longs)); // Выввести значения массива
        System.out.println(Arrays.toString(ints)); // Выввести значения массива
        System.out.println(Arrays.toString(strings)); // Выввести значения массива

        //Преобразование строки в примитив
        String str1 = "12";
        int parsedIntString = Integer.parseInt(str1);
        ints[3] = parsedIntString;

        double parserDoubleString = Double.parseDouble(str1);
        long parsedLongString = Long.parseLong(str1);

        String concatString = parsedIntString + "";
        System.out.println(concatString);

        String one = "one";
        String two = "two";
        String s = one + two;
        System.out.println(one + two); // Создается третья НОВАЯ строка

        //Многомерные массивы

        int[][] intArray = new int[5][5];
        System.out.println(Arrays.deepToString(intArray));
        System.out.println(Arrays.toString(intArray)); //не корректное отображение

        intArray[2][3] = 15;
        System.out.println(intArray[2][3]);
        System.out.println(Arrays.deepToString(intArray));

//        double[][] doubles1 = {{1, 2}, {3, 4}, {5, 6}};
        double[][] doubles1 = new double[][]{{1, 2}, {3, 4}, {5, 6}};
    }
}
