package iuh.se.training_kiemtra_TH.PassengerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	public List<Passenger> listPassengers() {
		return passengerRepository.findAll();
	}
}
