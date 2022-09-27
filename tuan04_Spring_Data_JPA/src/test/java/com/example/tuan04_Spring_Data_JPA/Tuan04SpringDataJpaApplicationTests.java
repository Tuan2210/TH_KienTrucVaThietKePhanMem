package com.example.tuan04_Spring_Data_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tuan04_Spring_Data_JPA.serviceImpl.ChuyenBayImpl;
import com.example.tuan04_Spring_Data_JPA.serviceImpl.MayBayImpl;

@SpringBootTest
class Tuan04SpringDataJpaApplicationTests {

	@Autowired
	private ChuyenBayImpl chuyenBayImpl;
	@Autowired
	private MayBayImpl mayBayImpl;

//	@Test
//	void chuyenBayDenDAD() {
//		System.out.println("/////// \nCâu 1: các chuyến bay đến Đà Lạt");
//		chuyenBayImpl.chuyenBayDenDAD("DAD").forEach(chuyenBay -> {
//			System.out.println(chuyenBay.toString());
//		});
//		System.out.println("///////");
//	}
	
	@Test
	void tamBayMBHon10kKm() {
		System.out.println("/////// \nCâu 2: các loại máy bay có tầm bay lớn hơn 10,000km");
		mayBayImpl.tamBayMBHon10kKm().forEach(mayBay -> {
			System.out.println(mayBay.toString());
		});
		System.out.println("///////");
	}

}
