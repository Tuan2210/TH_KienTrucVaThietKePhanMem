package com.example.tuan04_Spring_Data_JPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan04_Spring_Data_JPA.entities.ChuyenBay;


@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String> {
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.chuyenbay where GaDen = ?", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByGaDen(String gaDen);
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.chuyenbay where 8000 < DoDai and DoDai < 10000;", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByDoDai();
	
	@Query(value = "SELECT * FROM lab4_kttkpm_quanlychuyenbay_db.chuyenbay where GaDi=? and GaDen=?", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByGaDiVaGaDen(String gaDi, String gaDen);
	
	@Query(value = "SELECT count(*) FROM lab4_kttkpm_quanlychuyenbay_db.chuyenbay where GaDi=?", nativeQuery = true)
	public Integer countChuyenBayFromGaDi(String gaDi);
}
