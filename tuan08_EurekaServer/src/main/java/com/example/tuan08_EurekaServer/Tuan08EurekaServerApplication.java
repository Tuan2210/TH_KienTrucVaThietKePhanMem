package com.example.tuan08_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Tuan08EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tuan08EurekaServerApplication.class, args);
	}

}
