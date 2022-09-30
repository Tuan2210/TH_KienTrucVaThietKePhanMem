package com.example.tuan04_Spring_Data_JPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan04_Spring_Data_JPA.entities.ChungNhan;
import com.example.tuan04_Spring_Data_JPA.entities.MayBay;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, String>{
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.maybay where TamBay > 10000;", nativeQuery = true)
	public List<MayBay> findMayBaysByTamBay();
	
	@Query(value = "SELECT count(*) FROM lab4_kttkpm_quanlychuyenbay_db.maybay where Loai like 'Boeing%';", nativeQuery = true)
	public Integer countMayBaysByLoaiBoeing();
	
	
}
