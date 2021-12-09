package com.aws.CI_CD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsCiCdApplication {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsCiCdApplication.class, args);
	}
	
	@GetMapping("/order")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}

	
	
}
