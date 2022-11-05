package iuh.se.training_kiemtra_TH.discovery;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import iuh.se.training_kiemtra_TH.services.Billing;
import iuh.se.training_kiemtra_TH.services.BillingRepository;
import iuh.se.training_kiemtra_TH.services.Passenger;
import iuh.se.training_kiemtra_TH.services.PassengerRepository;

@Service
public class DiscoveryService {

	@Autowired
	private BillingRepository billingRepository;
	@Autowired
	private PassengerRepository passengerRepository;
//	@Autowired
//	private RestTemplate restTemplate;
	
	public List<Billing> discoveryListBillings() {
		return billingRepository.findAll();
	}
	
//	public ResponseTemplateDTO getBillingWithPassenger(String billId) {
////		Object objBilling = billingRepository.findById(billId); //not working
//		Billing billing = billingRepository.findBillingById(billId); //use query mysql
//		
//		//error no instance for localhost?
//		Passenger passenger = restTemplate.getForObject("http://localhost:8081/api/discoveryservice/passenger/" +billing.getPassengerId(), Passenger.class);
//		
//		//call API eureka-client (error not contain this URL?)
////		Passenger passenger = restTemplate.getForObject("http://training_kiemtra_TH_EurekaClient_APIGateway/api/discoveryservice/passenger/" +billing.getPassengerId(), Passenger.class);
//		
//		return new ResponseTemplateDTO(billing, passenger);
//	}
	
	//find billing not include passenger - eureka-client
	public Object eurekaFindBillingById(String billId) {
		return billingRepository.findById(billId);
	}
	
	public List<Passenger> discoveryListPassengers() {
		return passengerRepository.findAll();
	}
	
	public Object eurekaFindPassengerById(String passId) {
		return passengerRepository.findById(passId);
	}
	
}
