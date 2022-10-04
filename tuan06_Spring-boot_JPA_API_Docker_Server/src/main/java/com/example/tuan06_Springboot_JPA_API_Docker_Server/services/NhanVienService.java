package com.example.tuan06_Springboot_JPA_API_Docker_Server.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.NhanVien;


@Service
public interface NhanVienService {
	
	//3. Tìm các nhân viên có lương nhỏ hơn 10,000
	public List<NhanVien> luongNvNhoHon10k();
	
	//8. Cho biết tổng số lương phải trả cho các nhân viên
	public Long tongLuongNV();
	
	//9. Cho biết mã số của các phi công lái máy báy Boeing.
	public List<NhanVien> timMaPhiCongLaiBoeing();
	
	//10. Cho biết các nhân viên có thể lái máy bay có mã số 747
	public List<NhanVien> timPhiCongLaiMaMB747();
}
