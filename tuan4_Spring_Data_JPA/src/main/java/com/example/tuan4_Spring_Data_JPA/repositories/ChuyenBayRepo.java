package com.example.tuan4_Spring_Data_JPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan4_Spring_Data_JPA.entities.ChuyenBay;

@Repository
public interface ChuyenBayRepo extends JpaRepository<ChuyenBay, String>{
	@Query(value = "select * from chuyenbay where GaDen = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> findChuyenBaysByGaDen();
}
