package com.example.tuan09_Springboot_RedisTemplate_API_Docker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan09_Springboot_RedisTemplate_API_Docker.entities.MayBay;
import com.example.tuan09_Springboot_RedisTemplate_API_Docker.repositories.MayBayRepo;

@RestController
@RequestMapping("/api/redistemplate")
public class MayBayController {
	@Autowired
	private MayBayRepo mayBayRepo;
	
	@GetMapping("/maybay/tambayhon10000km")
	public List<MayBay> findTamBayMbHon10k() {
		return mayBayRepo.findMayBaysByTamBay();
	}
	
	@GetMapping("/maybay/somaybayBoeing")
	public Integer countMayBayBoeig() {
		return mayBayRepo.countMayBaysByLoaiBoeing();
	}
}
