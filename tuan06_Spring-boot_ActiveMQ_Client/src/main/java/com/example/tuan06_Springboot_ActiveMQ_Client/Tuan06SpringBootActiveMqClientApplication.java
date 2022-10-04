package com.example.tuan06_Springboot_ActiveMQ_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Tuan06SpringBootActiveMqClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tuan06SpringBootActiveMqClientApplication.class, args);
	}

}
