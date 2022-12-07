package iuh.se.trainingCK_DesignPatterns.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import iuh.se.trainingCK_DesignPatterns.entities.Honda;
import iuh.se.trainingCK_DesignPatterns.repositories.HondaRepo;

@Component
public class HondaServices implements CarServices{
	
	@Autowired
	private HondaRepo hondaRepo;
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@Override
	public String loadCarList() {
		List<Honda> listHondas = hondaRepo.findAll();
		System.out.println("List honda: \n" +gson.toJson(listHondas));
		return gson.toJson(listHondas);
	}

}
