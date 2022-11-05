package iuh.se.training_kiemtra_TH.discovery;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.se.training_kiemtra_TH.services.Billing;
import iuh.se.training_kiemtra_TH.services.Passenger;

@RestController
@RequestMapping("/api/discoveryservice")
public class DiscoveryController {

	@Autowired
	private DiscoveryService discoveryService;
	
	@GetMapping("/billings")
	public List<Billing> listBillings() {
		return discoveryService.discoveryListBillings();
	}
	
	//eureka-client
	@GetMapping("/billing/{id}")
	public Object eurekaFindBillingById(@PathVariable("id") String billId) {
		return discoveryService.eurekaFindBillingById(billId);
	}
//	public ResponseTemplateDTO getBillingWithPassenger(@PathVariable("id") String billId) {
//		return discoveryService.getBillingWithPassenger(billId);
//	}
	
	@GetMapping("/passengers")
	public List<Passenger> discoveryListPassengers() {
		return discoveryService.discoveryListPassengers();
	}
	
	@GetMapping("/passenger/{id}")
	public Object eurekaFindPassengerById(@PathVariable("id") String passId) {
		return discoveryService.eurekaFindPassengerById(passId);
	}
}
