package com.example.tuan04_Spring_Data_JPA.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.example.tuan04_Spring_Data_JPA.entities.ChuyenBay;
import com.example.tuan04_Spring_Data_JPA.repositories.ChuyenBayRepo;
import com.example.tuan04_Spring_Data_JPA.services.ChuyenBayService;

@Service
public class ChuyenBayImpl implements ChuyenBayService {
	
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;

//	@Transactional
	@Override
	public List<ChuyenBay> chuyenBayDenDAD(String gaDen) {
		return chuyenBayRepo.findChuyenBaysByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> doDaiNhoHon10kVaLonHon8k() {
		return chuyenBayRepo.findChuyenBaysByDoDai();
	}

	@Override
	public List<ChuyenBay> chuyenBaySgDenBmt(String gaDi, String gaDen) {
		return chuyenBayRepo.findChuyenBaysByGaDiVaGaDen(gaDi, gaDen);
	}

	@Override
	public Integer countChuyenBayTuSG(String gaDi) {
		return chuyenBayRepo.countChuyenBayFromGaDi(gaDi);
	}

	


}
