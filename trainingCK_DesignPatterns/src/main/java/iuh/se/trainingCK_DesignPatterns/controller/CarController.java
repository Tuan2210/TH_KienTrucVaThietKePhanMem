package iuh.se.trainingCK_DesignPatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.se.trainingCK_DesignPatterns.services.CarFactory;
import iuh.se.trainingCK_DesignPatterns.services.CarServices;

@RestController
@RequestMapping("/api")
public class CarController {

	@GetMapping("/factory_patterns/car/{carName}")
	public String getInfoCar(@PathVariable("carName") String carName) throws Exception {

		CarServices carFactory = CarFactory.createInstance(carName);
		return carFactory.loadCarList();

	}

}
