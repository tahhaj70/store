package com.thelinear.store.Order;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
//@Qualifier("Paypal")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(int amount) {
        System.out.println("PayPal Payment Processing... $" + amount);
    }

}
