package com.orderinfomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class OrderinfomanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderinfomanagementApplication.class, args);
	}
public RestTemplate restTemplate(RestTemplateBuilder builder) {
	return builder.build();
}
}
