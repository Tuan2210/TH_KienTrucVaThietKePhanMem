package com.example.tuan4_Spring_Data_JPA.services;

import org.springframework.transaction.annotation.Transactional;

import com.example.tuan4_Spring_Data_JPA.repositories.ChuyenBayRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ChuyenBayService {
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	public ChuyenBayRepo getChuyenBayRepo() {
		return chuyenBayRepo;
	}
	
	public void getAllChuyenBayRepo() {
		chuyenBayRepo.findAll().forEach(System.out::println);
	}
	
	public void ChuyenBayDenDAD(){
		chuyenBayRepo.findChuyenBaysByGaDen().forEach(System.out::println);
	}
	
}
