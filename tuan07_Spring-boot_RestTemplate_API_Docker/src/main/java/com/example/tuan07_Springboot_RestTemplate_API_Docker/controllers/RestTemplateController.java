package com.example.tuan07_Springboot_RestTemplate_API_Docker.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.tuan07_Springboot_RestTemplate_API_Docker.entities.NguoiDung_User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@RestController
@RequestMapping("/api/resttemplate")
public class RestTemplateController {

	@Autowired
	private RestTemplate restTemplate;
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	//list chuyenbay
	@GetMapping("/chuyenbay")
	public List<Object> getChuyenBays() {
		String url="http://localhost:8081/api/chuyenbay";
		
		Object[] objects = restTemplate.getForObject(url, Object[].class);
		System.out.println("Danh sách chuyến bay:\n" +gson.toJson(Arrays.asList(objects)));
		return Arrays.asList(objects);
	}
	
	//list nguoidung-user
	@GetMapping("/nguoidung")
	public List<Object> getNguoiDungs() {
		Object[] objects = restTemplate.getForObject("http://localhost:8081/api/nguoidung", Object[].class);
		System.out.println("Danh sách người dùng:\n" +gson.toJson(Arrays.asList(objects)));
		return Arrays.asList(objects);
	}
	
	@GetMapping("/nguoidung/{id}")
	public List<Object> getNguoiDungById(@PathVariable("id") String mand) {
		String url="http://localhost:8081/api/nguoidung/" +mand;
		
		Object objects = restTemplate.getForObject(url, Object.class);
		System.out.println("Người dùng " +mand +":\n" +gson.toJson(Arrays.asList(objects)));
		return Arrays.asList(objects);
	}
	
	@PostMapping("/nguoidung/add")
	public String createUserObj(@RequestBody NguoiDung_User nguoiDung_User) {
//		NguoiDung_User nguoiDung_User = new NguoiDung_User("ND05", "John Constantine", "1974");
//		NguoiDung_User createUser = restTemplate.postForObject("http://localhost:8081/api/nguoidung/add", nguoiDung_User, NguoiDung_User.class);
		
//		NguoiDung_User nguoiDung_User = new NguoiDung_User("ND06", "John Connor", "1984");
//		ResponseEntity<NguoiDung_User> createUser = restTemplate.postForEntity("http://localhost:8081/api/nguoidung/add", nguoiDung_User, NguoiDung_User.class);
//		System.out.println("Đã thêm người dùng-user:\n" +gson.toJson(createUser.getBody()));
		
		HttpEntity<NguoiDung_User> createUser = new HttpEntity<>(nguoiDung_User);
		System.out.println("Đã thêm người dùng-user:\n" +gson.toJson(createUser.getBody()));
		return restTemplate.exchange("http://localhost:8081/api/nguoidung/add", HttpMethod.POST, createUser, String.class).getBody();
	}
	
	@PutMapping("/nguoidung/{id}")
	public void updateUser(@PathVariable("id") String mand, @RequestBody NguoiDung_User nguoiDung_User) {
		String url="http://localhost:8081/api/nguoidung/" +mand;
		
		restTemplate.put(url, nguoiDung_User);
	}
	
	@DeleteMapping("/nguoidung/{id}")
	public void deleteUser(@PathVariable("id") String mand) {
		String url="http://localhost:8081/api/nguoidung/" +mand;
		
		restTemplate.delete(url);
	}
}
