package com.example.tuan07_Springboot_RestTemplate_API_Docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan07_Springboot_RestTemplate_API_Docker.entities.NguoiDung_User;
import com.example.tuan07_Springboot_RestTemplate_API_Docker.repositories.NguoiDungRepo;

@RestController
@RequestMapping("/api")
public class NguoiDungController {

	@Autowired
	private NguoiDungRepo nguoiDungRepo;
	
	@GetMapping("/nguoidung")
	public List<NguoiDung_User> listNguoiDung_Users() {
		return nguoiDungRepo.findAll();
	}
	
	@GetMapping("/nguoidung/{id}")
	public List<NguoiDung_User> findChuyenBayByGaDen(@PathVariable("id") String mand) {
		return nguoiDungRepo.findNguoiDungByMaND(mand);
	}
	
	@PostMapping("/nguoidung/add")
	public NguoiDung_User createUser(@RequestBody NguoiDung_User user) {
		return nguoiDungRepo.save(user);
		//thêm trong psotman dùng post, body-raw và chuyển text -> json
	}
}
