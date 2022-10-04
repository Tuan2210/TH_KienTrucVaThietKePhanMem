package com.example.tuan06_Springboot_JPA_API_Docker_Server.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.MayBay;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.repositories.MayBayRepo;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.services.MayBayService;


@Service
public class MayBayImpl implements MayBayService{
	
	@Autowired
	private MayBayRepo mayBayRepo;

	@Override
	public List<MayBay> tamBayMBHon10kKm() {
		return mayBayRepo.findMayBaysByTamBay();
	}

	@Override
	public Integer soLoaiMayBayBoeing() {
		return mayBayRepo.countMayBaysByLoaiBoeing();
	}

	
}
