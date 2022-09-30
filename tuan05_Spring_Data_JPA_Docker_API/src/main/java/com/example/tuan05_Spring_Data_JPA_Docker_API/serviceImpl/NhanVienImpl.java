package com.example.tuan05_Spring_Data_JPA_Docker_API.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.NhanVien;
import com.example.tuan05_Spring_Data_JPA_Docker_API.repositories.NhanVienRepo;
import com.example.tuan05_Spring_Data_JPA_Docker_API.services.NhanVienService;

@Service
public class NhanVienImpl implements NhanVienService{
	
	@Autowired
	private NhanVienRepo nhanVienRepo;

	@Override
	public List<NhanVien> luongNvNhoHon10k() {
		return nhanVienRepo.finNhanViensByLuong();
	}

	@Override
	public Long tongLuongNV() {
		return nhanVienRepo.sumLuongNV();
	}

	@Override
	public List<NhanVien> timMaPhiCongLaiBoeing() {
		return nhanVienRepo.findMaPhiCongsLaiBoeing();
	}

	@Override
	public List<NhanVien> timPhiCongLaiMaMB747() {
		return nhanVienRepo.findPhiCongsLaiMayBayByMa();
	}
	
}
