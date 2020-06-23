package lesson3;

public class Calculate {

    //Не корректная имплементация
//    public void sumTwoIntVars(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public void sumThreeIntVars(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }
//
//    public void sumFourIntVars(int a, int b, int c, int d) {
//        System.out.println(a + b + c + d);
//    }
//
//    public void sumTwoDoubleVars(double a, double b) {
//        System.out.println(a + b);
//    }

    //перегрузка методов

    /**
     * @param a Первый входящий параметр типа int
     * @param b Второй входящий параметр типа int
     *          Пример применения перегрузки методов
     */
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void sum(double a, double b) {
        System.out.println(a + b);
    }
}
