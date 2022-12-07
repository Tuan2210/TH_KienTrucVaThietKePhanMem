package iuh.se.trainingCK_DesignPatterns.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import iuh.se.trainingCK_DesignPatterns.entities.Nexus;
import iuh.se.trainingCK_DesignPatterns.repositories.NexusRepo;

@Component
public class NexusServices implements CarServices{
	
	@Autowired
	private NexusRepo nexusRepo;
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	@Override
	public String loadCarList() {
		List<Nexus> listNexus = nexusRepo.findAll();
		System.out.println("List nexus: \n" +gson.toJson(listNexus));
		return gson.toJson(listNexus);
	}

}
