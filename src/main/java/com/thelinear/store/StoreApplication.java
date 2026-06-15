package com.thelinear.store;


import com.thelinear.store.NotifcationService.NotificationManager;
import com.thelinear.store.Order.OrderService;
import com.thelinear.store.entities.User;
import com.thelinear.store.UserService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {
	static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
	UserService userService = context.getBean(UserService.class);

		var user = User.builder().
				name("Muhammad Taha Javaid").
				password("Justman@123").
				email("tahhaj70@gmail.com");
	}
}
