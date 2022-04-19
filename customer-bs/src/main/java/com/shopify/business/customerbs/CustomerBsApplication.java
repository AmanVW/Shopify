package com.shopify.business.customerbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerBsApplication.class, args);
	}

}
