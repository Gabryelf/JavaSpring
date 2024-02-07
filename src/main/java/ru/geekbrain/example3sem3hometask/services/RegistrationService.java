package ru.geekbrain.example3sem3hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public UserService getUserService() {
        return userService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void processRegistration(String username, String email) {
        // Creating a new user from the provided parameters
        User user = new User(username, email);

        // Adding the created user to the repository using UserService
        userService.createUser(user);

        // Sending a notification using NotificationService
        notificationService.sendNotification("User registered: " + user);

        // Adding the user to the data processing list using DataProcessingService
        dataProcessingService.addUserToList(user);
    }
}


