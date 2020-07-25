package lesson12.test.controller;

import lesson12.test.Client;
import lesson12.test.service.ClientRegistrationService;
import lesson12.test.service.RegistrationService;
import lesson12.test.service.SupportRegistrationService;

import java.util.Scanner;

public class MainController {
    private static final int CLIENT_TYPE = 1;
    private static final int SUPPORT_TYPE = 2;
    private static Scanner scanner;


    public static void main(String[] args) {
        System.out.println("Enter type of user for registration:\n" +
                "1 - Client\n" +
                "2 - Support\n");

         scanner = new Scanner(System.in);
        final int typeOfUser = scanner.nextInt();

        if (typeOfUser == CLIENT_TYPE) {
            final ClientRegistrationService clientRegistrationService = new ClientRegistrationService();
            final Client client = new Client();
            register(clientRegistrationService, typeOfUser);
        } else if (typeOfUser == SUPPORT_TYPE) {
            final SupportRegistrationService supportRegistrationService = new SupportRegistrationService();
            register(supportRegistrationService, typeOfUser);
        }
    }

    private static void register(RegistrationService registrationService, int typeOfUser) {
        System.out.println("Enter your name:");
        String name = scanner.next();

    }
}
