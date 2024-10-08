package com.xoriant.bank.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.xoriant.bank.customerservice.impl.CustomerServiceImpl;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {

	
	public static void main(String[] args) {
		
		
	 SpringApplication.run(CustomerServiceApplication.class, args);

	
	
	}

}
