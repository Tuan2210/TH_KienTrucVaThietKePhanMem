package com.example.tuan05_Spring_Data_JPA_Docker_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan05_Spring_Data_JPA_Docker_API.entities.ChuyenBay;
import com.example.tuan05_Spring_Data_JPA_Docker_API.services.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	@Autowired
    private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenbay")
	public List<ChuyenBay> listChuyenBays() {
		return chuyenBayService.listChuyenBay();
	}
	
	@GetMapping("/chuyenbay/{gaDen}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable("gaDen") String gaden) {
		List<ChuyenBay> chuyenBays = chuyenBayService.chuyenBayGaDen(gaden);
		return chuyenBays;
	}

}
