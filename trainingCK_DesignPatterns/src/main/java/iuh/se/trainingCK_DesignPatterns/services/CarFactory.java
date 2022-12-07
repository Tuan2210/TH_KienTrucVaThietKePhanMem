package iuh.se.trainingCK_DesignPatterns.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

//link yt: https://www.youtube.com/watch?v=gd3Pg0fAcjI&t=36s
//link github: https://github.com/thakarea/FactoryDesignPattern

//Đề show info car dùng factory pattern trong file TUAN08-09-10_KIEN TRUC VA THIET KE PHAN MEM_DESIGN PATTERNS.pdf

@Service
public class CarFactory {
	public static final String HONDA = "honda-car";
	public static final String NEXUS = "nexus-car";
	public static final String TOYOTA = "toyota-car";
	
	@Autowired
	private HondaServices hondaServices;
	@Autowired
	private NexusServices nexusServices;
	@Autowired
	private ToyotaServices toyotaServices;
	
	private static final Map<String, CarServices> handler = new HashMap<String, CarServices>();
	
	@PostConstruct
	private Map<String, CarServices> getListObj() {
		handler.put(HONDA, hondaServices);
		handler.put(NEXUS, nexusServices);
		handler.put(TOYOTA, toyotaServices);
		return handler;
	}
	
	public static CarServices createInstance(String carName) throws Exception {
		return Optional.ofNullable(handler.get(carName)).orElseThrow(() -> new IllegalArgumentException("Không tìm thấy loại xe hơi này!"));
	}
}
