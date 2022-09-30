package com.example.tuan05_Spring_Data_JPA_Docker_API.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.MayBay;
import com.example.tuan05_Spring_Data_JPA_Docker_API.repositories.MayBayRepo;
import com.example.tuan05_Spring_Data_JPA_Docker_API.services.MayBayService;

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
