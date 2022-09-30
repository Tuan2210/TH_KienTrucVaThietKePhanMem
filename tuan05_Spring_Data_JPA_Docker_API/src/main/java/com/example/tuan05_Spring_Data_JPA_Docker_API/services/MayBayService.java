package com.example.tuan05_Spring_Data_JPA_Docker_API.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.MayBay;

@Service
public interface MayBayService {
	
	//2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
	public List<MayBay> tamBayMBHon10kKm();
	
	//7. Có bao nhiêu loại máy bay Boeing
	public Integer soLoaiMayBayBoeing();
	
	
}
