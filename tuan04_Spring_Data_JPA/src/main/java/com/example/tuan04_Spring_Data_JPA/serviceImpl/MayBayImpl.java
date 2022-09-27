package com.example.tuan04_Spring_Data_JPA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan04_Spring_Data_JPA.entities.MayBay;
import com.example.tuan04_Spring_Data_JPA.repositories.MayBayRepo;
import com.example.tuan04_Spring_Data_JPA.services.MayBayService;

@Service
public class MayBayImpl implements MayBayService{
	
	@Autowired
	private MayBayRepo mayBayRepo;

	@Override
	public List<MayBay> tamBayMBHon10kKm() {
		return mayBayRepo.findMayBaysByTamBay();
	}
}
