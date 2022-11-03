package iuh.se.training_kiemtra_TH.PassengerService;

import java.util.List;
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
}
