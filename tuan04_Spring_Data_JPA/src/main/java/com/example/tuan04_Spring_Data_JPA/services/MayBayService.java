package com.example.tuan04_Spring_Data_JPA.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan04_Spring_Data_JPA.entities.MayBay;

@Service
public interface MayBayService {
	
	//2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
	public List<MayBay> tamBayMBHon10kKm();
}
