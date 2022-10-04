package com.example.tuan06_Springboot_JPA_API_Docker_Server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan06_Springboot_JPA_API_Docker_Server.entities.MayBay;
import com.example.tuan06_Springboot_JPA_API_Docker_Server.services.MayBayService;


@RestController
@RequestMapping("/api")
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/maybay/tambayhon10000km")
	public List<MayBay> findTamBayMbHon10k() {
		List<MayBay> mayBays = mayBayService.tamBayMBHon10kKm();
		return mayBays;
	}
	
	@GetMapping("/maybay/somaybayBoeing")
	public Integer countMayBayBoeig() {
		return mayBayService.soLoaiMayBayBoeing();
	}
}
