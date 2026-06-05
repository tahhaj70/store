package com.thelinear.store.Order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@Configuration
public class AppConfig {
    @Value("${payment.method}")
    private String paymentMethod;

    @Bean
    public PaymentService paymentService() {
        if (paymentMethod.equals("stripe"))
        {
            return new StripePaymentService();}
        else if (paymentMethod.equals("paypal")){
            return new PaypalPaymentService();
        }
        return new AmericanExpressPaymentService();
    }

    @Bean
    OrderService orderService(){
        System.out.println("Creating OrderService bean...");
        return new OrderService(paymentService());
    }


}
