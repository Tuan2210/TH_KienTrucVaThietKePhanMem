package com.example.tuan07_Springboot_RestTemplate_API_Docker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan07_Springboot_RestTemplate_API_Docker.entities.NguoiDung_User;
import com.example.tuan07_Springboot_RestTemplate_API_Docker.repositories.NguoiDungRepo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/api")
public class NguoiDungController {

	@Autowired
	private NguoiDungRepo nguoiDungRepo;
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@GetMapping("/nguoidung")
	public List<NguoiDung_User> listNguoiDung_Users() {
		return nguoiDungRepo.findAll();
	}
	
//	@GetMapping("/nguoidung/{id}")
//	public List<NguoiDung_User> findChuyenBayByGaDen(@PathVariable("id") String mand) {
//		return nguoiDungRepo.findNguoiDungByMaND(mand);
//	}
	@GetMapping("/nguoidung/{id}")
	public ResponseEntity<NguoiDung_User> getNguoiDungByMaND(@PathVariable("id") String mand) throws Exception {
		NguoiDung_User nguoiDung_User = nguoiDungRepo.findById(mand)
													 .orElseThrow(() -> new Exception("Ko tìm thấy người dùng có id là " +mand));
		System.out.println("Người dùng id là " +mand +":\n" +gson.toJson(nguoiDung_User));
		return ResponseEntity.ok().body(nguoiDung_User);
	}
	
	@PostMapping("/nguoidung/add")
	public NguoiDung_User createUser(@RequestBody NguoiDung_User user) {
		return nguoiDungRepo.save(user);
		//thêm trong psotman dùng post, body-raw và chuyển text -> json
	}
	
	@PutMapping("/nguoidung/{id}")
	public ResponseEntity<NguoiDung_User> updateUser(@PathVariable("id") String mand, @RequestBody NguoiDung_User userDetails) throws Exception {
		NguoiDung_User updateUser = nguoiDungRepo.findById(mand)
				 								 .orElseThrow(() -> new Exception("Ko tìm thấy người dùng có id là " +mand));
		updateUser.setTen(userDetails.getTen());
		updateUser.setNamsinh(userDetails.getNamsinh());
		nguoiDungRepo.save(updateUser);
		
		System.out.println("Cập nhật thành công thông tin người dùng có id là " +mand +":\n" +gson.toJson(updateUser));
		return ResponseEntity.ok().body(updateUser);
		//sửa trong psotman dùng put, body-raw và chuyển text -> json
	}
}
