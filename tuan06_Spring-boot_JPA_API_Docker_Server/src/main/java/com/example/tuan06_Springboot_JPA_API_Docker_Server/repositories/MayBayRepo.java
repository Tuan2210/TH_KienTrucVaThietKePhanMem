package com.example.tuan06_Springboot_JPA_API_Docker_Server.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.MayBay;



@Repository
public interface MayBayRepo extends JpaRepository<MayBay, String>{
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.maybay where TamBay > 10000;", nativeQuery = true)
//	@Query(value = "SELECT * FROM kttkpm_qlchuyenbay_db.maybay where TamBay > 10000;", nativeQuery = true)
	public List<MayBay> findMayBaysByTamBay();
	
	@Query(value = "SELECT count(*) FROM lab4_kttkpm_quanlychuyenbay_db.maybay where Loai like 'Boeing%';", nativeQuery = true)
//	@Query(value = "SELECT count(*) FROM kttkpm_qlchuyenbay_db.maybay where Loai like 'Boeing%';", nativeQuery = true)
	public Integer countMayBaysByLoaiBoeing();
	
	
}
