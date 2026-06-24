package com.thelinear.store;
import com.thelinear.store.entities.Address;
import com.thelinear.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {
	static void main(String[] args) {

//	ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//	UserService userService = context.getBean(UserService.class);

		var user = User.builder().name("Taha").email("tahhaj70@gmail.com").password("12345").build();

		user.addTag("MyFavourite");

		System.out.println(user);

	}
}
