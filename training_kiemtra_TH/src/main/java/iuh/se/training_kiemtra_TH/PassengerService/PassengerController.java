package iuh.se.training_kiemtra_TH.PassengerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/passengerservice")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@GetMapping("/passengers")
	public List<Passenger> listPassengers() {
		return passengerService.listPassengers();
	}
}
