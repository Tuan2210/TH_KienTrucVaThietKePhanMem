package com.example.tuan05_Spring_Data_JPA_Docker_API.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.ChuyenBay;

@Service
public interface ChuyenBayService {
	
	public List<ChuyenBay> listChuyenBay();
	
	public List<ChuyenBay> chuyenBayGaDen(String gaDen);
	
	//1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	public List<ChuyenBay> chuyenBayDenDAD(String gaDen);
	
	//4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
	public List<ChuyenBay> doDaiNhoHon10kVaLonHon8k();
	
	//5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV)
	public List<ChuyenBay> chuyenBaySgDenBmt(String gaDi, String gaDen);
	
	//6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN)
	public Integer countChuyenBayTuSG(String gaDi);
}
