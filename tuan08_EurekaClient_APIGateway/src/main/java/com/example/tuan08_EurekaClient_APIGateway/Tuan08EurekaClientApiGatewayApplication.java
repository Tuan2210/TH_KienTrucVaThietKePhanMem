package com.example.tuan08_EurekaClient_APIGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Tuan08EurekaClientApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tuan08EurekaClientApiGatewayApplication.class, args);
	}

}
