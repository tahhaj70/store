package com.thelinear.store;


import com.thelinear.store.NotifcationService.NotificationManager;
import com.thelinear.store.Order.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {
	static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

	OrderService orderService = context.getBean(OrderService.class);
	orderService.placeOrder();

	}
}
