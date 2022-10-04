package com.example.tuan06_Springboot_JPA_API_Docker_Server.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.ChuyenBay;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.repositories.ChuyenBayRepo;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.services.ChuyenBayService;
//import org.springframework.transaction.annotation.Transactional;


@Service
public class ChuyenBayImpl implements ChuyenBayService {
	
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	@Override
	public List<ChuyenBay> listChuyenBay() {
		return chuyenBayRepo.findAll();
	}
	
	@Override
	public List<ChuyenBay> chuyenBayGaDen(String gaDen) {
		return chuyenBayRepo.findChuyenBaysByGaDen(gaDen);
	}

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
