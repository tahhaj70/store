package com.thelinear.store;
import com.thelinear.store.Service.AddressService;
import com.thelinear.store.Service.UserService;
import com.thelinear.store.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {
	static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
	var service = context.getBean(AddressService.class);
	service.showAddress();
	}
}
