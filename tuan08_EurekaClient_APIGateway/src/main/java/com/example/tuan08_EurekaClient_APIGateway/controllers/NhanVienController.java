package com.example.tuan08_EurekaClient_APIGateway.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan08_EurekaClient_APIGateway.entities.NhanVien;
import com.example.tuan08_EurekaClient_APIGateway.repositories.NhanVienRepo;


@RestController
@RequestMapping("/api")
public class NhanVienController {
	
	@Autowired
	private NhanVienRepo nhanVienRepo;
	
	@GetMapping("/nhanvien/luongnhohon10k")
	public List<NhanVien> findNvLuongNhoHon10k() {
		return nhanVienRepo.findNhanViensByLuong();
	}
	
	@GetMapping("/nhanvien/tongluong")
	public Long countTongLuong() {
		return nhanVienRepo.sumLuongNV();
	}
	
	@GetMapping("/nhanvien/phiconglaiBoeing")
	public List<NhanVien> findPhiCongLaiBoeing() {
		return nhanVienRepo.findMaPhiCongsLaiBoeing();
	}
	
	@GetMapping("/nhanvien/phicong/maMaybay747")
	public List<NhanVien> findPhiCongLaiMaMayBay747() {
		return nhanVienRepo.findPhiCongsLaiMayBayByMa();
	}
	
}
