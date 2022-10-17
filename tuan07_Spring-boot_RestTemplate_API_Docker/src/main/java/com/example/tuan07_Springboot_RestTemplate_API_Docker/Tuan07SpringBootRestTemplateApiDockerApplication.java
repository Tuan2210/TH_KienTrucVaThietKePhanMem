package com.example.tuan07_Springboot_RestTemplate_API_Docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Tuan07SpringBootRestTemplateApiDockerApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Tuan07SpringBootRestTemplateApiDockerApplication.class, args);
	}

}
