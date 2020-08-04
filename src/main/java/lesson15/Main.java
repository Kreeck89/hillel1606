package lesson15;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws RootPrivetException {

//        try {
//            privateException(11);
//            exception();
//        } catch (IOException e) {
//            System.out.println("Some error!");
//            throw new Error();
//        }

//        try {
//            privateException(11);
//        } catch (PrivateException e) {
//            System.out.println("Logic with PrivateException");
//            System.out.println("Logic with PrivateException");
//            System.out.println("Logic with PrivateException");
//            throw new RootPrivetException();
//        } catch (SecondPrivateException e) {
//            System.out.println("EXCEPTION LOGIC ERROR SecondPrivateException");
//            System.out.println("EXCEPTION LOGIC ERROR SecondPrivateException");
//            System.out.println("EXCEPTION LOGIC ERROR SecondPrivateException");
//            System.out.println("EXCEPTION LOGIC ERROR SecondPrivateException");
//            throw new RootPrivetException();
//        } catch (IOException e) {
//            System.out.println("LOGGING EXCEPTION!!!");
//            System.out.println("LOGGING EXCEPTION!!!");
//            System.out.println("LOGGING EXCEPTION!!!");
//            throw new RootPrivetException();
//        }

        try {
            privateException(11);
        } catch (PrivateException | SecondPrivateException e) {
            e.printStackTrace();
        }

        System.out.println("End of programm");
//        error();


    }

    private static void exception() throws IOException {
        throw new IOException();
    }

    private static void error() {
        throw new UnknownError();
    }

    private static void privateException(int exceptionType) throws PrivateException, SecondPrivateException {
        if (exceptionType == 1) {
            throw new PrivateException();
//            System.out.println("String after Exception");
        } else if (exceptionType == 11) {
            throw new SecondPrivateException();
        }
        System.out.println("some programm example");
        System.out.println("some programm example");
        System.out.println("some programm example");
        System.out.println("some programm example");
    }

    private static void writerExample() {
        try (FileWriter writer = new FileWriter("")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
