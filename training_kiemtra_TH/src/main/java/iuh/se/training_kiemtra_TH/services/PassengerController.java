package iuh.se.training_kiemtra_TH.services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/passengerservice")
public class PassengerController {
	
	@Autowired
	private PassengerServices passengerServices;
	
//	@Autowired
//	private PassengerRepository passengerRepository;
	
	@GetMapping("/passengers")
	public List<Passenger> listPassengers() {
		return passengerServices.listPassengers();
	}
	
	@GetMapping("/passenger/{id}")
	public Optional<Passenger> findPassengerById(@PathVariable("id") String passId) {
		return passengerServices.findPassengerById(passId);
	}
	
	@PostMapping("/passenger/add")
	public Passenger addPassenger(@RequestBody Passenger passenger) {
		return passengerServices.addPassenger(passenger);
	}
	
	@PutMapping("/passenger/{id}")
	public void updatePassenger(@PathVariable("id") String passId, @RequestBody Passenger passengerDetails) {
//		Optional<Passenger> passenger = passengerRepository.findById(passId);

//		passenger.setName(passengerDetails.getName());
//		passenger.setAddress(passengerDetails.getAddress());

		Passenger passengerUpdated = new Passenger(passId, passengerDetails.getName(), passengerDetails.getAddress());
//		passengerRepository.save(passengerUpdated);
		passengerServices.updatePassenger(passengerUpdated);
	}
	
	@DeleteMapping("/passenger/{id}")
	public void  deletePassenger(@PathVariable("id") String passId) {
		passengerServices.deletePassenger(passId);
	}
	
	////// Controller for redis-cache
	@GetMapping("/rediscache/passengers")
	public Map<String, Passenger> redisFindAll() {
		return passengerServices.redisFindAll();
	}
	@GetMapping("/rediscache/passenger/{id}")
	public Passenger redisFindById(@PathVariable("id") String passId) {
		return passengerServices.redisFindById(passId);
	}
	@PostMapping("/rediscache/passenger/add")
	public Passenger redisAdd(@RequestBody Passenger passenger) {
		return passengerServices.redisAdd(passenger);
	}
	@PutMapping("/rediscache/passenger/{id}")
	public void redisUpate(@PathVariable("id") String passId, @RequestBody Passenger passengerDetails) {
		passengerServices.redisUpate(passengerDetails);
	}
	@DeleteMapping("/rediscache/passenger/{id}")
	public void  redisDelete(@PathVariable("id") String passId) {
		passengerServices.redisDelete(passId);
	}
		
}
