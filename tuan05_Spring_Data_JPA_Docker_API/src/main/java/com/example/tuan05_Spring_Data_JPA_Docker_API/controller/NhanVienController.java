package com.example.tuan05_Spring_Data_JPA_Docker_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.NhanVien;
import com.example.tuan05_Spring_Data_JPA_Docker_API.services.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/nhanvien/luongnhohon10k")
	public List<NhanVien> findNvLuongNhoHon10k() {
		List<NhanVien> nhanViens = nhanVienService.luongNvNhoHon10k();
		return nhanViens;
	}
}
