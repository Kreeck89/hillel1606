package lesson12.service;

import lesson12.model.Admin;
import lesson12.model.Support;
import lesson12.model.User;

public class SupportRegistrationService implements RegistrationService {
    private SupportDataService dataService;

    @Override
    public void register(User user) {
        dataService = new SupportDataService();

//        System.out.println("Enter you name:");
//        String name = scanner.next();
//        user.setName(name);
//
//
//        if (user instanceof Support) {
//            // enter value for Support
//        } else if (user instanceof Admin) {
//            //enter value for Admin
//        }

        //TODO: some logic for registration or validation User
        dataService.save(user);

    }
}
