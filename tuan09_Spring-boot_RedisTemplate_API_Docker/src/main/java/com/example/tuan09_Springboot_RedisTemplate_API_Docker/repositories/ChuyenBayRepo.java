package com.example.tuan09_Springboot_RedisTemplate_API_Docker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities.ChuyenBay;


@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String> {
	
//	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.chuyenbay", nativeQuery = true)
//	public List<ChuyenBay> findAllChuyenBays(); //vì class ChuyenBayImpl return chuyenBayRepo.findAll();
	
	@Query(value = "SELECT * FROM chuyenbay where GaDen = ?", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByGaDen(String gaDen);
	
	@Query(value = "SELECT * FROM chuyenbay where 8000 < DoDai and DoDai < 10000;", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByDoDai();
	
	@Query(value = "SELECT * FROM chuyenbay where GaDi=? and GaDen=?", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByGaDiVaGaDen(String gaDi, String gaDen);
	
	@Query(value = "SELECT count(*) FROM chuyenbay where GaDi=?", nativeQuery = true)
	public Integer countChuyenBayFromGaDi(String gaDi);
}
