package iuh.se.trainingCK_DesignPatterns.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import iuh.se.trainingCK_DesignPatterns.entities.Toyota;
import iuh.se.trainingCK_DesignPatterns.repositories.ToyotaRepo;

@Component
public class ToyotaServices implements CarServices {
	
	@Autowired
	private ToyotaRepo toyotaRepo;

	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@Override
	public String loadCarList() {
		List<Toyota> listToyotas = toyotaRepo.findAll();
		System.out.println("List toyota: \n" +gson.toJson(listToyotas));
		return gson.toJson(listToyotas);
	}

}
