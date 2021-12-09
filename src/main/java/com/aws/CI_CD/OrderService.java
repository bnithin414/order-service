package com.aws.CI_CD;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	

	public List<Order> getOrders(){
		return Arrays.asList(
					new Order(1,"Mobile",12000),
					new Order(5,"TV",32000),
					new Order(3,"Laptop",55000),
					new Order(2,"Fridge",23000),
					new Order(4,"Fan",3000)
				);
	}
	
}
