package com.example.tuan05_Spring_Data_JPA_Docker_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.ChuyenBay;
import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.MayBay;
import com.example.tuan05_Spring_Data_JPA_Docker_API.services.MayBayService;

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
}
