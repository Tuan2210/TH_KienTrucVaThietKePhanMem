package com.example.tuan04_Spring_Data_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tuan04_Spring_Data_JPA.services.ChuyenBayService;

@SpringBootApplication
public class Tuan04SpringDataJpaApplication {
	final ChuyenBayService chuyenBayService;
	
	public Tuan04SpringDataJpaApplication(ChuyenBayService chuyenBayService) {
		this.chuyenBayService = chuyenBayService;
	}


	public static void main(String[] args) {
		SpringApplication.run(Tuan04SpringDataJpaApplication.class, args);
	}

}
