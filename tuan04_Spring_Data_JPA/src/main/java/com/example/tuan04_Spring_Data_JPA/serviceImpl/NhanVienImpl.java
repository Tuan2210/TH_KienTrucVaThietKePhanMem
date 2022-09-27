package com.example.tuan04_Spring_Data_JPA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan04_Spring_Data_JPA.entities.NhanVien;
import com.example.tuan04_Spring_Data_JPA.repositories.NhanVienRepo;
import com.example.tuan04_Spring_Data_JPA.services.NhanVienService;

@Service
public class NhanVienImpl implements NhanVienService{
	
	@Autowired
	private NhanVienRepo nhanVienRepo;

	@Override
	public List<NhanVien> luongNvNhoHon10k() {
		return nhanVienRepo.finNhanViensByLuong();
	}
	
}
