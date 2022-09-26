package com.example.tuan04_Spring_Data_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tuan04_Spring_Data_JPA.serviceImpl.ChuyenBayImpl;

@SpringBootTest
class Tuan04SpringDataJpaApplicationTests {

	@Autowired
	private ChuyenBayImpl chuyenBayImpl;

	@Test
	void chuyenBayDenDAD() {
		System.out.println("/////// \nCâu 1: các chuyến bay đến Đà Lạt");
		chuyenBayImpl.chuyenBayDenDAD("DAD").forEach(chuyenBay -> {
			System.out.println(chuyenBay.toString());
		});
		System.out.println("///////");
	}

}
