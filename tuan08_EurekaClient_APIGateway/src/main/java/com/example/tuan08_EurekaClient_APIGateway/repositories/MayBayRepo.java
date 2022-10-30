package com.example.tuan08_EurekaClient_APIGateway.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.tuan08_EurekaClient_APIGateway.entities.MayBay;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, String>{
	
	@Query(value = "SELECT * FROM maybay where TamBay > 10000;", nativeQuery = true)
	public List<MayBay> findMayBaysByTamBay();
	
	@Query(value = "SELECT count(*) FROM maybay where Loai like 'Boeing%';", nativeQuery = true)
	public Integer countMayBaysByLoaiBoeing();
	
	
}
