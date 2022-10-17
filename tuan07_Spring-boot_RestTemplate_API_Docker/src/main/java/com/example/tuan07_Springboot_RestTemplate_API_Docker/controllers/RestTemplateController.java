package com.example.tuan07_Springboot_RestTemplate_API_Docker.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/resttemplate/api")
public class RestTemplateController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/chuyenbay")
	public List<Object> getChuyenBays() {
		String url="http://localhost:8081/api/chuyenbay";
		
		Object[] objects = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(objects);
	}
}
