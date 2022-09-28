package com.example.tuan04_Spring_Data_JPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan04_Spring_Data_JPA.entities.NhanVien;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVien, String>{
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.nhanvien where Luong < 10000;", nativeQuery = true)
	public List<NhanVien> finNhanViensByLuong();
	
	@Query(value = "SELECT sum(Luong) FROM lab4_kttkpm_quanlychuyenbay_db.nhanvien;", nativeQuery = true)
	public Long sumLuongNV();
}
