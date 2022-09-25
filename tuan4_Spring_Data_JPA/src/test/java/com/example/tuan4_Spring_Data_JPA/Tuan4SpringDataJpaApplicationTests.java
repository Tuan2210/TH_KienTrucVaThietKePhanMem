package com.example.tuan4_Spring_Data_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tuan4_Spring_Data_JPA.services.ChuyenBayService;
import com.example.tuan4_Spring_Data_JPA.services.MayBayService;
import com.example.tuan4_Spring_Data_JPA.services.NhanVienService;

@SpringBootTest
class Tuan4SpringDataJpaApplicationTests {
	@Autowired
	ChuyenBayService chuyenBayService;
	
	@Autowired
	MayBayService mayBayService;
	
	@Autowired
	NhanVienService nhanVienService;
	
	@Test
	void CacChuyenBayDiDAD() {
		System.out.println("Câu 1: \n");
		chuyenBayService.ChuyenBayDenDAD();
	}
	
	
}
