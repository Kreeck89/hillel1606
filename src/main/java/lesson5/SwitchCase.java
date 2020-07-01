package lesson5;

import java.util.Scanner;

public class SwitchCase {

    public void rootExample(int command) {
        if (command == 1) {
            switchCaseIntExample();
        } else {
            switchCaseStringExample();
        }
    }

    private void switchCaseIntExample() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other day");
                break;
        }

        //Аналог в if-else
//        if (day == 1) {
//            System.out.println("Mon");
//        } else if (day == 2) {
//            System.out.println("Tue");
//        } else if (day == 3) {
//            System.out.println("Wed");
//        } else {
//            System.out.println("Other day");
//        }
    }

    private void switchCaseStringExample() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month of Year:");
        String month = scanner.next();

        switch (month) {
            case "Jan":
                System.out.println("Jan have 31 days");
                break;
            case "Feb":
                System.out.println("Feb have 29 days");
                break;
            default:
                System.out.println("Don't know month.");
                break;
        }

//        month = null;
//        if (month.equals("Jan") || month.equals("January")) {
//            System.out.println("Jan have 31 days");
//        }
    }

}
