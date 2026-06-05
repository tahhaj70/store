package com.thelinear.store.UserService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{

    @Value("${Email.host}")
    private String host;
    @Value("${Email.port}")
    private int port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("\n Connecting to server.... \n Please Wait \n" + " Host : " + host + "\n Port : " + port);
        System.out.println("\n Email : " + recipientEmail);
        System.out.println(message);
    }
}
