package iuh.se.training_kiemtra_TH.PassengerService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServices {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public List<Passenger> listPassengers() {
		return passengerRepository.findAll();
	}
	
	public Optional<Passenger> findPassengerById(String passId) {
		return passengerRepository.findById(passId);
	}
	
	public Passenger addPassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
}
