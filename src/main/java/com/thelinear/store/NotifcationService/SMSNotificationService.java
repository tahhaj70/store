package com.thelinear.store.NotifcationService;


import org.springframework.stereotype.Service;


@Service("SMS")
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Sending through SMS : "+ message);
    }
}
