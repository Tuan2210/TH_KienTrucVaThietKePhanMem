package com.example.tuan07_Springboot_RestTemplate_API_Docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan07_Springboot_RestTemplate_API_Docker.entities.ChuyenBay;
import com.example.tuan07_Springboot_RestTemplate_API_Docker.repositories.ChuyenBayRepo;
//import com.example.tuan07_Springboot_RestTemplate_API_Docker.servicesImpl.ChuyenBayImpl;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	
//	@Autowired
//    private ChuyenBayImpl chuyenBayImpl;
	
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBays() {
//		return chuyenBayImpl.listChuyenBay();
		return chuyenBayRepo.findAll();
	}
	
	@GetMapping("/chuyenbay/gaden:{gaDen}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable("gaDen") String gaden) {
//		return chuyenBayImpl.chuyenBayGaDen(gaden);
		return chuyenBayRepo.findChuyenBaysByGaDen(gaden);
		
	}
	
	@GetMapping("/chuyenbay/8kKm<dodai<10kKm")
	public List<ChuyenBay> findChuyenBaysByDoDai(){
//		return chuyenBayImpl.doDaiNhoHon10kVaLonHon8k();
		return chuyenBayRepo.findChuyenBaysByDoDai();
	}
	
	@GetMapping("/chuyenbay/xuatphat:{gaDi}-{gaDen}")
	public List<ChuyenBay> findCBXuatPhat(@PathVariable("gaDi") String gadi, @PathVariable("gaDen") String gaden){
//		return chuyenBayImpl.chuyenBaySgDenBmt(gadi, gaden);
		return chuyenBayRepo.findChuyenBaysByGaDiVaGaDen(gadi, gaden);
	}
	
	@GetMapping("/chuyenbay/sochuyenbay:{gaDi}")
	public Integer countChuyenBayByGaDen(@PathVariable("gaDi") String gadi) {
//		return chuyenBayImpl.countChuyenBayTuSG(gadi);
		return chuyenBayRepo.countChuyenBayFromGaDi(gadi);
	}

}
