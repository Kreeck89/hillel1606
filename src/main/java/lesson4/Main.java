package lesson4;

public class Main {
    public static void main(String[] args) {

        Conditional conditional = new Conditional();
        conditional.whileExample1(5, 15);
        conditional.doWhileExample11("do-while test", 12);

        int aliasCounter = 12;
        String aliasText = "do-while test";
        conditional.doWhileExample11(aliasText, aliasCounter);

        Conditional.forExample1(10);

        Conditional.whileExample2();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70};
        conditional.forExample2(array);
        conditional.forExample2(array2);

        int age = 19;
        ifExample(age);
        ifExample2(age);
        ifExample3(age);
        continueBreakReturnExample(array);
    }

    /**
     * @param age Входящий параметр
     *            Пример использования if/else-if/else
     *            Условный оператор - в случае верного условия в круглых скобка будет выполняться то,
     *            что в фигурных скобках данного условия
     *
     *            Если в одно из условий зашли, то другие уже не проверяются
     */
    private static void ifExample(int age) {
        if (age < 18) {
            System.out.println("You are so yang!");
        } else if (age < 21) {
            System.out.println("Can buy cigarettes");
        } else {
            System.out.println("Can buy cigarettes and alcohol");
        }
    }

    /**
     * @param age Входящий параметр
     *
     *            В данном примере в отличии от ifExample три отдельных условных оператора if
     *            И проверка будет в каждом из них и если параметр будет подходить под несколько условий,
     *            То будет выполняться несколько блоков разных условий
     */
    private static void ifExample2(int age) {
        if (age < 18) {
            System.out.println("You are so yang!");
        }

        if (age < 21) {
            System.out.println("Can buy cigarettes");
        }

        if (age >= 21) {
            System.out.println("Can buy cigarettes and alcohol");
        }
    }

    /**
     * @param age Входящий параметр
     *
     *            Тернарный оператор!
     *            Пример строчной записи условного оператора if-else
     */
    private static void ifExample3(int age) {
        String result = age > 18 ? "You are welcome" : "Do not have access";
//        String result;
//        if (age > 18) {
//            result = "You are welcome";
//        } else {
//            result = "Do not have access";
//        }
        System.out.println(result);
    }

    /**
     * @param first входящий параметр
     * @param second входящий параметр
     *
     *               Метод в котором приведен пример как не стоит писать вложенные операторы
     */
    private static void wrongInnerConditionalExample(int first, int second) {
        if (first <= second) {
            if (second != 0) {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        while (i < 50) {
                            System.out.println("Wrong example");
                        }
                    }
                }
            }
        }
    }

    /**
     * @param array Массив для разбора упровляющих команд
     *
     *              В данном примере мы посмотрели как работают команды:
     *              continue
     *              break
     *              return
     */
    private static void continueBreakReturnExample(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 6) {
                break;
            }
            if (i == 5) {
                return;
            }
            System.out.println("Index is: " + i);
        }
        System.out.println("Exited");
    }
}
