package lesson6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IOException {
//        String str = "Lesson";
//        System.out.println(str);
//        str += " 6"; // "Lesson" + " 6" = "Lesson 6"
//        System.out.println(str);
//
//        System.out.println("str.length(): " + str.length());
//
//        char[] chars = str.toCharArray();
//        System.out.println("chars[4]: " + chars[4]);
//
//        String text = "    text Example  ";
//        System.out.println("text: " + text);
//        System.out.println("text.trim(): " + text.trim());
//
//        text = "    "; // если text = null будет ошибка!!!
//        System.out.println("text.isEmpty(): " + text.trim().isEmpty());
//
//        if (text != null && !text.trim().isEmpty()) {
//            System.out.println(text);
//        }
//
//        System.out.println("String.valueOf(12): " + String.valueOf(12));
//
//        char ch = str.charAt(1);
//        System.out.println("str.charAt(1): " + ch);
//
//        String concatEx = str.concat("Surname").trim().concat("sdfsdf").trim();
//        System.out.println("concatEx: " + concatEx);
//
//        System.out.println("str.equals(\"Lesson 6\"): " + str.equals("Lesson 6"));
//        System.out.println("str.equals(\"lesson 6\"): " + str.equals("lesson 6"));
//
//        System.out.println("str.equalsIgnoreCase(\"lesson 6\"): " + str.equalsIgnoreCase("lesson 6"));
//
//        System.out.println("str.substring(2): " + str.substring(2));
//        System.out.println("str.substring(2, 4): " + str.substring(2, 4));
//
//        System.out.println("str.toLowerCase(): " + str.toLowerCase());
//        System.out.println("str.toUpperCase(): " + str.toUpperCase());
//
//        char unicode = 0x0950;
//        System.out.println("unicode: " + unicode);
//
//        unicode = 10084;
//        System.out.println("unicode: " + unicode);

        write();
//        read();

    }

    private static void write() throws IOException {
        String path = "src/main/resources/files/1/2/5/file.text";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }

        FileWriter fileWriter = new FileWriter(path, false);
        fileWriter.write("Hello Hillel\tHello Hillel");
        fileWriter.write("\n");
        fileWriter.write("Hello Hillel\n");
        fileWriter.close();
    }

    private static boolean read() throws IOException {
        String path = "src/main/resources/files/1/2/5/file.txt";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            return false;
        }

        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Hello hillel")) {
                return true;
            }
        }

        fileReader.close();
        scanner.close();
        return false;
    }
}
