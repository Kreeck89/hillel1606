package lesson3;

public class MethodCreateExample {

    /**
     * @param a Первый входящий параметр типа int
     * @param b Второй входящий параметр типа int
     *          Метод ничего не возвращает
     */
    public static void calcSum(int a, int b) {
        System.out.println("Sun a+b: " + (a + b));
    }

    /**
     * @param a Первый входящий параметр типа double
     * @param b Второй входящий параметр типа double
     * @return double параметр в ходе внутренней логики
     */
    public double calcDiff(double a, double b) {
        System.out.println("inner params: " + a + ", " + b);
        // может быть любая логика метода....
        return a - b;
    }

    /**
     * Метод не содержит входящих параметров
     * Метод ничего не возвращает
     */
    public void printText() {
        System.out.println("Hello from lesson 3!");
    }

    /**
     * Метод ничего не принимает
     * Метод ничего не возвращает
     * Метод приватный/скрытый, доступный к вызову только из данного класса
     */
    private void innerMethod() {
        System.out.println("Call inner method");
    }

    /**
     * @param first Первый входящий параметр типа String
     * @param second Второй входящий параметр типа String
     * @return String параметр в ходе внутренней логики
     */
    public String concatStrings(String first, String second) {
        if (validate(first, second)) {
            return first + second;
        }
        return null;
    }

    /**
     * @param first Первый входящий параметр типа String
     * @param second Второй входящий параметр типа String
     * @return boolean(true/false) в случае проверки полей входящих
     */
    private boolean validate(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        return true;
    }

    /**
     * @param obj Первый входящий параметр типа Object
     * @param first Второй входящий параметр типа int
     * @param str Третий входящий параметр типа String
     * @param ch Четвертый входящий параметр типа char
     */
    public void exampleMethod(Object obj, int first, String str, char ch) {

    }
}
