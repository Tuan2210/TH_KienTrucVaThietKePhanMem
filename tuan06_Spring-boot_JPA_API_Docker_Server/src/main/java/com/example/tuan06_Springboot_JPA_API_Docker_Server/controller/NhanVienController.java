package com.example.tuan06_Springboot_JPA_API_Docker_Server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.NhanVien;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.services.NhanVienService;


@RestController
@RequestMapping("/api")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/nhanvien/luongnhohon10k")
	public List<NhanVien> findNvLuongNhoHon10k() {
//		List<NhanVien> nhanViens = nhanVienService.luongNvNhoHon10k();
//		return nhanViens;
		return nhanVienService.luongNvNhoHon10k();
	}
	
	@GetMapping("/nhanvien/tongluong")
	public Long countTongLuong() {
		return nhanVienService.tongLuongNV();
	}
	
	@GetMapping("/nhanvien/phiconglaiBoeing")
	public List<NhanVien> findPhiCongLaiBoeing() {
		return nhanVienService.timMaPhiCongLaiBoeing();
	}
	
	@GetMapping("/nhanvien/phicong/maMaybay747")
	public List<NhanVien> findPhiCongLaiMaMayBay747() {
		return nhanVienService.timPhiCongLaiMaMB747();
	}
	
}
