package com.thelinear.store;


import com.thelinear.store.NotifcationService.NotificationManager;
import com.thelinear.store.Order.OrderService;
import com.thelinear.store.UserService.User;
import com.thelinear.store.UserService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {
	static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
	UserService userService = context.getBean(UserService.class);

		userService.registerService(new User(001L,"tahhaj70@gmail.com","Muhammad Taha Javaid","Minions@678"));
		userService.registerService(new User(001L,"tahhaj70@gmail.com","Muhammad Taha Javaid","Minions@678"));
	    // OrderService orderService = context.getBean(OrderService.class);
	    // orderService.placeOrder();

	}
}
