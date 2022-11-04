package iuh.se.training_kiemtra_TH.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BillingServices {

	@Autowired
	private BillingRepository billingRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Billing> listBillings() {
		return billingRepository.findAll();
	}
	
	public ResponseTemplateDTO getBillingWithPassenger(String billId) {
//		Object objBilling = billingRepository.findById(billId); //not working
		Billing billing = billingRepository.findBillingById(billId); //use query mysql
		
		Passenger passenger = restTemplate.getForObject("http://localhost:8081/api/passengerservice/passenger/" +billing.getPassengerId(), Passenger.class);
		
		return new ResponseTemplateDTO(billing, passenger);
	}
}
