package com.example.tuan06_Springboot_JPA_API_Docker_Server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.ChuyenBay;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.services.ChuyenBayService;


@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
    private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBays() {
		return chuyenBayService.listChuyenBay();
	}
	
	@GetMapping("/chuyenbay/gaden:{gaDen}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable("gaDen") String gaden) {
//		List<ChuyenBay> chuyenBays = chuyenBayService.chuyenBayGaDen(gaden);
//		return chuyenBays;
		return chuyenBayService.chuyenBayGaDen(gaden);
		
	}
	
	@GetMapping("/chuyenbay/8kKm<dodai<10kKm")
	public List<ChuyenBay> findChuyenBaysByDoDai(){
		return chuyenBayService.doDaiNhoHon10kVaLonHon8k();
	}
	
	@GetMapping("/chuyenbay/xuatphat:{gaDi}-{gaDen}")
	public List<ChuyenBay> findCBXuatPhat(@PathVariable("gaDi") String gadi, @PathVariable("gaDen") String gaden){
		return chuyenBayService.chuyenBaySgDenBmt(gadi, gaden);
	}
	
	@GetMapping("/chuyenbay/sochuyenbay:{gaDi}")
	public Integer countChuyenBayByGaDen(@PathVariable("gaDi") String gadi) {
		return chuyenBayService.countChuyenBayTuSG(gadi);
		
	}

}
