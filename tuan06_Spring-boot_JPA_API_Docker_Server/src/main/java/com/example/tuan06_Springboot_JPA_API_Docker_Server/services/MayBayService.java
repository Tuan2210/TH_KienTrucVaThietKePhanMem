package com.example.tuan06_Springboot_JPA_API_Docker_Server.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.MayBay;


@Service
public interface MayBayService {
	
	//2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
	public List<MayBay> tamBayMBHon10kKm();
	
	//7. Có bao nhiêu loại máy bay Boeing
	public Integer soLoaiMayBayBoeing();
	
	
}
