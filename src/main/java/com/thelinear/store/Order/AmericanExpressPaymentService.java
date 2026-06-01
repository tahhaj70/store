package com.thelinear.store.Order;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("AMEX")
public class AmericanExpressPaymentService implements PaymentService {
    @Override
    public void processPayment(int amount) {
        System.out.println("AmericanExpress Payment Processing... $" + amount);
    }

}
