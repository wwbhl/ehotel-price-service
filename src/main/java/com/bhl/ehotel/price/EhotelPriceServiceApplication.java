package com.bhl.ehotel.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EhotelPriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhotelPriceServiceApplication.class, args); 
	}
	
}