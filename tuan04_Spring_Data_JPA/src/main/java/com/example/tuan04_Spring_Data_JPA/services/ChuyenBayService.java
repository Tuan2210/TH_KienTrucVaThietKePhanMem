package com.example.tuan04_Spring_Data_JPA.services;


import com.example.tuan04_Spring_Data_JPA.entities.ChuyenBay;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ChuyenBayService {
	
	//1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> chuyenBayDenDAD(String gaDen);
	
	//4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
	public List<ChuyenBay> doDaiNhoHon10kVaLonHon8k();
	
}
