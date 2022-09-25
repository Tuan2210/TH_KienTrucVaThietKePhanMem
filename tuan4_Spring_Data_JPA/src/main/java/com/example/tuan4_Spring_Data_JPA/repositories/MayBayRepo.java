package com.example.tuan4_Spring_Data_JPA.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tuan4_Spring_Data_JPA.entities.MayBay;

@Repository
public interface MayBayRepo extends JpaRepository<MayBay, Integer>{
	
	
}
