package com.example.tuan09_Springboot_RedisTemplate_API_Docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities.ChuyenBay;
import com.example.tuan09_Springboot_RedisTemplate_API_Docker.repositories.ChuyenBayRepo;


@RestController
@RequestMapping("/api/redistemplate")
public class ChuyenBayController {
	
	@Autowired
	private ChuyenBayRepo chuyenBayRepo;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBays() {
		return chuyenBayRepo.findAll();
	}
	
	@GetMapping("/chuyenbay/gaden:{gaDen}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable("gaDen") String gaden) {
		return chuyenBayRepo.findChuyenBaysByGaDen(gaden);
		
	}
	
	@GetMapping("/chuyenbay/8kKm<dodai<10kKm")
	public List<ChuyenBay> findChuyenBaysByDoDai(){
		return chuyenBayRepo.findChuyenBaysByDoDai();
	}
	
	@GetMapping("/chuyenbay/xuatphat:{gaDi}-{gaDen}")
	public List<ChuyenBay> findCBXuatPhat(@PathVariable("gaDi") String gadi, @PathVariable("gaDen") String gaden){
		return chuyenBayRepo.findChuyenBaysByGaDiVaGaDen(gadi, gaden);
	}
	
	@GetMapping("/chuyenbay/sochuyenbay:{gaDi}")
	public Integer countChuyenBayByGaDen(@PathVariable("gaDi") String gadi) {
		return chuyenBayRepo.countChuyenBayFromGaDi(gadi);
	}

}
