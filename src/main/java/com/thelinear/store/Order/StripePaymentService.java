package com.thelinear.store.Order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiURL;

    @Override
    public void processPayment(int amount) {
        System.out.println("Stripe Payment Processing... $" + amount);
        System.out.println("API URL: " + apiURL);
    }

}
