package lesson12.controller;

import lesson12.model.Admin;
import lesson12.model.Client;
import lesson12.model.Support;
import lesson12.model.User;
import lesson12.service.ClientRegistrationService;
import lesson12.service.RegistrationService;
import lesson12.service.SupportRegistrationService;

import java.util.Scanner;

public class MainController {
    private static final int CLIENT_TYPE = 1;
    private static final int SUPPORT_TYPE = 2;
    private static final int ADMIN_TYPE = 3;

    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("Enter registration type User:\n" +
                "1 - for Client\n" +
                "2 - for Support\n" +
                "3 - for Admin");

        scanner = new Scanner(System.in);
        final int typeOfUser = scanner.nextInt();

        if (typeOfUser == CLIENT_TYPE) {
            ClientRegistrationService clientRegistrationService = new ClientRegistrationService();
            Client client = new Client();
            clientRegistrationService.register(client);

        } else if (typeOfUser == SUPPORT_TYPE) {
            SupportRegistrationService supportRegistrationService = new SupportRegistrationService();
            Support support = new Support();
            supportRegistrationService.register(support);

        } else if (typeOfUser == ADMIN_TYPE) {
            SupportRegistrationService supportRegistrationService = new SupportRegistrationService();
            Admin admin = new Admin();
            supportRegistrationService.register(admin);
        }
    }
}
