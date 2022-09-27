package com.example.tuan04_Spring_Data_JPA.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan04_Spring_Data_JPA.entities.NhanVien;

@Service
public interface NhanVienService {
	
	//3. Tìm các nhân viên có lương nhỏ hơn 10,000
	public List<NhanVien> luongNvNhoHon10k();
}