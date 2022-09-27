package com.example.tuan04_Spring_Data_JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.tuan04_Spring_Data_JPA.serviceImpl.ChuyenBayImpl;
import com.example.tuan04_Spring_Data_JPA.serviceImpl.MayBayImpl;
import com.example.tuan04_Spring_Data_JPA.serviceImpl.NhanVienImpl;

@SpringBootTest
class Tuan04SpringDataJpaApplicationTests {

	@Autowired
	private ChuyenBayImpl chuyenBayImpl;
	@Autowired
	private MayBayImpl mayBayImpl;
	@Autowired
	private NhanVienImpl nhanVienImpl;

//	@Test
//	void chuyenBayDenDAD() {
//		System.out.println("/////// \nCâu 1: các chuyến bay đến Đà Lạt");
//		chuyenBayImpl.chuyenBayDenDAD("DAD").forEach(chuyenBay -> {
//			System.out.println(chuyenBay.toString());
//		});
//		System.out.println("///////");
//	}
	
//	@Test
//	void tamBayMBHon10kKm() {
//		System.out.println("/////// \nCâu 2: các loại máy bay có tầm bay lớn hơn 10,000km");
//		mayBayImpl.tamBayMBHon10kKm().forEach(mayBay -> {
//			System.out.println(mayBay.toString());
//		});
//		System.out.println("///////");
//	}
	
	@Test
	void luongNvNhoHon10k() {
		System.out.println("/////// \nCâu 3: các nhân viên có lương nhỏ hơn 10,000");
		nhanVienImpl.luongNvNhoHon10k().forEach(nhanVien -> {
			System.out.println(nhanVien.toString());
		});
		System.out.println("///////");
	}

}
