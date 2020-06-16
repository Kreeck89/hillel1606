package lesson1;

public class Main {
    public static void main(String[] args) { //psvm
        String helloHillel = "H e l l o H i l l e l";
        String helloHillel2 = "H e l l o H i l l e l"; //control + d для дублирования строки
        String wrongHillel = new String("H e l l o H i l l e l");

//        hello_hillel // control + / для комментирования строки на которой находится курсор
//        HELLO_HILLEL
        System.out.println(helloHillel); // sout и нажать Enter

        byte byteName = 1;
        short shortName = 2;
        int intName = 10;
        long longName = 1001;
        float floatName = 12.54F;
        double doubleName = 12.54;
        char charName = 'a';
        boolean booleanName = true; // control + shift + enter для автоформатирования строки
        System.out.println(byteName);
        System.out.println(12.22);

        System.out.println(byteName + 10);
        System.out.println(shortName - byteName);
        System.out.println(15 + 24);
        System.out.println(intName * 5);
        System.out.println(longName / 3); // control + alt + l для форматирования класса в читабельный вид
        System.out.println(doubleName / 3);
        System.out.println(longName % 3);

        int var = 1000;
        var += 3; // var = var + 3;
        var -= 3; // var = var - 3;
        var *= 3; // var = var * 3;
        var /= 3; // var = var / 3;
        var %= 3; // var = var % 3;
        System.out.println("var: " + var);

        System.out.println(var > 23);
        System.out.println(var == 1);
        System.out.println(charName != 12);

        int first; // Создаем переменную типа int но не задавая ей значения изначально
        first = 999; // Задали значение
        int second = 101, third = 13; // Возможность в строку задать несколько переменных одного типа, если есть необходимость.
    }
}
