package com.example.tuan07_Springboot_RestTemplate_API_Docker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan07_Springboot_RestTemplate_API_Docker.entities.MayBay;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, String>{
	
	@Query(value = "SELECT * FROM maybay where TamBay > 10000;", nativeQuery = true)
//	@Query(value = "SELECT * FROM kttkpm_qlchuyenbay_db.maybay where TamBay > 10000;", nativeQuery = true)
	public List<MayBay> findMayBaysByTamBay();
	
	@Query(value = "SELECT count(*) FROM maybay where Loai like 'Boeing%';", nativeQuery = true)
//	@Query(value = "SELECT count(*) FROM kttkpm_qlchuyenbay_db.maybay where Loai like 'Boeing%';", nativeQuery = true)
	public Integer countMayBaysByLoaiBoeing();
	
	
}
